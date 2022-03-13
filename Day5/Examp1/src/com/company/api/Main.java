package com.company.api;

import business.abstracts.BaseCustomerManager;
import business.abstracts.ICustomerService;
import business.concretes.CustomerManager;
import business.concretes.CustomerValidationManager;
import business.concretes.CustomerVerificationManager;
import core.concretes.GoogleLoginAdapter;
import dataAccess.concretes.HibernateCustomerDao;
import entities.concretes.Customer;

public class Main {

    public static void main(String[] args) {

        HibernateCustomerDao hibernateCustomerDao = new HibernateCustomerDao();
        CustomerValidationManager customerValidationManager = new CustomerValidationManager();
        CustomerVerificationManager customerVerificationManager = new CustomerVerificationManager();

        Customer customer1 = new Customer(1, "kaan", "şen", "aasdaa", "123");
        Customer customer2 = new Customer(2, "kaan", "şen", "kaan@gmail.com", "123456");
        Customer customer3 = new Customer(3, "semih", "apul", "semih@gmail.com", "123456");

        //google ile giriş
        BaseCustomerManager googleManager =
                new GoogleLoginAdapter(
                        customerValidationManager,
                        hibernateCustomerDao,
                        customerVerificationManager);

        //normal giriş
        BaseCustomerManager customerManager2 =
                new CustomerManager(
                        customerValidationManager,
                        hibernateCustomerDao,
                        customerVerificationManager);


        //google ile başarılı giriş
        googleManager.register(customer2);
        googleManager.verifyAccount(customer2);
        /*doğrulama mailine tıklama simülasyonu , her halükarda onaylanmış sayacak*/
        googleManager.login(customer2.getEmail(), customer2.getPassword());

        System.out.println("*************");
        //normal kayıt ile başarılı giriş
        customerManager2.register(customer2); // bu email daha önce kullanıldı hatası vermeli
        customerManager2.login(customer2.getEmail(), customer2.getPassword()); /* daha önce bu mail ile 38.satırda
         kayıt olunduğu için giriş yapabilmeli

        */

        System.out.println("************");
        customerManager2.register(customer1); //email hatası verecek kayıt yapmayacak!

        System.out.println("***************");
        //login yaparken Mail Doğrulama hatası vermeli ,
        customerManager2.register(customer3);
        customerManager2.login(customer3.getEmail(), customer3.getPassword());


    }
}

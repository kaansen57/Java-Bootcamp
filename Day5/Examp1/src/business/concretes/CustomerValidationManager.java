package business.concretes;

import business.abstracts.ICustomerValidationService;
import dataAccess.abstracts.IHibernateCustomerDao;
import entities.concretes.Customer;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerValidationManager implements ICustomerValidationService {

    @Override
    public boolean checkEmailFormat(Customer customer) {
        String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(customer.getEmail());
        if (matcher.matches()) {
            return true;
        }
        System.out.println("Geçerli bir email giriniz!");
        return false;
    }

    @Override
    public boolean checkEmailDuplicate(Customer customer, List<Customer> customerList) {
        for (Customer value : customerList) {
            if (customer.getEmail() == value.getEmail()){
                System.out.println("Bu email daha önce kullanıldı");
                return false;
            }
        }
        return true;
    }


    @Override
    public boolean checkPassword(Customer customer) {
        if (customer.getPassword().length() >= 6) {
            return true;
        }
        System.out.println("Parolanız 6 karakterden az");
        return false;
    }

    @Override
    public boolean checkFirstName(Customer customer) {
        if (customer.getFirstName().length() > 1) {
            return true;
        }
        System.out.println("İsminiz 2 karakterden az");
        return false;
    }

    @Override
    public boolean checkLastName(Customer customer) {
        if (customer.getLastName().length() > 1) {
            return true;
        }
        System.out.println("Soyadınız 2 karakterden az!");
        return false;
    }

    @Override
    public boolean allCheck(Customer customer, List<Customer> customerList) {
        return checkEmailFormat(customer)
                && checkEmailDuplicate(customer, customerList)
                && checkPassword(customer)
                && checkFirstName(customer)
                && checkLastName(customer);
    }
}

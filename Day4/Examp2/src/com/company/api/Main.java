package com.company.api;

import com.company.business.concretes.*;
import com.company.entities.concretes.Compaign;
import com.company.entities.concretes.Customer;
import com.company.entities.concretes.Game;
import com.company.entities.concretes.Sale;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Game game = new Game(1, "Metin2", 50);
        GameManager gameManager = new GameManager();
        gameManager.add(game);
        System.out.println("***********");

        Compaign compaign = new Compaign(1, "İlkbahar İndirimi", 10);
        CompaignManager compaignManager = new CompaignManager();
        compaignManager.add(compaign);
        System.out.println("***********");

        CustomerManager customerManager = new CustomerManager(new CustomerCheckManager());
        Customer customer = new Customer(
                1,
                "kaan",
                "şen",
                "111111111",
                new Date(1998, 8, 10));
        customerManager.register(customer);
        System.out.println("***********");

        SaleManager saleManager = new SaleManager();
        saleManager.sell(customer, game, compaign);

        System.out.println("***********");
        Sale sale1 = new Sale(1, customer.getId(), game.getId(), compaign.getId());
        saleManager.sell2(sale1);

    }
}

package com.company.business.concretes;

import com.company.business.abstracts.ISaleService;
import com.company.entities.concretes.Compaign;
import com.company.entities.concretes.Customer;
import com.company.entities.concretes.Game;
import com.company.entities.concretes.Sale;

public class SaleManager implements ISaleService {

    @Override
    public void sell(Customer customer, Game game, Compaign compaign) {
        System.out.println(
                customer.getFirstName() +
                        " adlı kullanıcı " +
                        game.getGameName() +
                        " oyununu " + compaign.getCompaignName() +
                        " kampanyası ile " +
                        discountedPrice(game.getPrice(), compaign.getDiscount()) +
                        "₺ fiyata aldı");
    }

    //alternatif
    public void sell2(Sale sale) {
        System.out.println("Satış başarıyla yapıldı ! Sipariş numaranız : " + sale.getId());
    }

    private double discountedPrice(double price, double discount) {
        return price - (price * discount / 100);
    }
}

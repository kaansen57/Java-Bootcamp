package com.company.business.abstracts;

import com.company.entities.concretes.Compaign;
import com.company.entities.concretes.Customer;
import com.company.entities.concretes.Game;
import com.company.entities.concretes.Sale;

public interface ISaleService {
    void sell(Customer customer, Game game, Compaign compaign);

    void sell2(Sale sale);
}

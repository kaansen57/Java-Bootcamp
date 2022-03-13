package com.company.business.abstracts;

import com.company.entities.concretes.Compaign;

public interface ICompaignService {
    void add(Compaign compaign);

    void update(Compaign compaign);

    void delete(Compaign compaign);

}

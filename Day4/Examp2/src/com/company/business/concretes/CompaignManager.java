package com.company.business.concretes;

import com.company.business.abstracts.ICompaignService;
import com.company.entities.concretes.Compaign;

public class CompaignManager implements ICompaignService {

    @Override
    public void add(Compaign compaign) {
        System.out.println(compaign.getCompaignName()  + " kampanyası eklendi");
    }

    @Override
    public void update(Compaign compaign) {
        System.out.println(compaign.getCompaignName()  + " kampanyası güncellendi");

    }

    @Override
    public void delete(Compaign compaign) {
        System.out.println(compaign.getCompaignName()  + " kampanyası silindi");

    }
}

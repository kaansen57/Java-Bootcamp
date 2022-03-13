package com.company.business.concretes;

import com.company.business.abstracts.ICustomerCheckService;
import com.company.business.abstracts.ICustomerService;
import com.company.entities.concretes.Customer;

public class CustomerManager implements ICustomerService {

    private ICustomerCheckService _customerCheckService;

    public CustomerManager(ICustomerCheckService _customerCheckService) {
        this._customerCheckService = _customerCheckService;
    }

    @Override
    public void register(Customer customer) {
        if (_customerCheckService.realPersonCheck(customer)) {
            System.out.println(customer.getFirstName() + " adlı kullanıcı kayıt oldu");
        } else {
            System.out.println("Doğrulama Başarız olduğundan kayıt yapılamadı!");
        }
    }

    @Override
    public void updateConfirmation(Customer customer) {
        System.out.println(customer.getFirstName() + " adlı kullanıcı bilgileri güncellendi");
    }

    @Override
    public void deleteRecord(Customer customer) {
        System.out.println(customer.getFirstName() + " adlı kullanıcı silindi");
    }
}

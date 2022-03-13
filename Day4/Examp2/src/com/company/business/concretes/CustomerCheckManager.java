package com.company.business.concretes;

import com.company.business.abstracts.ICustomerCheckService;
import com.company.entities.concretes.Customer;

import java.time.LocalDateTime;
import java.util.Date;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean realPersonCheck(Customer customer) {

        int age = LocalDateTime.now().getYear() - customer.getDateOfBirth().getYear();
        if (age > 18) {
            return true;
        }
        return false;
    }
}

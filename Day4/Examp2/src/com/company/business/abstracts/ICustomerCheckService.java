package com.company.business.abstracts;

import com.company.entities.concretes.Customer;

public interface ICustomerCheckService {
    boolean realPersonCheck(Customer customer);
}

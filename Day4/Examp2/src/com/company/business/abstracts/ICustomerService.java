package com.company.business.abstracts;

import com.company.entities.concretes.Customer;

public interface ICustomerService {
    void register(Customer customer);

    void updateConfirmation(Customer customer);

    void deleteRecord(Customer customer);

}

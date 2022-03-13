package business.concretes;

import business.abstracts.BaseCustomerManager;
import business.abstracts.ICustomerService;
import business.abstracts.ICustomerValidationService;
import business.abstracts.ICustomerVerificationService;
import dataAccess.abstracts.IHibernateCustomerDao;
import entities.concretes.Customer;

public class CustomerManager extends BaseCustomerManager {

    public CustomerManager(ICustomerValidationService customerValidation, IHibernateCustomerDao customerDao, ICustomerVerificationService customerVerification) {
        super(customerValidation, customerDao, customerVerification);
    }
}

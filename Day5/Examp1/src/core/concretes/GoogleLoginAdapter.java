package core.concretes;

import business.abstracts.BaseCustomerManager;
import business.abstracts.ICustomerService;
import business.abstracts.ICustomerValidationService;
import business.abstracts.ICustomerVerificationService;
import dataAccess.abstracts.IHibernateCustomerDao;
import entities.concretes.Customer;

import java.util.ArrayList;
import java.util.List;

public class GoogleLoginAdapter extends BaseCustomerManager {

    public GoogleLoginAdapter(ICustomerValidationService customerValidation, IHibernateCustomerDao customerDao, ICustomerVerificationService customerVerification) {
        super(customerValidation, customerDao, customerVerification);
    }

}

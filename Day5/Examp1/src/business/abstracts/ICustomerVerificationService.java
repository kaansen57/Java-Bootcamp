package business.abstracts;

import entities.concretes.Customer;

public interface ICustomerVerificationService {
    void sendToVerifyMail(Customer customer);
    boolean verifyMail(String email);
    boolean checkVerifyAccount(String email);
}

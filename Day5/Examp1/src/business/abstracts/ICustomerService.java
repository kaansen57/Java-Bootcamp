package business.abstracts;

import entities.concretes.Customer;

public interface ICustomerService {
    void register(Customer customer);
    void login(String email ,String password);
    void verifyAccount(Customer customer);
}

package business.abstracts;

import entities.concretes.Customer;

import java.util.*;

public interface ICustomerValidationService {
    boolean checkEmailFormat(Customer customer);
    boolean checkEmailDuplicate(Customer customer , List<Customer> customerList);
    boolean checkPassword(Customer customer);
    boolean checkFirstName(Customer customer);
    boolean checkLastName(Customer customer);
    boolean allCheck(Customer customer, List<Customer> customerList);
}

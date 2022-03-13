package dataAccess.abstracts;

import entities.concretes.Customer;

import java.util.*;


public interface IHibernateCustomerDao {
    void add(Customer customer);
    void delete(Customer customer);
    void update(Customer customer);
    Customer get(String email);
    List<Customer> getAll();
}

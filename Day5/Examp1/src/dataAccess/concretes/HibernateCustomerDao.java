package dataAccess.concretes;

import dataAccess.abstracts.IHibernateCustomerDao;
import entities.concretes.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerDao implements IHibernateCustomerDao {

    List<Customer> customers;

    public HibernateCustomerDao(){
        this.customers = new ArrayList<Customer>();
    }
    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void delete(Customer customer) {
        customers.remove(customer);
    }

    @Override
    public void update(Customer customer) {
        for(Customer customr : getAll()){
            if(customer.getId() == customr.getId()){
                customr.setFirstName(customer.getFirstName());
                customr.setLastName(customer.getLastName());
                customr.setEmail(customer.getEmail());
            }
        }
    }

    @Override
    public Customer get(String email) {
        for(Customer customer : customers){
            if(customer.getEmail() == email){
                return customer;
            }
        }
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return customers;
    }
}

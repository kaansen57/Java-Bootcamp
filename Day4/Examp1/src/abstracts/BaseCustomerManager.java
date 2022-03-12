package abstracts;

import entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName() + " kullanıcısı kaydedildi!");
	}
}

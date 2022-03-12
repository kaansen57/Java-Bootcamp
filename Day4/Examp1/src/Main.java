import java.rmi.RemoteException;
import java.sql.Date;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concretes.CustomerCheckManager;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {

		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1, "kaan", "şen", "1111111111", new Date(1998, 8, 10)));

		Customer starbackCustomer = new Customer(2, "kaan", "şen", "2222222222", new Date(1998, 8, 10));

		BaseCustomerManager starbuckManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbuckManager.save(starbackCustomer);

	}

}

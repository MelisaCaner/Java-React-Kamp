package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheckService;

	@Override
	public void Save(Customer customer) throws RemoteException {
		System.out.println("saved to db " + customer.getFirstName());
	}


}

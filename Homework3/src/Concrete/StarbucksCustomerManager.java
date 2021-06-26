package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager{
	
	
	private CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	
	@Override
	public void Save(Customer customer) throws RemoteException {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
		System.out.println("veri taban�na kaydedildi: " + customer.getFirstName());
		}
		else {
			System.out.println("ge�ersiz kullan�c�");
		}
	}



}

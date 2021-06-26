package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) throws RemoteException {
		System.out.println("saved to db " + customer.getFirstName());
	}

}

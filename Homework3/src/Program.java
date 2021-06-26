import java.rmi.RemoteException;
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Program {

	public static void main(String[] args) throws RemoteException {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.Save(new Customer(1,"melisa","caner",2000,"111111111"));
		
	}

}
//	BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter();
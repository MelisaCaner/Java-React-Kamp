package inheritance;

public class Main {

	public static void main(String[] args) {
		
		ÝndividualCustomer engin = new ÝndividualCustomer();
		engin.customerNumber = "12345";
		
		corporateCustomer hepsiBurada = new corporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "9999999";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {engin, abc, hepsiBurada};
		
		customerManager.addMultiple(customers);
		
		//CustomerManager customerManager = new CustomerManager();
		/*customerManager.add(hepsiBurada);
		customerManager.add(engin);
		customerManager.add(abc);*/
	
		
		
		/*Customer customer= new Costomer();
		customer.id = 1;
		customer.firstName = "Engin";
		customer.lastName = "Demiroð";
		customer.nationalIdenty = "1000000";
		customer.customerNumber="1323";*/
		
	}

}

package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		//super();
		this.loggers = loggers;  
	}


	public void add(Customer customer) {
		System.out.println("M��teri eklendi " + customer.getFirstName());
		
		//Utils utils = new Utils();
		Utils.runLoggers(loggers, customer.getFirstName());
	}
		
	
		/*for(Logger logger: loggers) {
			logger.log(customer.getFirstName()); 
		}
		//this.logger.log(customer.getFirstName()); // logger ikendi yani loggers olmadan �nce
	
		
	}*/
	
	public void delete(Customer customer) {
		System.out.println("M��teri Silindi " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());
		
		/*for(Logger logger: loggers) {
			logger.log(customer.getFirstName()); 
		}*/
	
	}
}

/*
DatabaseLogger logger = new DatabaseLogger(); //bu �stteki add customer ait
logger.log(customer.getFirstName()+ "veri taban�na logland�");

DatabaseLogger logger = new DatabaseLogger(); // bu alttaki delete customer ait
logger.log(customer.getFirstName()+ "veri taban�na logland�");*/

// main k�zd� logger a ge�ince �sttekileri sildik 
//CustomerManager yeni -> CustomerManager customerManager = new CustomerManager(new SmsLogger());
// CustomerManager eski -> CustomerManager customerManager = new CustomerManager();
//Dikkat bunlar tek ba��na logger i�in loggers oldu�unda durum de�i�iyor
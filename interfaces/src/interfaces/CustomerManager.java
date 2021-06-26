package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		//super();
		this.loggers = loggers;  
	}


	public void add(Customer customer) {
		System.out.println("Müþteri eklendi " + customer.getFirstName());
		
		//Utils utils = new Utils();
		Utils.runLoggers(loggers, customer.getFirstName());
	}
		
	
		/*for(Logger logger: loggers) {
			logger.log(customer.getFirstName()); 
		}
		//this.logger.log(customer.getFirstName()); // logger ikendi yani loggers olmadan önce
	
		
	}*/
	
	public void delete(Customer customer) {
		System.out.println("Müþteri Silindi " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());
		
		/*for(Logger logger: loggers) {
			logger.log(customer.getFirstName()); 
		}*/
	
	}
}

/*
DatabaseLogger logger = new DatabaseLogger(); //bu üstteki add customer ait
logger.log(customer.getFirstName()+ "veri tabanýna loglandý");

DatabaseLogger logger = new DatabaseLogger(); // bu alttaki delete customer ait
logger.log(customer.getFirstName()+ "veri tabanýna loglandý");*/

// main kýzdý logger a geçince üsttekileri sildik 
//CustomerManager yeni -> CustomerManager customerManager = new CustomerManager(new SmsLogger());
// CustomerManager eski -> CustomerManager customerManager = new CustomerManager();
//Dikkat bunlar tek baþýna logger için loggers olduðunda durum deðiþiyor
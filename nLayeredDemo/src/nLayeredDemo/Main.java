package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
//import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entitites.concretes.Product;
//import nLayeredDemo.jLogger.jLoggerManager;

public class Main {

	public static void main(String[] args) {
		
	 // todDo: Spring Ioc ile ��z�lecek
	 ProductService productService = new ProductManager(new AbcProductDao(), 
			 new JLoggerManagerAdapter());

	 Product product = new Product(1,2,"Elma", 12,50);
	 productService.add(product);
	}

}

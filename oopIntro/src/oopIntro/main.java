package oopIntro;

public class main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB Ram",10,13500); //referans oluþturma, instance
		
		
		Product product2 = new Product(); 
		product2.setId(2);
		product2.setName("Lenovo 15");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		category category1= new category();
		category1.setId(1);
		category1.setName ("Ýçecek");
		
		category category2= new category();
		category2.setId (2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
		//product1.id = 1;
				//product1.name = "Lenovo V14";
				//product1.unitPrice = 15000;
				//product1.detail = "16 GB Ram";
	/*	/*product2.id = 2;
		product2.name = "Lenovo V15";
		product2.unitPrice = 16000;
		product2.detail = "32 GB Ram";
		product2.discount = 10;
		product2.unitPriceAfterDiscount = 14400; 

		Product product3 = new Product(); 
		/*product3.id = 3;
		product3.name = "Hp 5";
		product3.unitPrice = 10000;
		product3.detail = "8 GB Ram";

		
				
		Product[] products = {product1,product2,product3};
		
		for(Product product : products) {
			
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
		category category1= new category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		category category2= new category();
		category2.id = 2;
		category2.name = "Ev/Bahçe";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3); */
		
		
		
		
	}

}

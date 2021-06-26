package exercise_1;

public class sinir {

	public static void main(String[] args) {
		/*int sayi = 12;
		int remainder= sayi % 2; // remainder kalan demek
		System.out.println(remainder);
		boolean isPrime = true; //isPrime asal sayý mý demek
		
		if(sayi == 1) {
			System.out.println("sayi asal deðildir");
			return
		}
		
		if(sayi<1) {
			System.out.println("geçersiz sayý");
		}
		
		for (int i=2; i<sayi;i++) {
			if (sayi % i == 0) {
			isPrime = false; 
			}
			
		}
		
		if(isPrime) {
			System.out.println("sayý asaldýr");
		}else {
			System.out.println("sayý asal deðildir");
		}*/
		
		int sayi = 2;
		int kalan = sayi % 2;
		if(sayi < 2) 
		{
			System.out.println("sayi asal degil");
			
		}
		if(sayi> 0) 
		{
			if (sayi==2) {
				System.out.println("sayi asaldir");
			
			}
			if (sayi>2)
			{
				for (int i=2; i<sayi;i++) 
				{
					if(sayi % i == 0) 
					{
						System.out.println("sayi asal deðildir");
						return;
					}
				}
				
				if(kalan == 0) 
				{
					System.out.println("sayi asal deðildir");
				}else 
				{ 
					System.out.println("sayi asaldýr");
				}
			}
		}
		

		}
		

	}



package exercise_1;

public class sinir {

	public static void main(String[] args) {
		/*int sayi = 12;
		int remainder= sayi % 2; // remainder kalan demek
		System.out.println(remainder);
		boolean isPrime = true; //isPrime asal say� m� demek
		
		if(sayi == 1) {
			System.out.println("sayi asal de�ildir");
			return
		}
		
		if(sayi<1) {
			System.out.println("ge�ersiz say�");
		}
		
		for (int i=2; i<sayi;i++) {
			if (sayi % i == 0) {
			isPrime = false; 
			}
			
		}
		
		if(isPrime) {
			System.out.println("say� asald�r");
		}else {
			System.out.println("say� asal de�ildir");
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
						System.out.println("sayi asal de�ildir");
						return;
					}
				}
				
				if(kalan == 0) 
				{
					System.out.println("sayi asal de�ildir");
				}else 
				{ 
					System.out.println("sayi asald�r");
				}
			}
		}
		

		}
		

	}



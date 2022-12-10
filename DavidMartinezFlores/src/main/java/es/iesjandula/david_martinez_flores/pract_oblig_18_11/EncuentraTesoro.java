package es.iesjandula.david_martinez_flores.pract_oblig_18_11;

public class EncuentraTesoro {

	public static void main(String[] args) {
		int a=12,b=100,c=100;
		
		if (a>0 && a<=150 && a%13==0 && a%11==0) {
			System.out.println("Tesoso 1 encontrado");
		}
		else {
			if (a<=100 && (b<=20 || b==c)) {
				System.out.println("Tesoso 2 encontrado");
			}
			else {
				if (c>0 && c<=1500 && c%7==0 && c%13==0 && c%17==0) {
					System.out.println("Tesoso 3 encontrado");
				}
				
			}
			
		}
		

	}

}

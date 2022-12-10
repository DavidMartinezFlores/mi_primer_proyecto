package es.iesjandula.david_martinez_flores.pract_oblig_18_11;

public class PiramideAsteriscos {

	public static void main(String[] args) {
		
		int filas=10;
		
		int numeroAsteriscos = 1;
		
		for(int i = 1 ; i<=filas;i++) {
			for(int j = numeroAsteriscos;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}

	}

}

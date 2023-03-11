package es.iesjandula.david_martinez_flores.pract_oblig_18_11;
//UPDATE PARA LUNES 13 MARZO 2023
import java.util.Scanner;

public class contraseña {
	
	public static void main(String[] args) {
		int contraseña;
		Scanner sc = new Scanner(System.in);
		boolean encontrado=false;
		
		System.out.println("Contraseña:");
		contraseña=sc.nextInt();
		
		while(encontrado==false){
			if (contraseña<600) {
				
				if(contraseña%13==0 && contraseña%2==0) {
					encontrado=true;
					System.out.println("Encontrado");
				}
			}
			if(encontrado==false) {
				System.out.println("Contraseña:");
				contraseña=sc.nextInt();
			}
		}
		sc.close();
	}
}

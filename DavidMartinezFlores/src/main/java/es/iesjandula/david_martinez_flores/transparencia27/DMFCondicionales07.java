package es.iesjandula.david_martinez_flores.transparencia27;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFCondicionales07 {

	public static void main(String[] args) {
		
		//Declaracion de varaibles
		int number,selection;
		String resultado="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique numero a evaluar: ");
		number=sc.nextInt();
		do {
			System.out.print("\nIndique la opcion deseada... \n"
					+ "[1] Es par\n"
					+ "[2] Es divisible entre 5\n"
					+ "[3] Es par y Divisible entre 5\n\n"
					+ "Eleccion -> ");
			selection=sc.nextInt();
			System.out.println(resultado = (selection!=1 && selection!=2 && selection!=3) ? "\nSeleccione una de las opciones disponibles":"");
		}while(selection!=1 && selection!=2 && selection!=3);
		
			switch(selection) {
				case 1:{//Opcion si es par
					System.out.println(resultado = (number%2==0) ? number+" Es Par":number+" No es Par");
					break;
				}
				case 2:{//Opcion si es divisible entre 5
					System.out.println(resultado = (number%5==0) ? "Es divisible entre 5":"No es Divisible entre 5");
					break;
				}
				case 3:{//Opcion Par y divisible entre 5
					resultado = (number%5==0) ? "es divisible entre 5":"no es Divisible entre 5";
					System.out.println(resultado = (number%2==0) ? number+" Par y "+resultado:number+" No es Par y "+resultado);
					break;
				}
				default:{//Caso de salida de errores por switch
					System.out.println("ErrorNoSelection");
					break;
				}
		
		}
		
		
		
		
		sc.close();//Cerramos Scanner

	}

}

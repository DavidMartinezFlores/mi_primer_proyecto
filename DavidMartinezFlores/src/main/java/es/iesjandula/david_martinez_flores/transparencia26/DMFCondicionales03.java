package es.iesjandula.david_martinez_flores.transparencia26;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFCondicionales03 {

	public static void main(String[] args) {
		//Declaracion de variables
		int selection;
		Scanner sc = new Scanner(System.in);
				
		//Imprimimos dias disponibles
		do {
			System.out.print("Dias disponibles: \n"
					+ "[1] Lunes\n"
					+ "[2] Martes\n"
					+ "[3] Miercoles\n"
					+ "[4] Jueves\n"
					+ "[5] Viernes\n"
					+ "[6] Sabado\n"
					+ "[7] Domingo\n"
					+ "\nIndique dia de la semana para mostrar: ");
			selection = sc.nextInt();
					
			//Informamos de que el dia no existe 
			if(selection<1||selection>7) {System.out.println("\n\nSolo existen dias enumerados del 1 al 7 !");}

		}while(selection<1||selection>7);//Repetir mientras no exista el dia 1-5
				
		//Evaluamos la eleccion en el siguiente switch y damos una salida por pantalla dependiendo de la eleccion
		System.out.print("Tu dia es: ");
		switch(selection) {
				
			case 1:{
				System.out.print("Lunes");
				break;
				}
			case 2:{
				System.out.print("Martes");
					break;
				}
			case 3:{
				System.out.print("Miercoles");
				break;
				}
			case 4:{
				System.out.print("Jueves");
				break;
				}
			case 5:{
				System.out.print("Viernes");
				break;
				}
			case 6:{
				System.out.print("Sabado");
				break;
				}
			case 7:{
				System.out.print("Domingo");
				break;
				}
			default:{	//Ponemos una salida de errores , aunque no es posible salirse por el bucle do while.
				System.out.println("Error NoDayPossible");
				break;
				}

		}
			
		sc.close(); //Cerramos el scanner
				
				
	}

}



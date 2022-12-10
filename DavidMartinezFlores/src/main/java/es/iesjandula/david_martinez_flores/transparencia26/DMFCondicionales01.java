package es.iesjandula.david_martinez_flores.transparencia26;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFCondicionales01 {

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
					+ "\nIndique dia de la semana: ");
			selection = sc.nextInt();
			
			//Informamos de que el dia no existe 
			if(selection<1||selection>5) {System.out.println("\n\nSolo existen dias enumerados del 1 al 5 !");}

		}while(selection<1||selection>5);//Repetir mientras no exista el dia 1-5
		
		//Evaluamos la eleccion en el siguiente switch y damos una salida por pantalla dependiendo
		switch(selection) {
		
			case 1:{
				System.out.println("Lunes, primera hora -> Bases de Datos");
				break;
				}
			case 2:{
				System.out.println("Martes, primera hora -> Programacion");
				break;
				}
			case 3:{
				System.out.println("Miercoles, primera hora -> Sistemas Informaticos");
				break;
				}
			case 4:{
				System.out.println("Jueves, primera hora -> FOL");
				break;
				}
			case 5:{
				System.out.println("Viernes, primera hora -> Programacion");
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

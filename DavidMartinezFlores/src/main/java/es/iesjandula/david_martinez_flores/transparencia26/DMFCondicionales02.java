package es.iesjandula.david_martinez_flores.transparencia26;

import java.util.Scanner;
/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFCondicionales02 {

	public static void main(String[] args) {
		//Declaracion de variables
		int hour;
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos dias disponibles
		do {
			System.out.print("Indique que hora es [Horario de 0-23 horas]: ");
			hour = sc.nextInt();
			
			//Informamos de que la hora no existe
			if(hour<0||hour>24) {System.out.println("\n\nSolo existen horas de 0 hasta 23 (0=12 de la noche)!");}

		}while(hour<0 || hour>23);//Repetir mientras no exista la hora
		
		
		//Condiciones posibles
		if(hour>=6 && hour<=12){
				System.out.println("Buenos dias");
		}
		else if(hour>=13 && hour<=20){
			System.out.println("Buenas tardes");
		}	
		else if((hour<=5 && hour>=0) ||(hour>=21 && hour<=23)){
			System.out.println("Buenas noches");
		}
		else { //Ponemos una salida de errores , aunque no es posible salirse por el bucle do while.
			System.out.println("Error NoTimePossible");
		}
		
		
		sc.close(); //Cerramos el scanner
		
		

	}

}

package es.iesjandula.david_martinez_flores.transparencia9;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/

public class DMFPrimerosPasosJava10 {

	public static void main(String[] args) {
		
		final double EURXHOUR=12;   //Declaramos varaibles double para poder poner horas medias y euros decimales.
		double hours;				//EURXHOUR sera constante , sabemos que son 12 euros la hora, si cambiamos la constante
									//el codigo cambiara solo.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Indique horas trabajadas: ");
		hours = sc.nextDouble();
		
		System.out.println("Total recaudado ("+EURXHOUR+" la hora ) "+(hours*EURXHOUR)+" Euros");
		
		sc.close();
	}

}

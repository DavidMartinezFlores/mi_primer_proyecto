package es.iesjandula.david_martinez_flores.transparencia26;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFCondicionales05 {

	public static void main(String[] args) {
		
		//Horas y minutos , calcula los segundos para llegar a media noche
		
		//Guardamos el valor de media noche , considerando que media noche son las 00:00 , Es decir las 24 horas.
		int mediaNoche=(24*3600),hour,minutes,seconds;
		
		Scanner sc = new Scanner(System.in);
		do {
			//Pedimos la hora y el minutos desde la que empezar
			System.out.print("Indique hora: ");
			hour = sc.nextInt();
			
			System.out.print("Indique Minuto: ");
			minutes = sc.nextInt();
			
			System.out.print("Indique Segundos: ");
			seconds = sc.nextInt();
			
			//Imprimimos los errores posibles
			if ((hour>23 || hour<0) || (minutes>=60 || minutes<0) || (seconds>=60 || seconds<0)){
				System.out.println("La hora seleccionada no existe! , solo existen horas entre la 0 y 23 , hasta 59 minutos y hasta 59 segundos (Horario de 24 horas)");
			}
			
			//Controlamos que las horas son desde las 0 - 23 , y que los minutos maximo son 59.
		}while((hour>23 || hour<0) || (minutes>=60 || minutes<0) || (seconds>=60 || seconds<0));
		
		//Mostramos la hora seleccionada
		System.out.println("\nHora seleccionada:  ["+(hour)+":"+(minutes)+":"+(seconds)+"]");
		
		//Pasamos horas y minutos a segundos.
		hour*=3600;
		minutes*=60;
		
		
		//(La hora llega controlada por el do while)
		//Mostramos los casos posibles.
		if(hour==0 && minutes == 0 && seconds==0){//Caso de seleccionar la media noche exacta, mostraremos que ya es la hora.
			System.out.println("Faltan 0 segundos para media noche, ! Ya es media noche ! [00:00]");
		}
		else if(hour>=0 && minutes>=0 && seconds>=0) {//Caso Global
			System.out.println("Faltan "+(mediaNoche-(hour+minutes+seconds))+" segundos para media noche [00:00]");
		}
		else { //Ponemos una salida de errores inesperados
			System.out.println("Error Inesperado NoTimePossible");
		}
		sc.close();
		
	}

}

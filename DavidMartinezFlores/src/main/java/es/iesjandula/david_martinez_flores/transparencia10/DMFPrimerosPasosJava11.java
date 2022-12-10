package es.iesjandula.david_martinez_flores.transparencia10;

import java.util.Scanner;


/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFPrimerosPasosJava11 {

	public static void main(String[] args) {
		// Calculo de notas ponderadas , primer examen 40% y segundo examen 60% ,
		// el calculo final indicara la nota necesaria en el segundo examen para obtener la calificacon deseada
		// en el trimestre.
		
		//Utilizamos variables constantes como valores de porcentajes, si se requiere cambiar los porcentajes , solamente
		//necesitaremos cambiar las constantes de valor.
		
		//El valor max , guarda el valor de nota maxima posible (10 por defecto).
		//El valor min , guarda el valor de nota minima posible (5 por defecto).
		
		//Los valores son utilizados como double para poder usar numeros reales (con decimales).
		
		final double test1Value=0.4,test2Value=0.6,max=10.0,min=5.0;
		double note1,noteRequired;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("- Indique la nota sacada en el primer examen: ");
		note1 = sc.nextDouble(); //Nota examen 1.
		
		do { //Hacer esto mientras la nota total requerida supere el maximo o si es inferior al minimo , pues la maxima calificacion sera 10
			 // si se desea cambiar la nota maxima , cambiar el valor "max" en valores consatantes e igualmente para el valor min (minimo).
			
			System.out.print("- Que nota quiere sacar en el trimestre ?: ");
			noteRequired = sc.nextDouble();//Nota deseada del trimestre.
			
			if (noteRequired >max) {
				System.out.println("\n ** Cuidado !  , no puedes obtener una calificacion superior a ("+max+") ! **");
				}
			if (noteRequired <min) {
				System.out.println("\n ** Cuidado !  , no puedes obtener una calificacion inferior a ("+min+") ! **");
				}
			
		}while(noteRequired >max || noteRequired <min);
		
		//Impresion del resultado final mediante un calculo en la propia impresion
		
		System.out.println("\n* Necesitas sacar en el siguiente examen un "+((noteRequired-(note1*test1Value))/test2Value)+" para conseguir un "+noteRequired+" en el trimestre");
		
		
		sc.close();//Cerramos scanner
	}

}

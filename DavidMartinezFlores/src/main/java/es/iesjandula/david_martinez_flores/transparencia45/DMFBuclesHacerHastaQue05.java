package es.iesjandula.david_martinez_flores.transparencia45;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFBuclesHacerHastaQue05 {

	public static void main(String[] args) {
		//Declaracion de variables
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Indique la altura de su escalera invertida: -> ");
			n=sc.nextInt();
			
			if(n<2) {
				System.out.println("No puede seleccionar una altura inferior a 2 , pues no existe escalera posible");
			}
		}while(n<1);
		//Seleccionamos la fila y vamos descendiendo, pues es una escalera invertida.
		for(int fila = n;fila>0;fila--){
		
			/*En cada fila pondremos el mismo numero de asteriscos que de fila
			  como va descendiendo, se ira restando un asterisco de forma automatica.*/
			for (int j=0;j<fila;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();//Cerramos Scanner
	}

}

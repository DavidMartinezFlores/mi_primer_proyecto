package es.iesjandula.david_martinez_flores.transparencia45;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFBuclesHacerHastaQue03 {

	public static void main(String[] args) {
		//Declaracion de variables
		int x,y,calculo=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime numero X e Y , para multiplicarlos mediante sumas:\n");
		System.out.print("X: -> ");
		x=sc.nextInt();
		
		calculo=x;//Asignamos el valor al calculo para poder usar la x como numero.
		
		System.out.print("Y: -> ");
		y=sc.nextInt();
		
		//Sumamos X tantas veces como Y 
		for (int i = 1;i<y;i++) {
			calculo += x; 
		}
		//Caso de algun cero , pues cualquier numero por cero es 0.
		if (x==0 || y==0) {
			calculo=0;
		}
		
		System.out.println("\nLa multiplicacion de "+x+" por "+y+" mediante sumas es : "+calculo);
		sc.close();//Cerramos scanner
	}

}

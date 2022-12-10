package es.iesjandula.david_martinez_flores.transparencia9;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/

public class DMFPrimerosPasosJava07 {

	public static void main(String[] args) {
		
					// F(x)=x^2+x+1;
		int x;		//Declaramos variables
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Indique valor de X para la siguiente operacion: F(x)=x^2+x+1;  -> X = ");
		x=sc.nextInt();	//Obtenemos valor de X.
		
		System.out.println("Resultado es -> "+((x*x)+x+1));
										//Imprimimos el resultado en la impresion ahorrando variables.
										//Multiplicamos X*X para ahorrar codigo , en vez de la clase Math.
		sc.close(); //Cerramos scanner
	}

}

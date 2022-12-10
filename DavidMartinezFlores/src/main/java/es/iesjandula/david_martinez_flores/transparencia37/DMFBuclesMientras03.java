package es.iesjandula.david_martinez_flores.transparencia37;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFBuclesMientras03 {

	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);  //Declaramos variables
		
		do { //Repetir mientras que Y sea diferente de 0
			System.out.print("Indique valor de X: ->");
			x=sc.nextInt();
			
			System.out.print("Indique valor de Y: ->");
			y=sc.nextInt();
			
			//Sacamos la raiz cuadrada del numero X y del numero Y, tras eso las sumamos.
			//Si Y es negativo , imprimir imposible de calcular.
			String sqrt = (y<0) ? "Imposible De calcular":""+(Math.sqrt(x)+Math.sqrt(y));
			
			//Para evitar la impresion de Y (z) igual a 0 , salir con un break.
 			if (y==0){
				System.out.println("Valor de Y (Z) es 0 , saliendo del programa...");
				break;
			}
			
 			//Muestro del calculos
			System.out.println("\nSuma "+x+" + "+y+" = "+(x+y)+"\n" //Utilizamoa cracteres especiales para usar solo una instrucion de impresion.
					+ "Resta "+x+" - "+y+" = "+(x-y)+"\n"
					+ "Multiplicacion "+x+" * "+y+" = "+(x*y)+"\n"//Mostramos los resultados en la impresion, ahorrando variables
					+ "Division "+x+" / "+y+" = "+(x/y)+"\n"
					+ "Resto "+x+" % "+y+" = "+(x%y)+"\n"
					+ "Potencia , base "+x+" elevado "+y+" = "+(Math.pow(x, y))+"\n"
					+ "Raiz de "+x+" + Raiz de "+y+" = "+sqrt+"\n"
					+ "");						
		}while(y!=0);		
		sc.close();	//Cerramos Scanner

	}

}

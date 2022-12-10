package es.iesjandula.david_martinez_flores.transparencia14;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFVariablesJava03 {

	public static void main(String[] args) {
		
		//Declaramos la variable constante del valor porcentual del IVA, pues siempre sera el mismo (Si se desea, se puede cambiar y se actualizara solo).
		//Declaramos la factura sin iva.
		//Declaramos el total de la factura y el total del IVA.
		
		final double IVA=21.0;
		double factureNoIva,ivaTotal,factureTotal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Indique el valor de su factura sin iva: ");
		factureNoIva = sc.nextDouble();//Pedimos factura sin iva (valor).
		
		
		//Calculamos el total de la factura sumando el iva a la factura sin iva.
		
		//Guardamos los valores del IVA y el total de la factura.
		ivaTotal=((IVA*factureNoIva)/100);
		factureTotal=(((IVA*factureNoIva)/100)+factureNoIva );
		
		System.out.println("\n\n\n"
				+ "-El iva total de su factura es: ("+IVA+"%) "+(ivaTotal)+"\n"
				+ "-Factura total = [ IVA -> "+(ivaTotal)+" + Factura sin IVA -> "+(factureNoIva)+"]"
				+ "\n\n ** TOTAL -> "+(factureTotal)+" **");
		
		
		sc.close();//Cerramos Scanner.

	}

}

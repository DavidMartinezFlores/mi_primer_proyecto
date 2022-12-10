package es.iesjandula.david_martinez_flores.transparencia28;

import java.util.Scanner;
/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFCondicionales12 {

	public static void main(String[] args) {
		//Declaramos variables
		double n1,n2;
		String recuperacion="";
		
		//Creamos 2 scanners, al hacer luego un nextLine, si no separamos scanners, existira un conflicto.
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("Nota del primer control: ");
		n1=sc.nextDouble();
		System.out.print("Nota del segundo control: ");
		n2=sc.nextDouble();
		
		if(n1<0||n1>10||n2<0||n2>10){
			System.out.println("Lo sentimos , las notas no pueden ser inferiores a 0 o superiores a 10");
		}
		else{
			
			if(((n1+n2)/2)>=5) {
				System.out.println("Tu nota de programacion es: "+((n1+n2)/2));
			}
			else {
				//Recogemos el valor de la recuperacion por escrito
				System.out.print("Cual ha sido el resultado de la recuperacion ? (apto / no apto): ");
				recuperacion = sc2.nextLine();
				
				//Imprimimos un resultado u otro dependiendo del apto o no apto.
				//Contemplamos la opcion de la primera letra mayuscula.
				
				if (recuperacion.equals("apto")||recuperacion.equals("Apto")) {
					System.out.println("Tu nota de programacion es: 5");
				}
				else if (recuperacion.equals("no apto")||recuperacion.equals("No apto")){
					System.out.println("Tu nota de programacion es: "+((n1+n2)/2));
				}
					//Imprimimos un error si no esta escrito bien el resultado de recuperacion
				else {
					System.out.println("Error, solamente puede ser (apto) o (no apto)");
				}
			}
			
		}
		sc.close();//Cerramos Scanner sc
		sc2.close();//Cerramos Scanner sc2

	}

}

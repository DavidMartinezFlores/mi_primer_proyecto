package es.iesjandula.david_martinez_flores.transparencia37;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFBuclesMientras04 {

	public static void main(String[] args) {
		//Declaracion de variables
		int calculo=0;
		
		//Iterador For , desde 50 hasta 300 , sumando en una variable acumuladora el calculo de los sumandos.
		for (int i = 50 ; i<=300;i++) {
			calculo += i;
		}
		//Mostramos el resultado de acumular en la varible calculo
		System.out.println("El sumatorio entre 50 y 300 es: "+calculo);
	}

}

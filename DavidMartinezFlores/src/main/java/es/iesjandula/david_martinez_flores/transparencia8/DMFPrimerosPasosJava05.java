package es.iesjandula.david_martinez_flores.transparencia8;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/


public class DMFPrimerosPasosJava05 {

public static void main(String[] args) throws InterruptedException {
        
        /**
        * Esta reducida animacion mediante caracteres, ha sido creada para el modulo de
        * Entornos de desarrollo, IES Jandula , Andujar, Jaen, por David Martinez Flores.
        * 
        * Esta animacion de un total de 14 frames, contiene un bucle que inicia la escena,
        * y tiene interrupciones por tiempo en milisegundos, el conjunto de estos tiempos y frames
        * dan la apariencia de movimiento. Ademas en la primera linea de cada frame, se introducen
        * multiples saltos de linea , para evitar que se vea un frame sobre otro (Es mejor limpiar la escena,
        * pero java no nos da ninguna clase que lo haga, se tendria que crear una clase desde 0.)
        * 
        * -El programa proporciona una reducida lista de posibles casos especiales.
        * -Se evita el uso de tildes para evitar errores.
        * -Utiliza vocabulario ingles para fomentar el apartado bilingue del modulo.
        * -Simula un loading de la animacion al principio.
        * -Contiene un contador de vueltas y metros ficticios recorridos por el coche.
        * -Contiene un selector random de la aletoriedad del cartel, esto hace que cada ejecucion pueda ser diferente y dinamica.
        * -Contiene un selector de velocidad , seleccionable por el usuario.
        * 
        */
       Scanner sc = new Scanner(System.in);
       
       int rounds,finalRound,speed=2,KMH=125;
       
                                           //Menu de casos especiales o Advertencias
       System.out.println("\n\n____________________________________!!!! - Advertencia , Casos Especiales - !!!!______________________________________________\n"
               + "| *Si selecciona 0 vueltas, o numeros negativos, el coche no dara vueltas, por lo tanto no chocara .                         |\n"
               + "| *Si Selecciona un numero mayor en la vuelta a chocar que las vueltas totales, nunca chocara, pues no existe esa vuelta .   |\n"
               + "| *Si Selecciona un numero inferior en la vuelta a chocar que las vueltas totales, chocara antes (en la vuelta seleccionada).|\n"
               + "| *Si Selecciona un numero inferior a cero en la vuelta a chocar, el coche chocara al inicio .                               |\n"
               + "______________________________________________________________________________________________________________________________\n");
       
       System.out.print("Indique la cantidad de vueltas que realizara el coche: ");
       rounds = sc.nextInt();
       
       System.out.print("\nIndique la vuelta en la que el coche chocara y terminara la animacion: ");
       finalRound = sc.nextInt();
       
       System.out.println("\nIndique la velocidad del coche:[1-2-3] \n"
       		+ "[1] Velocidad baja\n"
       		+ "[2] Velocidad Media\n"
       		+ "[3] Velocidad Alta\n"
       		+ "[Otros] Velocidad por defecto (Media)\n\n");
       
       System.out.print("Velocidad ->: ");
       speed = sc.nextInt();
       //Selector de velocidad , este selector evalua la selecciona de arriba del usuario.
       
       switch(speed) {//Segun se elija el usuario, este switch asigna el timer de los Thread.sleep, ademas selecciona el marcador inicial de KMH 
       		case 1:{KMH=90;speed=250;System.out.println("Velocidad Baja Seleccionada");break;}
       		case 2:{KMH=125;speed=125;System.out.println("Velocidad Media Seleccionada");break;}
       		case 3:{KMH=190;speed=50;System.out.println("Velocidad Alta Seleccionada");break;}
       		default:{KMH=125;speed=125;System.out.println("Velocidad Por defecto Seleccionada (Media)");break;}
       
       }
       Thread.sleep(3000);
       
       for (int i = 0;i<=100;i+=25) {  //For iniciador de la animacion loading.
    	   
    	   for (int j=100;j>=0;j-=75) {
    	   Thread.sleep(250);          //Contador interior y muestra el porcentaje (i).
    	   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
       			+ "Loading Animation ( - "+i+"%) .");
    	   
    	   Thread.sleep(250);
    	   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
          			+ "Loading Animation ( \\ "+i+"%) ...");
    	   
    	   Thread.sleep(250);
    	   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
         			+ "Loading Animation ( | "+i+"%) ....");
    	   
    	   Thread.sleep(250);
    	   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
         			+ "Loading Animation ( / "+i+"%) .....");
           
           }
    	   if (i ==100){
               System.out.println("Animation complete , lets start !");
               Thread.sleep(3000);
    	   } 
    	   
       }
       
       
       for (int i = 1;i<=rounds;i++){  //Bucle iniciador, delimita las vueltas que va a dar la escena.
    	   
           int selector=(int)((Math.random()*3)+1); //Variable aleatoria entre 1 y 3.
           String alert="",randomSing = "o";  //Declaramos la variable String randomSing , esta decidira la forma del cartel, para hacerlo aleatorio.
          
           if(i==finalRound) {
        	   alert="!Alerta por Colision!"; //Se mostrara cuando el coche este en la vuelta de choque.
           }
           if(selector <2) {
        	   randomSing ="*";  //Si el selector es menor que dos, el cartel tendra un *.
           }
           else if (selector>2) {
        	   randomSing="&";   //Si el selector es mayor que dos, el cartel tendra un &.
           }
           else {
        	   randomSing ="o"; //Si el selector no cumple las condiciones de arriba , el cartel tendra una o.
           }
    	   
           //La velocidad de KMH, utiliza la base seleccionada en el switch y se le resta el selector aleatorio, con eso obtenemos una velocidad que fluctua.
           //Los metros recoridos son 10.75 por cada vuelta.
           
           System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
        		   + "       "+alert+"    \n\n"
                   + "Vuelta: "+i+"               Metros recorridos: "+(i*10.75)+"\n\n Km/h: "+(KMH-selector)+"\n"
                   +"            ________\n" +
                    "       ___/____|____\\___            ["+randomSing+"]\n" +
                    "     |_---_________ _---_)           |\n" +    //Frame numero 1
                    "________(-)__________(-)_____________|");
           Thread.sleep(speed);
           
           
           System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
        		   + "       "+alert+"    \n\n"
                   + "Vuelta: "+i+"               Metros recorridos: "+(i*10.75)+"\n\n Km/h: "+(KMH-selector)+"\n"
                   +"            ________\n" +
                    "       ___/____|____\\___          ["+randomSing+"]\n" +
                    "     |_---_________ _---_)         |\n" +	    //Frame numero 2		
                    "________(\\)__________(\\)___________|_");
           Thread.sleep(speed);
           
           
           System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
        		   + "       "+alert+"    \n\n"
        		   + "Vuelta: "+i+"               Metros recorridos: "+(i*10.75)+"\n\n Km/h: "+(KMH-selector)+"\n"
                   +"            ________\n" +
                    "       ___/____|____\\___        ["+randomSing+"]\n" +
                    "     |_---_________ _---_)       |\n" +     //Frame numero 3
                    "________(|)__________(|)_________|____");
           Thread.sleep(speed);
           
           
           System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
        		   + "       "+alert+"    \n\n"
        		   + "Vuelta: "+i+"               Metros recorridos: "+(i*10.75)+"\n\n Km/h: "+(KMH-selector)+"\n"
                   +"            ________\n" +
                    "       ___/____|____\\___      ["+randomSing+"]\n" +
                    "     |_---_________ _---_)     |\n" +      //Frame numero 4
                    "________(/)__________(/)_______|______");
           Thread.sleep(speed);
           
           
           System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
        		   + "       "+alert+"    \n\n"
        		   + "Vuelta: "+i+"               Metros recorridos: "+(i*10.75)+"\n\n Km/h: "+(KMH-selector)+"\n"
                   +"            ________\n" +
                    "       ___/____|____\\___    ["+randomSing+"]\n" +
                    "     |_---_________ _---_)   |\n" +       //Frame numero 5
                    "________(-)__________(-)_____|________");
           Thread.sleep(speed);
           
           
           System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
        		   + "       "+alert+"    \n\n"
        		   + "Vuelta: "+i+"               Metros recorridos: "+(i*10.75)+"\n\n Km/h: "+(KMH-selector)+"\n"
                   +"            ________\n" +
                    "       ___/____|____\\___  ["+randomSing+"]\n" +
                    "     |_---_________ _---_) |\n" +      //Frame numero 6
                    "________(\\)__________(\\)___|__________");
           Thread.sleep(speed);
           
           
           if(i<finalRound){  //Mientras que la iteracion sea menor o igual a la vuelta de choque , repetir esta escena.
        	   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
        		   + "       "+alert+"    \n\n"
        		   + "Vuelta: "+i+"               Metros recorridos: "+(i*10.75)+"\n\n Km/h: "+(KMH-selector)+"\n"
                   +"            ________\n" +
                    "       ___/____|____\\___            \n" +
                    "     |_---_________ _---_)           \n" +      //Frame numero 7
                    "________(|)_______|__(|)______________");
        	   Thread.sleep(speed);
        	   
           
        	   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
        		   + "       "+alert+"    \n\n"
        		   + "Vuelta: "+i+"               Metros recorridos: "+(i*10.75)+"\n\n Km/h: "+(KMH-selector)+"\n"
                   +"            ________\n" +
                    "       ___/____|____\\___          \n" +
                    "     |_---_________ _---_)         \n" +      //Frame numero 8
                    "________(/)__|_______(/)______________");
        	   Thread.sleep(speed);
        	   
        	   
        	   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
        		   + "       "+alert+"    \n\n"
        	       + "Vuelta: "+i+"               Metros recorridos: "+(i*10.75)+"\n\n Km/h: "+(KMH-selector)+"\n"
                   +"            ________\n" +
                    "       ___/____|____\\___        \n" +
                    "     |_---_________ _---_)       \n" +      //Frame numero 9
                    "_______|(-)__________(-)______________");
        	   Thread.sleep(speed);
        	   
        	   
        	   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
        		   + "       "+alert+"    \n\n"
        		   + "Vuelta: "+i+"               Metros recorridos: "+(i*10.75)+"\n\n Km/h: "+(KMH-selector)+"\n"
                   +"            ________\n" +
                    "   ["+randomSing+"] ___/____|____\\___      \n" +
                    "    ||_---_________ _---_)     \n" +      //Frame numero 10
                    "____|___(\\)__________(\\)______________");
        	   Thread.sleep(speed);
        	   
        	   
        	   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
        		   + "       "+alert+"    \n\n"
        		   + "Vuelta: "+i+"               Metros recorridos: "+(i*10.75)+"\n\n Km/h: "+(KMH-selector)+"\n"
                   +"            ________\n" +
                    "["+randomSing+"]    ___/____|____\\___      \n" +
                    " |   |_---_________ _---_)     \n" +      //Frame numero 11
                    "_|______(|)__________(|)______________");
        	   Thread.sleep(speed);
        	   
           
        	   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
        		   + "       "+alert+"    \n\n"
        		   + "Vuelta: "+i+"               Metros recorridos: "+(i*10.75)+"\n\n Km/h: "+(KMH-selector)+"\n"
                   +"            ________\n" +
                    "       ___/____|____\\___          \n" +
                    "     |_---_________ _---_)         \n" +      //Frame numero 12
                    "________(/)__________(/)______________");
        	   Thread.sleep(speed);
        	   
           }
           else {  //Cuando ya no se cumpla en anterior if , saltar a esta escena (Escena final).
        	   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
        		   + "       "+alert+"    \n\n"
        		   + "Vuelta: "+i+"               Metros recorridos: "+(i*10.75)+"\n\n Km/h: "+(KMH-selector)+"\n"
                   +"            ________\n" +
                    "       ___/____|____\\__          \n" +
                    "     |_---_________ _---;.|     -["+randomSing+"]  \n" +      //Frame numero 13
                    "________(/)__________(/) .|__--______");
        	   Thread.sleep(speed);
        	   
        	   
        	   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
        		   + "       "+alert+"    \n\n"
        		   + "Vuelta: "+i+"               Metros recorridos: "+(i*10.75)+"\n\n Km/h: "+(0)+"\n"
                   +"            ________\n" +
                    "       ___/____|____\\__          \n" +
                    "     |_---_________ _---; |        \n" +      //Frame numero 14
                    "________(/)__________(/) )|__---["+randomSing+"]__");
        	   
        	   Thread.sleep(3000);
        	   System.out.print("Driver: HMMM ");
        	   
               Thread.sleep(1000);
               System.out.print(".");   //Animacion del dialogo final con Thread.sleep.
               
               Thread.sleep(1000);
               System.out.print(".");
               
               Thread.sleep(1000);
               System.out.print(".");   
               System.out.println();
               
               Thread.sleep(3000);   
               System.out.println("Driver: Can someone call the cops ?.."); 
               
               Thread.sleep(3000);   
               System.out.print("Driver: No?");
               
               Thread.sleep(1000);
               System.out.print(".");
               Thread.sleep(1000);
               System.out.print(".");
               Thread.sleep(1000);
               System.out.print(".");
               System.out.println();
               Thread.sleep(1000);   
               System.out.println("Driver: okey  :(  "); 
               break;
           }
           
           
           sc.close();    //Cerramos el scanner
           
           }
   }

}

    


package juego;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {// Método que ejecuta el código

        // Permite leer lo que escribe el usuario.
        Scanner scan = new Scanner(System.in);// Permite leer los datos que  ingresa el usuario

        // Crea el objeto que representa al juego.
        Juego juego = new Juego(0,5,0);// el número 0 y el número 5 vienen del constructor
       
        
        System.out.println("\n----- MENÚ -----");
        System.out.println("1. Jugar");
        System.out.println("2. Ver instrucciones");
        System.out.println("3. Salir");
        System.out.print("Elegí una opción: ");

        
       
        String opcion ;
        
        generarRenglonL();
        
        System.out.print("--- Ingrese la opción: ");
		
		
		opcion = scan.nextLine();/* es donde se almacena el valor que el usuario ingresa por teclado. 
		nextLine almacena texto*/
		
		generarRenglonL();
		
		switch(opcion) {
		
		case "1":
			
			
			juego.jugar();
            break;

        case "2":
            juego.mostrarInstrucciones();
            break;

        case "3":
            System.out.println("¡Gracias por jugar!");
            break;

        default:
            System.out.println(
                    "Opción incorrecta. Elegí 1, 2 o 3."
            );
		
		}
        
      
    }
    
    
  //Método para renglón largo
  	public static void generarRenglonL() {
  	    System.out.println("_____________________________________\n");
  	}

  	//Método para renglón corto
  	public static void generarRenglonC() {
  	    System.out.println("__________\n");
  	}
}

package juego;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {// Método que ejecuta el código

        // Permite leer lo que escribe el usuario.
        Scanner scan = new Scanner(System.in);// Permite leer los datos que  ingresa el usuario

        // Crea el objeto que representa al juego.
        Juego juego = new Juego(0,5);// el número 0 y el número 5 vienen del constructor
        
        System.out.println("\n----- MENÚ -----");
        System.out.println("1. Jugar");
        System.out.println("2. Ver instrucciones");
        System.out.println("3. Salir");
        System.out.print("Elegí una opción: ");

        
        int numero;
        String opcion ;
        boolean valido = false;
        generarRenglonL();
        
      
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

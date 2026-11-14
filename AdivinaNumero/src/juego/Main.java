package juego;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {// Método que ejecuta el código

        // Permite leer lo que escribe el usuario.
        Scanner scan = new Scanner(System.in);// Permite leer los datos que  ingresa el usuario

        // Crea el objeto que representa al juego.
        Juego juego = new Juego(0,5);// el número 0 y el número 5 vienen del constructor
        

      
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

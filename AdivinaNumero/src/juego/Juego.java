package juego;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Juego {

	// Atributos del juego.
    int numeroSecreto;
    int intentos = 5;
    int nro =0;
	public Juego(int numeroSecreto, int intentos, int nro) {
		super();
		this.numeroSecreto = numeroSecreto;
		this.intentos = intentos;
		this.nro= nro;
	}
	
	//Este es el método para jugar
	public void jugar() {
		
		Scanner scan = new Scanner(System.in);// Permite el ingreso por teclado
		numeroSecreto = (int) (Math.random()*100)+1;
		boolean juego = false;
		boolean valido = false;
		int i;
		
		//bucle que dá aljugador cinco intentos para que adivine el número
		for(i =1; i <= intentos; i++){
			valido = false;
			System.out.println("Te quedan "+ (intentos -i +1)+" intentos");// i aumenta en cada vuelta del ciclo for
			
			while (!valido) {
			    try {
			        System.out.print("\nIngrese un número: ");
			        nro = scan.nextInt();
			       
			        
			        if(nro <=0) {// Esta condicional se la agrego como "ADVERTENCIA"
			        	System.out.print("\nNO SE ACEPTAN NÚMEROS NEGATIVOS\n");
			        	
			        }else {
			        	valido= true;
			        }
			        

			    } catch (InputMismatchException e) {
			        System.out.println("Por favor ingrese un número entero: ");
			        scan.next();// Limpia el error del usuario
			    }
			}
				
				if(nro>numeroSecreto) {
					System.out.println("El número secreto es menor ");
					
				}else if(nro<numeroSecreto){
					System.out.println("El número secreto es mayor ");
					
				}else if(nro == numeroSecreto) {
					System.out.println("Acertaste !! ");
					System.out.println("El número es: "+numeroSecreto);
					juego = true;
					break;
				}	
			
			
			
		}
		if (!juego) { 
            System.out.println("Finalizaste los intentos. Perdiste.");
            System.out.println("El número era: " + numeroSecreto);
		
		
		

	    }
	}
	
	public void mostrarInstrucciones() {
		 System.out.println("\n----- INSTRUCCIONES -----");
	     System.out.println("Adiviná el número secreto del 1 al 100.");
	     System.out.println("Tenés que ingresar un número y acertar el número secreto en menos de cinco intentos");
	     System.out.println("Después de cada intento recibirás una pista que te ayudará a llegar al número secreto.");
	     System.out.println("BUENA SUERTE !!");
	}
	
    
}

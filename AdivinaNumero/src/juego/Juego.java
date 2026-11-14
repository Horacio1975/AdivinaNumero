package juego;

import java.util.Scanner;

public class Juego {

	// Atributos del juego.
    int numeroSecreto;
    int intentos = 5;
    int nro;
	public Juego(int numeroSecreto, int intentos) {
		super();
		this.numeroSecreto = numeroSecreto;
		this.intentos = intentos;
		this.nro= nro;
	}
	
	//Este es el método para jugar
	public void jugar(int nro) {
		
		Scanner scan = new Scanner(System.in);// Permite el ingreso por teclado
		numeroSecreto = (int) (Math.random()*100)+1;
		boolean juego = false;
		int i;
		
		//bucle que dá aljugador cinco intentos para que adivine el número
		for(i =1; i <= intentos; i++){
			System.out.println("Te quedan "+ (intentos -i +1)+" intentos");// i aumenta en cada vuelta del ciclo for
			
				System.out.print("Ingresa un número: ");
				nro=scan.nextInt();
				System.out.print(" ");
				
				if(nro>numeroSecreto) {
					System.out.println("Es mayor ");
					
				}else if(nro<numeroSecreto){
					System.out.println("Es menor ");
					
				}else if(nro == numeroSecreto) {
					System.out.println("Acertaste !! ");
					System.out.println("El número es: "+numeroSecreto);
					juego = true;
					break;
				}	
			
			
			
		}
		if (juego == false) { 
            System.out.println("Finalizaste los intentos. Perdiste.");
            System.out.println("El número era: " + numeroSecreto);
		
		
		

	    }
	}
	
    
}

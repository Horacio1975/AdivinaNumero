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
		
		Scanner scan = new Scanner(System.in);
		numeroSecreto = (int) (Math.random()*100)+1;
		
		
	}
    
}

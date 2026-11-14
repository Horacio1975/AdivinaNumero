package juego;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Permite leer lo que escribe el usuario.
        Scanner scan = new Scanner(System.in);

        // Crea el objeto que representa al juego.
        Juego juego = new Juego();

        // Guarda la opción elegida.
        int opcion = 0;

        // Repite el menú mientras no elija salir.
        while (opcion != 3) {

            System.out.println("\n----- MENÚ -----");
            System.out.println("1. Jugar");
            System.out.println("2. Ver instrucciones");
            System.out.println("3. Salir");
            System.out.print("Elegí una opción: ");

            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {

                case 1:
                    juego.jugar(scan);
                    break;

                case 2:
                    System.out.println("Debés adivinar un número del 1 al 10.");
                    System.out.println("Tenés 3 intentos.");
                    System.out.println("El juego te indica si es alto o bajo.");
                    break;

                case 3:
                    System.out.println("¡Gracias por jugar!");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        }

        scan.close();
    }
}

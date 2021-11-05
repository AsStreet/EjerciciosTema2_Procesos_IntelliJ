package ejercicio4;

import java.util.Scanner;

public class PrincipalEjercicio4 {

    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce la cadena para el constructor: ");
        String cadena = leer.nextLine();
        HolaMundoRunnable hmr = new HolaMundoRunnable(cadena);
        Thread th = null;
        for(int i = 0; i < 5; i++){
            th = new Thread(hmr);
            th.start();
        }
    }
}

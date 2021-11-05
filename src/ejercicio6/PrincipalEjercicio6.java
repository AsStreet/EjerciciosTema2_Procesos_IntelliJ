package ejercicio6;

import java.util.Random;

public class PrincipalEjercicio6 {

    public static void main(String[] args) {
        Random r = new Random();
        Circunferencia c = null;
        Thread th = null;
        for(int i = 0; i < 20; i++){
            c = new Circunferencia(r.nextInt(50));
            th = new Thread(c);
            th.start();
        }
    }

}

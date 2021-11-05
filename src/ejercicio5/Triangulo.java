package ejercicio5;

import java.util.Random;

public class Triangulo extends Thread{

    private Random r = new Random();

    public void run(){
        int base = r.nextInt(100);
        int altura = r.nextInt(100);
        float area = (base * altura) / 2;
        System.out.println("Hilo " + getName() + " Base recibida: " + base +
                " Altura recibida: " + altura + " Área triángulo: " + area);
    }
}

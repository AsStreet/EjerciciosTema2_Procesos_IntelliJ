package ejercicio6;

public class Circunferencia implements Runnable{
    private int radio;

    public Circunferencia(int radio){
        this.radio = radio;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Radio introducido: " + this.radio +
                " Longitud: " + (2 * Math.PI * this.radio) + " Área: " + (Math.PI * Math.pow(radio, 2)));
    }
}

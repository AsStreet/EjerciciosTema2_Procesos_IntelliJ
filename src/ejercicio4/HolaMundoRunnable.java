package ejercicio4;

public class HolaMundoRunnable implements Runnable{
    private String cadena;
    public HolaMundoRunnable(String cadena){
        this.cadena = cadena;
    }

    @Override
    public void run() {
        System.out.println("Hola mundo " + this.cadena + " " + Thread.currentThread().getName());
    }
}

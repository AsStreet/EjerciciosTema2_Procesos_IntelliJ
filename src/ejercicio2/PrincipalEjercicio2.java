package ejercicio2;

public class PrincipalEjercicio2 {

    public static void main(String[] args) {
        HiloTicRunnable hTic = new HiloTicRunnable();
        HiloTacRunnable hTac = new HiloTacRunnable();
        Thread hilo1 = new Thread(hTic);
        Thread hilo2 = new Thread(hTac);
        hilo1.start();
        hilo2.start();
    }
}

package ejercicio2;

public class HiloTacRunnable implements Runnable{

    @Override
    public void run() {
        while(true) {
            System.out.println("TIC");
            try {
                // Esto se lo pongo para que se duerma el hilo 1 segundo
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

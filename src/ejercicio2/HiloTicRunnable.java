package ejercicio2;

public class HiloTicRunnable implements Runnable{
    @Override
    public void run() {
        while(true) {
            System.out.println("TAC");
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

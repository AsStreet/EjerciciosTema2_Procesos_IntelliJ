package ejercicio1;

public class HiloTic extends Thread {
    public void run() {
        try{
            while(true){
                System.out.println("TIC");
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

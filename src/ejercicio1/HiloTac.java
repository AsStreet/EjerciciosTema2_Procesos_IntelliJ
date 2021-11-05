package ejercicio1;

public class HiloTac extends Thread {
    public void run() {
        try{
            while(true){
                System.out.println("TAC");
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package ejercicio3;

public class HolaMundo extends Thread {

    public void run() {
        System.out.println(this.getName() + ": Hola mundo");
    }
}

package ejercicio3;

public class PrincipalEjercicio3 {
    public static void main(String[] args) {
        HolaMundo hm = null;
        for(int i = 1; i <= 5; i++){
            hm = new HolaMundo();
            hm.setName("Hilo " + i);
            hm.start();
        }
    }
}

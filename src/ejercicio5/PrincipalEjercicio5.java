package ejercicio5;

public class PrincipalEjercicio5{

    public static void main(String[] args) {
        Triangulo t = null;
        for(int i = 0; i < 10; i++){
            t = new Triangulo();
            t.start();
        }
    }
}

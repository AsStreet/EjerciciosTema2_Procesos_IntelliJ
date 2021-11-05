package ejercicio1;

public class PrincipalEjercicio1 {
    public static void main(String[] args) {
        new HiloTic().start();
        new HiloTac().start();
        /*
        No se visualizan los textos TIC TAC de forma ordenada
        porque no hay una sincronización entre los hilos, por
        lo que se ejecutan en función del Sistema Operativo
        y no del código
         */
    }
}

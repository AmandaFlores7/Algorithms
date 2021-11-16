package main.java.Hilos.EstadosDeUnHilo;

public class ClasePrincipal {

    public static void main(String[] args) {
        Hilo_Proceso hilo1 = new Hilo_Proceso("Hilo 1");
        Hilo_Proceso hilo2 = new Hilo_Proceso("Hilo 2");

        hilo1.start();

        try {
            hilo1.sleep(1000);
        } catch (Exception e) {
        }

        hilo2.start();
        hilo2.stop();
        
        try {
            hilo2.sleep(2000);
        } catch (Exception e) {
        }

    }
}

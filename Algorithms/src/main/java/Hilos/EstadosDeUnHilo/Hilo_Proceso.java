package main.java.Hilos.EstadosDeUnHilo;

public class Hilo_Proceso extends Thread {

    public Hilo_Proceso(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(this.getName() + " - " + i);

            try {
                Hilo_Proceso.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

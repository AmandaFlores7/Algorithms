package main.java.Hilos.EstadosDeUnHilo;

import java.rmi.StubNotFoundException;

import javax.sound.sampled.SourceDataLine;

public class ClasePrincipal {

    public static void main(String[] args) {
        Hilo_Proceso hilo1 = new Hilo_Proceso("Hilo 1");
        Hilo_Proceso hilo2 = new Hilo_Proceso("Hilo 2");

        hilo1.start();

        

        try {
            Hilo_Proceso.sleep(1000);
        } catch (Exception e) {
        }

        hilo2.start();
        //hilo2.stop();
        
        try {
            Hilo_Proceso.sleep(2000);
        } catch (Exception e) {
        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.Hilos.SincronizacionDeHilos;

/**
 *
 * @author amand
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
        Hilo3 hilo3 = new Hilo3();
        Hilo4 hilo4 = new Hilo4();
        
        hilo1.start();
        try {
            hilo1.sleep(10);
        } catch (Exception e) {
        }
        
        hilo2.start();
        try {
            hilo2.sleep(10);
        } catch (Exception e) {
        }
        
        hilo3.start();
        try {
            hilo3.sleep(10);
        } catch (Exception e) {
        }
        
        hilo4.start();
        try {
            hilo4.sleep(10);
        } catch (Exception e) {
        }
    }
}

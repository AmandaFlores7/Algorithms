/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.Hilos.Hilos;

/**
 *
 * @author amand
 */
public class ClasePrincipal {

    public static void main(String[] args) {

        //Proceso1 hilo1 = new Proceso1();
        //Thread hilo2 = new Thread(new Proceso2()); //implements runnable
        Proceso hilo3 = new Proceso(" Hilo 1");
        Proceso hilo4 = new Proceso(" Hilo 2");
        Proceso hilo5 = new Proceso(" Hilo 3");
        
        hilo3.ValorDeLaCondion(5);
        hilo4.ValorDeLaCondion(10);
        hilo5.ValorDeLaCondion(12);
        
        hilo3.start();
        hilo4.start();
        hilo5.start();

        //hilo1.start();
        //hilo2.start();
    }
}

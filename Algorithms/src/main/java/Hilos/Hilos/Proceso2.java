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
public class Proceso2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Proceso 2");
        }
    }
}

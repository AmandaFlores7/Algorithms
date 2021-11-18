/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.HR.PriorityQueue;

/**
 *
 * @author amand
 */
class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(String id, String name, String cgpa) {
        this.name = name;
        this.cgpa = Double.parseDouble(cgpa);
        this.id = Integer.parseInt(id);
    }
    
    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }
}
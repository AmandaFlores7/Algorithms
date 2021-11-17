/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.HR.PriorityQueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amand
 */
class Priorities {

    public List<Student> getStudents(List<String> events) {
        int n = events.size();
        Student student;
        String str;
        String[] newStr;
        List<Student> students = new ArrayList<>(n);
        
        for (int i = 0; i < n; i++){
            System.out.println(events.get(i).charAt(5));
            if (events.get(i).charAt(5) == ' '){
                str = events.get(i);
                System.out.println(str);
                
                
                
                newStr = str.split("\\s+");
                
                System.out.println(newStr);
            }
        }
        
        
        
        return students;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.HR.PriorityQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author amand
 */
class Priorities {
    
    private final PriorityQueue<Student> studentQueue = new PriorityQueue<>(
            Comparator.comparing(Student::getCgpa).reversed()
                    .thenComparing(Student::getName)
                    .thenComparing(Student::getId)
    );
    
    public List<Student> getStudents(List<String> events) {
        int n = events.size();
        String str;
        String[] newStr;
        List<Student> studentList = new ArrayList<Student>();
        
        for (int i = 0; i < n; i++){
            if (events.get(i).charAt(5) == ' '){
                str = events.get(i);
                newStr = str.split(" ");
                Student student = new Student(newStr[3], newStr[1], newStr[2]);
                
                studentQueue.add(student);

            }
            else if(events.get(i).charAt(5) == 'D'){
                //System.out.println("asdas");
                studentQueue.poll();
            }
        }
        
        while (!studentQueue.isEmpty()){
            studentList.add(studentQueue.poll());
        }
        
        return studentList;
    }
}
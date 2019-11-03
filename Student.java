/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author USER
 */
public class Student {
    String name;
    int age;
    int course;
       int i=0;

    
  public Student(String s1,int AGE,int Course){
        this.name=s1;
        this.age=AGE;
        this.course=Course;     
        
    }
    
        
    
    public void printdata(){
        System.out.println("Welcome to university registration System");
        System.out.printf("\n\n....");
        System.out.println("Student Registration completed");
        System.out.printf("Name   :%s\n",name);
        System.out.printf("Age    :%d\n",age  );
        Course my=new Course();
        my.Courseno(course);
        
    }
}

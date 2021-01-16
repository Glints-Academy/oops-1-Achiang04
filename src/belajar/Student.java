package belajar;

import java.util.*;

public class Student extends Person{
    int numCourses;
    double averageGrade;
    double total;
    ArrayList<String> courses = new ArrayList<String>();
    ArrayList<Integer> grades = new ArrayList<Integer>();

    Student(String name, String address) {
        super(name, address);
    }

    public void addCourseGrade(String course, Integer grade){
        this.courses.add(course);
        this.grades.add(grade);
        numCourses++;
    }

    public void printGrades() {
        System.out.println("total course : " + this.numCourses);
        for (int i = 0; i < grades.size(); i++){
            System.out.println("grade " + this.grades.get(i));
            total = total + this.grades.get(i);
        }
    }

    public void getAverageGrade() {
        double length = this.grades.size();
        this.averageGrade = total/length;
        System.out.println("average : " + this.averageGrade);
    }

    public void addressToString(String address) {
        System.out.println("student address " + address);
    }

}



package belajar;

import java.util.ArrayList;

public class Teacher extends Person{
    int numCourses;
    ArrayList<String> courses = new ArrayList<String>();

    Teacher(String name, String address){
        super(name, address);
    }

    Boolean addCourse(String course){
        numCourses++;
        if(this.courses.contains(course)){
            return false;
        } else {
            this.courses.add(course);
            return true;
        }
    }

    Boolean removeCourse (String course){
        if(this.courses.contains(course)){
            this.courses.remove(course);
            return true;
        } else {
            return false;
        }
    }

    public void addressToString(String address) {
        System.out.println("teacher address " + address);
    }
}

package belajar;

public class Main {
    public static void main(String[] args) {
        Person orang1 = new Person("asep", "buntu");
        System.out.println(orang1.getName());
        System.out.println(orang1.getAddress());
        orang1.setAddress("baru");
        System.out.println(orang1.getAddress());
        orang1.addressToString("baru");

        System.out.println("\n==========================================\n");

        Student student1 = new Student("ucup", "salam");
        System.out.println(student1.getName());
        System.out.println(student1.getAddress());
        student1.addCourseGrade("belajar java", 10);
        student1.addCourseGrade("belajar oop java", 12);
        student1.printGrades();
        student1.getAverageGrade();
        student1.addressToString("salam");

        System.out.println("\n==========================================\n");

        Teacher guru1 = new Teacher("bambang", "merdeka");
        System.out.println(guru1.getName());
        System.out.println(guru1.getAddress());
        System.out.println(guru1.addCourse("belajar java"));
        System.out.println(guru1.addCourse("belajar java"));
        guru1.addCourse("test");
        System.out.println(guru1.removeCourse("test"));
        System.out.println(guru1.removeCourse("kosong"));
        guru1.addressToString("merdeka");
    }
}

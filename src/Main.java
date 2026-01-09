import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Creating instances of class Course
        System.out.println("Courses:");
        Course[] course = new Course[6];
        course[0] = new Course("Calculus 2", 5, 2);
        course[1] = new Course("Database Management System", 5, 2);
        course[2] = new Course("Discrete Mathematics", 5, 2);
        course[3] = new Course("Foreign Language 2", 5, 2);
        course[4] = new Course("Object Oriented Programming", 5, 2);
        course[5] = new Course("Physical Education 2", 2, 2);

        //Outputting all courses information by toString method using loop
        for (int i = 0; i < 6; i++){
            System.out.println(course[i].toString());
        }

        //Creating single university object of class University
        System.out.println(" ");
        System.out.println("University:");
        University university = new University("Astana IT University", "Astana, Mangilik El Avenue, 55/11", 2019);
        System.out.println(university);

        //Creating instances of class Professor
        System.out.println(" ");
        System.out.println("Professors:");
        Professor[] professor = new Professor[6];
        professor[0] = new Professor("Aleksei", "Petrov", LocalDate.of(1962, 6, 6), "Department of Mathematics", "M-214");
        professor[1] = new Professor("Alya", "Sagyndykova",LocalDate.of(1975, 3, 28),"Department of Computer Science", "CS-305");
        professor[2] = new Professor("Timur", "Akhmetov",LocalDate.of(1958, 9, 30),"Department of Applied Mathematics", "AM-118");
        professor[3] = new Professor("Maria", "Ivanova",LocalDate.of(1976, 12, 24),"Department of Foreign Languages", "FL-402");
        professor[4] = new Professor("Daniyar", "Kasymov",LocalDate.of(1956, 9, 25),"Department of Software Engineering", "SE-221");
        professor[5] = new Professor("Aibek", "Nurlanov",LocalDate.of(1975, 8, 5),"Department of Physical Education", "PE-010");

        //Outputting all professors information by toString method using loop
        for (int i = 0; i < 6; i++){
            System.out.println(professor[i].toString());
        }

        //Creating instances of class Student
        System.out.println(" ");
        System.out.println("Students:");
        Student[] student = new Student[6];
        student[0] = new Student("Timur","Bekzhanov", LocalDate.of(2007,5,17),2.63,2024);
        student[1] = new Student("Dana","Sadykova", LocalDate.of(2007,8,24),3.54,2024);
        student[2] = new Student("Nursultan","Akhmetov", LocalDate.of(2007,7,3),2.54,2024);
        student[3] = new Student("Ali","Kenzhebayev", LocalDate.of(2007,3,16),3.65,2024);
        student[4] = new Student("Aisha","Zholdasova", LocalDate.of(2007,4,25),3.57,2024);
        student[5] = new Student("Sara","Tursynbekova", LocalDate.of(2007,6,15),2.81,2024);

        //Outputting all students information by toString method using loop
        for (int i = 0; i < 6; i++){
            System.out.println(student[i].toString());
        }

        //Comparison
        System.out.println(" ");
        System.out.println("Comparison:");
        if (course[0].getCredits() > course[5].getCredits()) {
            System.out.println(course[0].getCrs_name() + " has more credits than " + course[5].getCrs_name());
        } else {
            System.out.println(course[5].getCrs_name() + " has more or equal credits than " + course[0].getCrs_name());
        }

        if (course[0].getCrs_id() > course[5].getCrs_id()) {
            System.out.println(course[0].getCrs_name() + " has greater id than " + course[5].getCrs_name());
        } else {
            System.out.println(course[5].getCrs_name() + " has greater id than " + course[0].getCrs_name());
        }

        //Filtering data
        System.out.println(" ");
        System.out.println("Filtering data:");
        ArrayList <Student> topStudents = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            if (student[i].getGpa() >= 3.5){
                topStudents.add(student[i]);
            }
        }

        //Output
        for (Student s : topStudents) {
            System.out.println(s.getFullName());
        }

        //Sorting data
        System.out.println(" ");
        System.out.println("Sorting data:");
        for (int i = 0; i < student.length - 1; i++) {
            for (int j = 0; j < student.length - i - 1; j++) {
                if (student[j].getGpa() > student[j + 1].getGpa()) {
                    Student temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
        }

        //Output
        for (Student s : student) {
            System.out.println(s.getFullName() + " - GPA: " + s.getGpa());
        }
    }
}
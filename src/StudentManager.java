import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager {
    private static final ArrayList<Student> students = new ArrayList<>();

    public static void addStudent(Student student){
        students.add(student);
    }

    public static void getAllStudents(){
        for (Student s: students){
            IO.println(s.getFullName() + "- GPA: " + s.getGpa() + " YearOfStudy: "
                    + s.getYear_of_study());
        }
    }

    public static void findById(int id){
        for (Student s: students){
            if (s.getStudent_id() == id){
                IO.println(s.getFullName() + "- GPA: " + s.getGpa() + " YearOfStudy: "
                        + s.getYear_of_study());
            }
        }
    }

    public static void filterByGpa(double gpa){
        for (Student s: students){
            if (s.getGpa() >= gpa) {
                IO.println(s.getFullName() + "- GPA: " + s.getGpa() + " YearOfStudy: "
                        + s.getYear_of_study());
            }
        }
    }

    public static void sortByGpa(){
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getGpa() < students.get(j).getGpa()) {
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }

    public static void sortById(){
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getStudent_id() < students.get(j).getStudent_id()) {
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }

    public void sortByFirstName() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getFirstName().compareTo(s2.getFirstName());
            }
        });
    }
}
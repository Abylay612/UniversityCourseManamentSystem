import java.util.*;

public class StudentManager implements Manager<Student>{
    private final ArrayList<Student> students = new ArrayList<>();

    @Override
    public void add(Student s){
        students.add(s);
    }

    @Override
    public List<Student> getAll(){
        return students;
    }

    //Finding students by id
    @Override
    public Student findById(String id){
        for (Student s: students){
            if (Objects.equals(s.getId(), id)){
                return s;
            }
        }
        return null;
    }

    //Finding students by id in ascending order
    @Override
    public void sortById() {
        students.sort(Comparator.comparing(Student::getId));
    }

    //Finding students by firstname
    @Override
    public Student findByName(String name){
        for (Student s: students){
            if (s.getFirstName().equalsIgnoreCase(name)){
                return s;
            }
        }
        return null;
    }

    //Case-insensitive name sorting
    @Override
    public void sortByName() {
        students.sort(Comparator.comparing(
                Student::getFirstName,
                String.CASE_INSENSITIVE_ORDER
        ));
    }

    //Filtering GPA by entered value
    public List<Student> filterByGpa(double gpa){
        List<Student> result = new ArrayList<>();
        for (Student s: students){
            if (s.getGpa() >= gpa) {
                result.add(s);
            }
        }
        return result;
    }

    //Sortation of students by GPA in ascending order
    public void sortByGpa() {
        students.sort(Comparator.comparingDouble(Student::getGpa).reversed());
    }
}
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class CourseManager implements Manager<Course>{
    private final ArrayList<Course> courses = new ArrayList<>();

    @Override
    public void add(Course c){
        courses.add(c);
    }

    @Override
    public List<Course> getAll(){
        return courses;
    }

    //Finding professors by id
    @Override
    public Course findById(String id){
        for (Course c: courses){
            if (Objects.equals(c.getCrs_code(), id)){
                return c;
            }
        }
        return null;
    }

    //Finding professors by id in ascending order
    @Override
    public void sortById() {
        courses.sort(Comparator.comparing(Course::getCrs_code));
    }

    //Finding students by firstname
    @Override
    public Course findByName(String name){
        for (Course c: courses){
            if (c.getCrs_name().equalsIgnoreCase(name)){
                return c;
            }
        }
        return null;
    }

    //Case-insensitive name sorting
    @Override
    public void sortByName() {
        courses.sort(Comparator.comparing(
                Course::getCrs_name,
                String.CASE_INSENSITIVE_ORDER
        ));
    }
}

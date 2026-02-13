import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ProfessorManager implements Manager<Professor>{
    private final ArrayList<Professor> professors = new ArrayList<>();

    @Override
    public void add(Professor p){
        professors.add(p);
    }

    @Override
    public List<Professor> getAll(){
        return professors;
    }

    //Finding professors by id
    @Override
    public Professor findById(String id){
        for (Professor p: professors){
            if (Objects.equals(p.getId(), id)){
                return p;
            }
        }
        return null;
    }

    //Finding professor by office number
    public Professor findByOffice(String office_number){
        for(Professor p: professors){
            if(p.getOffice_number().equals(office_number)){
                return p;
            }
        }
        return null;
    }

    //Finding professor by department
    public Professor findByDepartment(String department){
        for(Professor p: professors){
            if(p.getDepartment().equals(department)){
                return p;
            }
        }
        return null;
    }

    //Finding professors by id in ascending order
    @Override
    public void sortById() {
        professors.sort(Comparator.comparing(Professor::getId));
    }

    //Finding students by firstname
    @Override
    public Professor findByName(String name){
        for (Professor p: professors){
            if (p.getFirstName().equalsIgnoreCase(name)){
                return p;
            }
        }
        return null;
    }

    //Case-insensitive name sorting
    @Override
    public void sortByName() {
        professors.sort(Comparator.comparing(
                Professor::getFirstName,
                String.CASE_INSENSITIVE_ORDER
        ));
    }
}

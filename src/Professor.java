import java.time.LocalDate;
import java.util.Objects;

public class Professor extends Person {
    private String department;
    private String office_number;

    //constructors
    Professor(String professor_id, String first_name, String last_name, LocalDate birth_date, String department, String office_number){
        super(professor_id,first_name,last_name,birth_date);
        setDepartment(department);
        setOffice_number(office_number);
    }

    //Role of Professor
    @Override
    public String getRole() {
        return "Teaching";
    }

    //Getters
    public String getDepartment(){
        return department;
    }

    public String getOffice_number(){
        return office_number;
    }

    //Setters
    public void setDepartment(String department){
        this.department = department;
    }

    public void setOffice_number(String office_number){
        this.office_number = office_number;
    }

    //Overriding toString method
    @Override
    public String toString(){
        return "ID:" + getId() + ", FirstName:" + getFirstName() +
                ", LastName:" + getLastName() + ", Age:" + getAge() + ", Department:"
                + getDepartment() + ", Office:" + getOffice_number() + ", Role:" + getRole();
    }

    //Overriding equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor p)) return false;
        return Objects.equals(this.getId(), p.getId());
    }

    //Overriding hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName());
    }

    //Overriding displayInfo method
    @Override
    public void displayInfo(){
        IO.println("Id:" + getId() + " Name:" + getFullName() + " Department:"
                + getDepartment() + " Office:" + getOffice_number());
    }
}
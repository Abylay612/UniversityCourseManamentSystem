import java.time.LocalDate;

public class Professor extends Person {
    private final int employee_id;
    private static int id_gen = 1;
    private String department;
    private String office_number;

    //constructors
    Professor(String first_name, String last_name, LocalDate birth_date, String department, String office_number){
        employee_id = id_gen++;
        super(first_name,last_name,birth_date);
        setDepartment(department);
        setOffice_number(office_number);
    }

    //role
    @Override
    public String getRole() {
        return "Teaching";
    }

    //getters
    public int getEmployee_id(){
        return employee_id;
    }

    public String getDepartment(){
        return department;
    }

    public String getOffice_number(){
        return office_number;
    }

    //setters

    public void setDepartment(String department){
        this.department = department;
    }

    public void setOffice_number(String office_number){
        this.office_number = office_number;
    }

    //overriding toString method
    @Override
    public String toString(){
        return "ID:" + getEmployee_id() + ", FirstName:" + getFirstName() + ", LastName:" + getLastName() + ", Age:" + getAge() + ", Department:" + getDepartment() + ", Office:" + getOffice_number();
    }
}
public class Professor extends Person {
    private final int employee_id;
    private static int id_gen = 1;
    private String department;
    private String office_number;

    //constructors
    Professor(String first_name, String last_name, String department, String office_number){
        employee_id = id_gen++;
        super(first_name,last_name);
        setDepartment(department);
        setOffice_number(office_number);
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

    //toString
    @Override
    public String ToString(){
        return "ID:" + employee_id + ", FirstName:" + getFirstName() + ", LastName:" + getLastName() + ", Department:" + department + ", Office:" + office_number;
    }
}
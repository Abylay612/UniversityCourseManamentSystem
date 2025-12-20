public class Professor {
    private final int employee_id;
    private static int id_gen = 1;
    private String first_name;
    private String last_name;
    private String department;
    private String office_number;

    //constructors
    Professor(){
        employee_id = id_gen++;
    }

    Professor(String first_name, String last_name, String department, String office_number){
        this();
        setFirst_name(first_name);
        setLast_name(last_name);
        setDepartment(department);
        setOffice_number(office_number);
    }

    //getters
    public int getEmployee_id(){
        return employee_id;
    }

    public String getFirst_name(){
        return first_name;
    }

    public String getLast_name(){
        return last_name;
    }

    public String getDepartment(){
        return department;
    }

    public String getOffice_number(){
        return office_number;
    }

    //setters
    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }

    public void setLast_name(String last_name){
        this.last_name = last_name;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setOffice_number(String office_number){
        this.office_number = office_number;
    }

    //displayInfo
    public String displayInfo(){
        return "ID:" + employee_id + ", FirstName:" + first_name + ", LastName:" + last_name + ", Department:" + department + ", Office:" + office_number;
    }
}
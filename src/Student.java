import java.time.LocalDate;
import java.util.Objects;

public class Student extends Person{
    private double gpa;
    private int year_of_study;

    Student(String student_id, String first_name, String last_name, LocalDate birth_date, double gpa, int year_of_study){
        super(student_id,first_name,last_name,birth_date);
        setGpa(gpa);
        setYear_of_study(year_of_study);
    }

    //Role of student
    @Override
    public String getRole(){
        return "Learning";
    }

    //Getters
    public double getGpa(){
        return gpa;
    }

    public int getYear_of_study(){
        return year_of_study;
    }

    //Setters
    public void setGpa(double gpa){
        if (gpa >= 0.0 && gpa <= 4.0){
            this.gpa = gpa;
        }
        else if (gpa < 0.0){
            System.out.println("GPA cannot be less than 0.0");
        }
        else{
            System.out.println("GPA cannot be greater than 4.0");
        }
    }

    public void setYear_of_study(int year_of_study){
        this.year_of_study = year_of_study;
    }

    //Overriding toString method
    @Override
    public String toString() {
        return "Id:" + getId() + ", FullName:" + getFullName() + ", Age:" + getAge() + ", GPA:"
                + getGpa() + ", YearOfStudy:" + getYear_of_study() + " ,DateOfBirth:"
                + getBirth_date() + ", Role:" + getRole();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student s)) return false;
        return Objects.equals(this.getId(), s.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName());
    }

    //displayInfo method
    @Override
    public void displayInfo(){
        IO.println("Id:" + getId() + " Name:" + getFullName() + " GPA:"
                + getGpa() + " YearOfStudy:" + getYear_of_study());
    }
}
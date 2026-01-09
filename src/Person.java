import java.time.LocalDate;
import java.time.Period;

public abstract class Person {
    private String first_name;
    private String last_name;
    private LocalDate birth_date;

    Person(String first_name,String last_name,LocalDate birth_date){
        setFirst_name(first_name);
        setLast_name(last_name);
        setBirth_date(birth_date);
    }

    //role
    public  abstract String getRole();

    //getters
    public String getFirstName(){
        return first_name;
    };

    public String getLastName(){
        return last_name;
    };

    public String getFullName(){
        return getFirstName() + " " + getLastName();
    }

    public LocalDate getBirth_date(){
        return birth_date;
    }

    public int getAge() {
        return Period.between(birth_date, LocalDate.now()).getYears();
    }

    //setters
    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }

    public void setLast_name(String last_name){
        this.last_name = last_name;
    }

    public void setBirth_date(LocalDate birth_date){
        this.birth_date = birth_date;
    }

    //ToString
    public abstract String toString();
}
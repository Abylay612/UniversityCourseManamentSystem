import java.util.ArrayList;
import java.util.List;

public class University {
    private final int uni_id;
    private static int id_gen = 1;
    private String uni_name;
    private String location;
    private int established_year;

    //constructors
    University(){
        uni_id = id_gen++;
    }

    University(String uni_name, String location, int established_year){
        this();
        setName(uni_name);
        setLocation(location);
        setYear(established_year);
    }

    //getters
    public int getUni_id(){
        return uni_id;
    }

    public String getName(){
        return uni_name;
    }

    public String getLocation(){
        return location;
    }

    public int getYear(){
        return established_year;
    }

    //setters
    public void setName(String uni_name){
        this.uni_name = uni_name;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setYear(int established_year){
        this.established_year = established_year;
    }

    //overriding toString method
    @Override
    public String toString(){
        return "ID:" + getUni_id() + ", Name:" + getName() + ", Location:" + getLocation() + ", Year:" + getYear();
    }
}
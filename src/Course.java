public class Course {
    private final int crs_id;
    private static int id_gen = 1;
    private String crs_name;
    private int crs_credits;
    private int semester;

    //constructors
    Course(){
        crs_id = id_gen++;
    }

    Course(String crs_name, int crs_credits, int semester){
        this();
        setCrs_name(crs_name);
        setCredits(crs_credits);
        setSemester(semester);
    }

    //getters
    public int getCrs_id(){
        return crs_id;
    }

    public String getCrs_name(){
        return crs_name;
    }

    public int getCredits(){
        return crs_credits;
    }

    public int getSemester(){
        return semester;
    }

    //setters
    public void setCrs_name(String crs_name){
        this.crs_name = crs_name;
    }

    public void setCredits(int course_credits){
        this.crs_credits = course_credits;
    }

    public void setSemester(int semester){
        this.semester = semester;
    }

    //displayInfo
    public String displayInfo(){
        return "ID:" + crs_id + ", CourseName:" + crs_name + ", Credits:" + crs_credits + ", Semester:" + semester;
    }
}
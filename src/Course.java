public class Course {
    private String crs_code;
    private String crs_name;
    private int crs_credits;
    private int semester;


    //Constructor
    Course(String crs_code, String crs_name, int crs_credits, int semester){
        setCrs_code(crs_code);
        setCrs_name(crs_name);
        setCredits(crs_credits);
        setSemester(semester);
    }

    //Getters

    public String getCrs_code(){ return crs_code;}

    public String getCrs_name(){
        return crs_name;
    }

    public int getCredits(){
        return crs_credits;
    }

    public int getSemester(){
        return semester;
    }

    //Setters
    public void setCrs_code(String crs_code) {
        this.crs_code = crs_code;
    }

    public void setCrs_name(String crs_name){
        this.crs_name = crs_name;
    }

    public void setCredits(int course_credits){
        this.crs_credits = course_credits;
    }

    public void setSemester(int semester){
        this.semester = semester;
    }

    //Overriding toString method
    @Override
    public String toString(){
        return "CourseCode:" + getCrs_code() + ", CourseName:" + getCrs_name() + ", Credits:"
                + getCredits() + ", Semester:" + getSemester();
    }

    public void displayInfo(){
        IO.println("CourseCode:" + getCrs_code() + ", CourseName:" + getCrs_name() + ", Credits:"
                + getCredits() + ", Semester:" + getSemester());
    }
}
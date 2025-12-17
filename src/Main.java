public class Main {
    public static void main(String[] args){
        System.out.println("Courses:");
        Course[] course = new Course[6];
        course[0] = new Course("Calculus 3",5,2);
        course[1] = new Course("Database Management System",5,2);
        course[2] = new Course("Discrete Mathematics",5,2);
        course[3] = new Course("Foreign Language 2",5,2);
        course[4] = new Course("Object Oriented Programming",5,2);
        course[5] = new Course("Physical Education 2",2,2);
        System.out.println(course[0].ToString());
        System.out.println(course[1].ToString());
        System.out.println(course[2].ToString());
        System.out.println(course[3].ToString());
        System.out.println(course[4].ToString());
        System.out.println("ID:" + course[5].getCrs_id());
        System.out.println("CourseName:" + course[5].getCrs_name());
        System.out.println("Credits:" + course[5].getCredits());
        System.out.println("Semester:" + course[5].getSemester());

        System.out.println(" ");
        System.out.println("University:");
        University university = new University("Astana IT University","Astana, Mangilik El Avenue, 55/11",2019);
        System.out.println(university);
        System.out.println("ID:" + university.getUni_id());
        System.out.println("Name" + university.getName());
        System.out.println("Location" + university.getLocation());
        System.out.println("Year:" + university.getYear());

        System.out.println(" ");
        System.out.println("Professors:");
        Professor[] professor = new Professor[6];
        professor[0] = new Professor("Aleksei", "Petrov", "Department of Mathematics", "M-214");
        professor[1] = new Professor("Alya", "Sagyndykova", "Department of Computer Science", "CS-305");
        professor[2] = new Professor("Timur", "Akhmetov", "Department of Applied Mathematics", "AM-118");
        professor[3] = new Professor("Maria", "Ivanova", "Department of Foreign Languages", "FL-402");
        professor[4] = new Professor("Daniyar", "Kasymov", "Department of Software Engineering", "SE-221");
        professor[5] = new Professor("Aibek", "Nurlanov", "Department of Physical Education", "PE-010");
        System.out.println(professor[0].ToString());
        System.out.println(professor[1].ToString());
        System.out.println(professor[2].ToString());
        System.out.println(professor[3].ToString());
        System.out.println(professor[4].ToString());
        System.out.println("ID:" + professor[5].getEmployee_id());
        System.out.println("FirstName:" + professor[5].getFirst_name());
        System.out.println("LastName:" + professor[5].getLast_name());
        System.out.println("Department:" + professor[5].getDepartment());
        System.out.println("Office:" + professor[5].getOffice_number());
    }
}
void main() throws Exception {

    //Creating instances of the class Course
    Course[] course = new Course[6];
    course[0] = new Course("Calculus 2", 5, 2);
    course[1] = new Course("Database Management System", 5, 2);
    course[2] = new Course("Discrete Mathematics", 5, 2);
    course[3] = new Course("Foreign Language 2", 5, 2);
    course[4] = new Course("Object Oriented Programming", 5, 2);
    course[5] = new Course("Physical Education 2", 2, 2);


    //Creating the single university object of a class University
    University university = new University("Astana IT University", "Astana, Mangilik El Avenue, 55/11", 2019);
    IO.println(university);


    //Creating instances of the class Professor
    Professor[] professor = new Professor[6];
    professor[0] = new Professor("Aleksei", "Petrov", LocalDate.of(1962, 6, 6), "Department of Mathematics", "M-214");
    professor[1] = new Professor("Alya", "Sagyndykova", LocalDate.of(1975, 3, 28), "Department of Computer Science", "CS-305");
    professor[2] = new Professor("Timur", "Akhmetov", LocalDate.of(1958, 9, 30), "Department of Applied Mathematics", "AM-118");
    professor[3] = new Professor("Maria", "Ivanova", LocalDate.of(1976, 12, 24), "Department of Foreign Languages", "FL-402");
    professor[4] = new Professor("Daniyar", "Kasymov", LocalDate.of(1956, 9, 25), "Department of Software Engineering", "SE-221");
    professor[5] = new Professor("Aibek", "Nurlanov", LocalDate.of(1975, 8, 5), "Department of Physical Education", "PE-010");


    //Creating instances of the class Student
    Student[] student = new Student[6];
    student[0] = new Student("Timur", "Bekzhanov", LocalDate.of(2007, 5, 17), 2.63, 1);
    student[1] = new Student("Dana", "Sadykova", LocalDate.of(2007, 8, 24), 3.54, 1);
    student[2] = new Student("Nursultan", "Akhmetov", LocalDate.of(2007, 7, 3), 2.54, 1);
    student[3] = new Student("Ali", "Kenzhebayev", LocalDate.of(2007, 3, 16), 3.65, 1);
    student[4] = new Student("Aisha", "Zholdasova", LocalDate.of(2007, 4, 25), 3.57, 1);
    student[5] = new Student("Sara", "Tursynbekova", LocalDate.of(2007, 6, 15), 2.81, 1);


    //Comparison
    IO.println(" ");
    IO.println("Comparison:");
    if (course[0].getCredits() > course[5].getCredits()) {
        IO.println(course[0].getCrs_name() + " has more credits than " + course[5].getCrs_name());
    } else {
        IO.println(course[5].getCrs_name() + " has more or equal credits than " + course[0].getCrs_name());
    }

    if (course[0].getCrs_id() > course[5].getCrs_id()) {
        IO.println(course[0].getCrs_name() + " has greater id than " + course[5].getCrs_name());
    } else {
        IO.println(course[5].getCrs_name() + " has greater id than " + course[0].getCrs_name());
    }


    //Creating object of the class StudentManager to search, filter, sort the data about students
    StudentManager manager = new StudentManager();

    //Adding objects of the Student class to store them in array
    for (Student s: student){
        StudentManager.addStudent(s);
    }
    Scanner scanner = new Scanner(System.in);

    //Creating a console application to implement methods of the StudentManager class
        try{
            while (true){
                IO.println("1.Find by id");
                IO.println("2.Filter by gpa");
                IO.println("3.Get all students");
                IO.println("4.Sort by GPA");
                IO.println("5.Sort by ID");
                IO.println("6.Exit");

                IO.println("Enter command number:");
                int command = scanner.nextInt();

                if (command == 1){
                    IO.println("Enter student id:");
                    StudentManager.findById(scanner.nextInt());
                } else if (command == 2) {
                    IO.println("Enter minimal GPA for filtration:");
                    StudentManager.filterByGpa(scanner.nextDouble());
                } else if (command == 3) {
                    StudentManager.getAllStudents();
                } else if (command == 4) {
                    StudentManager.sortByGpa();
                    IO.println("Students sorted by GPA");
                } else if (command == 5) {
                    StudentManager.sortById();
                    IO.println("Students sorted by ID");
                } else if (command == 6) {
                    break;
                } else{
                    IO.println("This command does not exist");
                }
            }
        }
        catch (InputMismatchException e){
            IO.println("The number must be entered: " + e.getMessage());
        }
}
void main() {
    //Creating the single university object of a class University
    University university = new University("Astana IT University", "Astana, Mangilik El Avenue, 55/11", 2019);
    IO.println(university);

    StudentManager studentManager = new StudentManager();
    ProfessorManager professorManager = new ProfessorManager();
    CourseManager courseManager = new CourseManager();

    //Creating instances of the class Course
    Course[] course = new Course[6];
    course[0] = new Course("MATH202","Calculus 2", 5, 2);
    course[1] = new Course("CS204","Database Management Systems", 5, 2);
    course[2] = new Course("MATH201","Discrete Mathematics", 5, 2);
    course[3] = new Course("FL102","Foreign Language 2", 5, 2);
    course[4] = new Course("CS203","Object Oriented Programming", 5, 2);
    course[5] = new Course("PE102","Physical Education 2", 2, 2);


    //Creating instances of the class Professor
    Professor[] professor = new Professor[6];
    professor[0] = new Professor("P001","Aleksei", "Petrov", LocalDate.of(1962, 6, 6), "Department of Mathematics", "M-214");
    professor[1] = new Professor("P002","Alya", "Sagyndykova", LocalDate.of(1975, 3, 28), "Department of Computer Science", "CS-305");
    professor[2] = new Professor("P003","Timur", "Akhmetov", LocalDate.of(1958, 9, 30), "Department of Applied Mathematics", "AM-118");
    professor[3] = new Professor("P004","Maria", "Ivanova", LocalDate.of(1976, 12, 24), "Department of Foreign Languages", "FL-402");
    professor[4] = new Professor("P005","Daniyar", "Kasymov", LocalDate.of(1956, 9, 25), "Department of Software Engineering", "SE-221");
    professor[5] = new Professor("P006","Aibek", "Nurlanov", LocalDate.of(1975, 8, 5), "Department of Physical Education", "PE-010");


    //Creating instances of the class Student
    Student[] student = new Student[6];
    student[0] = new Student("S0001","Timur", "Bekzhanov", LocalDate.of(2007, 5, 17), 2.63, 1);
    student[1] = new Student("S0002","Dana", "Sadykova", LocalDate.of(2007, 8, 24), 3.54, 1);
    student[2] = new Student("S0003","Nursultan", "Akhmetov", LocalDate.of(2007, 7, 3), 2.54, 1);
    student[3] = new Student("S0004","Ali", "Kenzhebayev", LocalDate.of(2007, 3, 16), 3.65, 1);
    student[4] = new Student("S0005","Aisha", "Zholdasova", LocalDate.of(2007, 4, 25), 3.57, 1);
    student[5] = new Student("S0006","Sara", "Tursynbekova", LocalDate.of(2007, 6, 15), 2.81, 1);


    //Comparison
    IO.println(" ");
    IO.println("Comparison:");
    if (course[0].getCredits() > course[5].getCredits()) {
        IO.println(course[0].getCrs_name() + " has more credits than " + course[5].getCrs_name());
    } else {
        IO.println(course[5].getCrs_name() + " has more or equal credits than " + course[0].getCrs_name());
    }


    //Creating object of the class Manager to search, filter, sort the data
    while(true){
        Scanner scanner = new Scanner(System.in);
        IO.println("1.StudentManager\n2.ProfessorManager\n3.CourseManager\n4.Exit\nEnter command number:");
        int command = scanner.nextInt();

        switch (command){
            case 1:
                student_manager(studentManager,student);
                break;
            case 2:
                professor_manager(professorManager,professor);
                break;
            case 3:
                course_manager(courseManager,course);
                break;
            case 4:
                return;
            default:
                IO.println("This command does not exist");
        }
    }
}

private void student_manager(StudentManager manager,Student[] student) {
    Scanner sc = new Scanner(System.in);

    for (Student s: student){
        manager.add(s);
    }

    while(true){
        IO.println("1.Get all students\n2.Find by id\n3.Sort by id\n4.Find by name\n5.Sort by name\n6.Filter by GPA\n7.Sort by GPA\n8.Exit");
        IO.println(" ");
        int command1 = sc.nextInt();
        switch(command1){
            case 1:
                for(Student s: manager.getAll()){
                    s.displayInfo();
                }
                break;
            case 2:
                IO.println("Enter student id:");
                sc.nextLine();
                manager.findById(sc.nextLine()).displayInfo();
                break;
            case 3:
                manager.sortById();
                IO.println("Sorted by id");
                break;
            case 4:
                IO.println("Enter name:");
                sc.nextLine();
                manager.findByName(sc.nextLine()).displayInfo();
                break;
            case 5:
                manager.sortByName();
                IO.println("Sorted by name");
                break;
            case 6:
                IO.println("Enter GPA to filter:");
                sc.nextLine();
                manager.filterByGpa(sc.nextDouble());
            case 7:
                manager.sortByGpa();
                IO.println("Sorted by GPA");
                break;
            case 8:
                return;
            default:
                IO.println("Invalid command");
        }
    }
}

private void professor_manager(ProfessorManager manager,Professor[] professor) {
    Scanner sc = new Scanner(System.in);

    for (Professor p: professor){
        manager.add(p);
    }

    while(true){
        IO.println("1.Get all professors\n2.Find by id\n3.Sort by id\n4.Find by name\n5.Sort by name\n6.Find by office number\n7.Find by department\n8.Exit");
        IO.println(" ");
        int command1 = sc.nextInt();
        switch(command1){
            case 1:
                for(Professor p: manager.getAll()){
                    p.displayInfo();
                }
            case 2:
                IO.println("Enter professor id:");
                sc.nextLine();
                manager.findById(sc.nextLine()).displayInfo();
                break;
            case 3:
                manager.sortById();
                IO.println("Sorted by id");
                break;
            case 4:
                IO.println("Enter name:");
                sc.nextLine();
                manager.findByName(sc.nextLine());
                break;
            case 5:
                manager.sortByName();
                IO.println("Sorted by name");
                break;
            case 6:
                IO.println("Enter office number:");
                sc.nextLine();
                manager.findByOffice(sc.nextLine()).displayInfo();
            case 7:
                IO.println("Enter department:");
                sc.nextLine();
                manager.findByDepartment(sc.nextLine()).displayInfo();
            case 8:
                return;
            default:
                IO.println("Invalid command");
        }
    }
}

private void course_manager(CourseManager manager,Course[] course) {
    Scanner sc = new Scanner(System.in);

    for (Course c: course){
        manager.add(c);
    }

    while(true){
        IO.println("1.Get all courses\n2.Find by id\n3.Sort by id\n4.Find by name\n5.Sort by name\n6.Exit");
        IO.println(" ");
        int command1 = sc.nextInt();
        switch(command1){
            case 1:
                for(Course c: manager.getAll()){
                    c.displayInfo();
                }
                break;
            case 2:
                IO.println("Enter course id:");
                sc.nextLine();
                manager.findById(sc.nextLine()).displayInfo();
                break;
            case 3:
                manager.sortById();
                IO.println("Sorted by id");
                break;
            case 4:
                IO.println("Enter name:");
                sc.nextLine();
                manager.findByName(sc.nextLine()).displayInfo();
                break;
            case 5:
                manager.sortByName();
                IO.println("Sorted by name");
                break;
            case 6:
                return;
            default:
                IO.println("Invalid command");
        }
    }
}
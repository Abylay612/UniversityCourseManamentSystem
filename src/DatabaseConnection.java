import java.sql.*;

void main() throws Exception {
    while (true) {
        final String DB_USERNAME = "postgres";
        final String DB_PASSWORD = "A5tr4Fr0mPr025!";
        final String DB_URL = "jdbc:postgresql://localhost:5432/university_course_manament_system";

        Scanner scanner = new Scanner(System.in);

        Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        IO.println("1.Show all records of students in table");
        IO.println("2.Retrieve a single record from student table");
        IO.println("3.Delete one record from student table");
        IO.println("4.Insert a new record into student table");
        IO.println("5.Update a record about student");
        IO.println("6.Exit");

        int command = scanner.nextInt();

        if (command == 1) {
            Statement statement = connection.createStatement();
            String SQL_SELECT_STUDENTS = "select * from student order by student_id asc";
            ResultSet result = statement.executeQuery(SQL_SELECT_STUDENTS);

            while (result.next()) {
                IO.println(result.getInt("student_id") + " " + result.getString("first_name")+ " " + result.getString("last_name")
                        + " " + result.getBigDecimal("gpa") + " "
                        + result.getInt("year_of_study"));
            }
        } else if (command == 2) {
            String sql = "select * from student where student_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            IO.println("Enter Student ID for selection:");
            int student_id = scanner.nextInt();
            preparedStatement.setInt(1, student_id);
            preparedStatement.executeUpdate();
        } else if (command == 3) {
            String sql = "delete from student where student_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            IO.println("Enter Student ID for deleting record:");
            int student_id = scanner.nextInt();
            preparedStatement.setInt(1, student_id);
            preparedStatement.executeUpdate();
        } else if (command == 4) {
            String sql = "insert into student (first_name, last_name, gpa, year_of_study) values (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            IO.println("Enter first name:");
            scanner.nextLine();
            String first_name = scanner.nextLine();

            IO.println("Enter last name:");
            String last_name = scanner.nextLine();

            IO.println("Enter GPA:");
            BigDecimal gpa = scanner.nextBigDecimal();

            IO.println("Enter year of study:");
            int year_of_study = scanner.nextInt();

            preparedStatement.setString(1, first_name);
            preparedStatement.setString(2, last_name);
            preparedStatement.setBigDecimal(3, gpa);
            preparedStatement.setInt(4, year_of_study);

            preparedStatement.executeUpdate();
            IO.println("Student inserted successfully.");

            int rows = preparedStatement.executeUpdate();
            if (rows > 0) {
                IO.println("Insert successful");
            }
        } else if (command == 5) {

            String sql = "update student SET first_name = ?, last_name = ?, gpa = ?, year_of_study = ? where student_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            IO.println("Enter Student ID to update:");
            int student_id = scanner.nextInt();
            scanner.nextLine();

            IO.println("Enter new first name:");
            String first_name = scanner.nextLine();

            IO.println("Enter new last name:");
            String last_name = scanner.nextLine();

            IO.println("Enter new GPA:");
            BigDecimal gpa = scanner.nextBigDecimal();

            IO.println("Enter new year of study:");
            int year_of_study = scanner.nextInt();

            preparedStatement.setString(1, first_name);
            preparedStatement.setString(2, last_name);
            preparedStatement.setBigDecimal(3, gpa);
            preparedStatement.setInt(4, year_of_study);
            preparedStatement.setInt(5, student_id);

            int rows = preparedStatement.executeUpdate();

            IO.println(rows + " record(s) updated.");
        } else if (command == 6) {
            System.exit(0);
        } else {
            System.err.println("Command not found");
        }
    }
}
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        try {
            // Connect to the database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/departments", "username", "password");

            // Create a PreparedStatement
            String query = "INSERT INTO department (id, name) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Insert Department objects into the database
            Department department1 = new Department(1, "HR");
            Department department2 = new Department(2, "IT");

            preparedStatement.setInt(1, department1.getId());
            preparedStatement.setString(2, department1.getName());
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, department2.getId());
            preparedStatement.setString(2, department2.getName());
            preparedStatement.executeUpdate();

            System.out.println("Department objects have been successfully stored in the database.");

            // Close the resources
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

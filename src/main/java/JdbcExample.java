import java.sql.*;

public class JdbcExample {
    // java ; JDBC  -> database
    // Java Database Connectivity
    // 1- The driver
    //SQl mysql,postgres ,
    // link to database
    // username,password

    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/demo_db";
        String username = "root";
        String password = "arman2015";
        Statement statement = null;
        ResultSet resultSet = null;
        Connection conn = null;
        try {
             conn = DriverManager.getConnection(dbUrl, username, password);
            System.out.println("Connected to database successfully ");
          statement = conn.createStatement();
      resultSet = statement.executeQuery("SELECT * FROM employees");
            statement = conn.createStatement();
                         statement.execute("INSERT INTO employees VALUES(NULL,'Jack',44)");



        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            System.out.println("ID: "+id+" Name: "+name+" Age: "+age);

        }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        // Execute the sql statements




    }


}

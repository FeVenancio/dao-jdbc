import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/coursejdbc";
        String user = "root";
        String password = "Venancio11@";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado com sucesso!");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

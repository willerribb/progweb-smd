package E2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(); //deixando de placeholder

        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver da base de dados não encontrado.", e);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar à base de dados.", e);
        }
    }
}

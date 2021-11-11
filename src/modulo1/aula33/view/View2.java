package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class View2 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            conn.close();
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar");
        }
    }
}

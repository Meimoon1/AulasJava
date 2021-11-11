package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class View{
    //alternativa com as variáveis quebradas, que fica mais fácil de alterar
    public static void main(String[] args) {
        try {
            String driverType = "jadbc";
            String driverName = "postgresql";
            String host = "localhost";
            int porta = 5432;
            String database = "postgres"; 
            String user = "postgres";

            String connectionString = String.format("%s:%s://%d%s",driverType, driverName, host, porta, database);String pwd = "123456";
            Connection conn = DriverManager.getConnection(connectionString, user,pwd);

            conn.close();
        } 
        catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String url;
    private String user;
    private String password;

    public ConnectionFactory(){
        this.url="jdbc:postgresql://192.168.0.18:5432/postgres";
        this.user ="postgres";
        this.password = "123456";
    }
    
    public Connection getConnection() throws SQLException{
        Connection conn = DriverManager.getConnection(this.url, this.user,this.password );
        return conn;
    }

    
}
// padrão de projeto FACTORY
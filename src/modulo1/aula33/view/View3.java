package view;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class View3 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
     
            Statement statement = conn.createStatement();
            String sql = "INSERT INTO PESSOA(nome,sobrenome,idade,endereco_id)values('Teste','Java',2,1)";
            statement.execute(sql, statement.RETURN_GENERATED_KEYS);
            ResultSet ids = statement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt(1);
                System.out.println(id);
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar");
        }
    }
}

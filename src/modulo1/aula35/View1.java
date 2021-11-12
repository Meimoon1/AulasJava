import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.ConnectionFactory;

public class View1{

    public static void main(String[] args) {
        try {
            int idDeletado = 26;

            Connection conn = new ConnectionFactory().getConnection();
            
            String sql = "DELETE FROM categoria WHERE id = ?";
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setInt(1, idDeletado);

            prepStatement.execute();   
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);    

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
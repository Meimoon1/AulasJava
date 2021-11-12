package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View2 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            // statement(query sql) é como executa um comando sql
            Statement statement = conn.createStatement();
            statement.execute("SELECT * FROM PESSOA");

            //result tem o resultado da consulta 
            ResultSet result = statement.getResultSet();

            //imprimir o resultado
            while(result.next()){
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String sobrenome = result.getString("sobrenome");
                System.out.printf("%d- %s %s \n", id, nome, sobrenome);
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar");
        }
    }
}

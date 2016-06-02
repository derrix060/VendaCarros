/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aluno
 */
public class Conexao {
    public static Statement getStmt() throws ClassNotFoundException, SQLException{
        return getConnection().createStatement();
    }
    
    private static Connection getConnection() throws ClassNotFoundException, SQLException{ //metodo para pegar a conexao com o banco de dados        
        //DriverManager.getConnection(url); //teste para a conexao com o banco
        //Class.forName("org.postgresql.Driver"); //nome da classe(driver) de conexão
        Connection con;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/concessionaria_old", "root", ""); //Pega(estabelece) a conexão
      
        return con;
    }
}

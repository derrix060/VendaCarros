package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author mario
 */
public class ClienteDAO {
    private Connection conexao;
    private Statement stmt;
    private ResultSet rs;
    private String sql;
    
    
    
    
    public boolean insertCliente (Cliente cliente) throws SQLException, ClassNotFoundException{
        createConnection();
        
        sql = "INSERT INTO clientes VALUES ('"
                + cliente.getCpf() + "','"
                + cliente.getNomeCompleto() + "','"
                + cliente.getIdade() + "','"
                + cliente.getDdd() + "','"
                + cliente.getTelefone() 
                + "');";
        
        if (stmt.executeUpdate(sql) <= 0){
            System.err.println("Cliente " + cliente.getCpf() + " não foi inserido!!");
            return false;
        }
        else
            return true;
    }
    
    public ArrayList<Cliente> selectAll() throws ClassNotFoundException, SQLException{
        ArrayList<Cliente> resposta = new ArrayList<>();
        Cliente cli = new Cliente();
        createConnection();
        
        sql = "SELECT * FROM clientes";
        
        rs = stmt.executeQuery(sql);
                
        while (rs.next()){
            cli.setCpf(rs.getString(1));
            cli.setNomeCompleto(rs.getString(2));
            cli.setIdade(Integer.parseInt(rs.getString(3)));
            cli.setDdd(Integer.parseInt(rs.getString(4)));
            cli.setTelefone(Integer.parseInt(rs.getString(5)));
            
            resposta.add(cli);
        }
        
        return resposta;
    }
    
    public Cliente selectClientePorCPF (String cpf) throws ClassNotFoundException, SQLException{
        Cliente cli = new Cliente();
        createConnection();
        
        sql = "SELECT * FROM clientes WHERE cpf = '"
                + cpf + "'";
        
        rs = stmt.executeQuery(sql);
        
        if (!rs.first()){
            System.err.println("CPF: " + cpf + " não encontrado!! ");
            return null;
        }
           
        cli.setCpf(rs.getString(1));
        cli.setNomeCompleto(rs.getString(2));
        cli.setIdade(Integer.parseInt(rs.getString(3)));
        cli.setDdd(Integer.parseInt(rs.getString(4)));
        cli.setTelefone(Integer.parseInt(rs.getString(5)));
        
        return cli;
    }
    
    private Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection con;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/concessionaria","root","");
        return con;
    }
    
    private void createConnection() throws ClassNotFoundException, SQLException{
        conexao = getConnection();
        stmt = conexao.createStatement();
    }
}

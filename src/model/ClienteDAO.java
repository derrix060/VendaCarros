package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ClienteDAO {
    Statement stmt;
    ResultSet rs;
    
    public void inserirNovoCliente (Cliente cliente) throws SQLException, ClassNotFoundException{
        stmt = Conexao.getStmt(); //Toda a clausula sql(select, insert...) recaira sobre essa conexao
        String sql;
        sql = "INSERT INTO cliente VALUES ('" 
                + cliente.getCpf()+ "','" 
                + cliente.getNomeCompleto()+ "','" 
                + cliente.getIdade()+ "','" 
                + cliente.getDdd()+ "','" 
                + cliente.getTelefone()+ "')" ;
        if(stmt.executeUpdate(sql) > 0)
            System.out.println("Dados do cliente gravados com sucesso");
        else
            System.err.println("Erro de gravação no BD");
    }
    
    //Atencao: devera ser incluido na biblioteca o driver do jdbc para ser utilizado
    

    public Cliente buscarClienteCpf(String cpf) throws SQLException, ClassNotFoundException {
        stmt = Conexao.getStmt();
        rs = stmt.executeQuery("SELECT * FROM cliente WHERE cpf = '" + cpf + "'");
        
        return rsToCliente(rs);
    }

    public ArrayList<Cliente> listarTodosClientes() throws ClassNotFoundException, SQLException {
        stmt = Conexao.getStmt();
        rs = stmt.executeQuery("SELECT * FROM cliente");
        return rsToClienteArray(rs);
    }
    


    public void alterarDadosCLiente(Cliente cliente) throws ClassNotFoundException, SQLException {
        stmt = Conexao.getStmt();
        String sql;
        sql = "UPDATE cliente SET "
                + "nomeCompleto = '"+cliente.getNomeCompleto()+"',"
                + "idade= "+cliente.getIdade()+ ","
                + "ddd= "+cliente.getDdd()
                + "telefone= "+cliente.getTelefone()+ ","
                + " WHERE cpf = '" +cliente.getCpf() +"'";
        
        if(stmt.executeUpdate(sql) > 0)
            System.out.println("Atualizacao Realizada!");
        else
            System.err.println("Dados do cliente NAO foram atualizados!");
        
    }
    
    // metodo para excluir um cliente
    public void excluirCliente(String cpf) throws ClassNotFoundException, SQLException{
        stmt = Conexao.getStmt();
        String sql;
        sql = "DELETE FROM cliente WHERE cpf = '" + cpf + "'";
        if(stmt.executeUpdate(sql) > 0)
            System.out.println("Cliente excluído com sucesso!");
        
        else
            System.err.println("Cliente não encontrado para exclusão!");
                    
        
    }    

    
    //Conversoes
    private Cliente rsToCliente (ResultSet rs) throws SQLException{
        Cliente cliente = new Cliente();
        
        if (rs.next()){
            cliente.setCpf(rs.getString("cpf"));
            cliente.setNomeCompleto(rs.getString("nomeCompleto"));
            cliente.setIdade(rs.getInt("idade"));
            cliente.setDdd(rs.getInt("ddd"));
            cliente.setTelefone(rs.getInt("telefone"));
        }
        
        return cliente;
        
    }
    private ArrayList<Cliente> rsToClienteArray(ResultSet rs) throws SQLException{
        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente cliente = new Cliente();
        while (rs.next()){
            cliente.setCpf(rs.getString("cpf"));
            cliente.setNomeCompleto(rs.getString("nomeCompleto"));
            cliente.setIdade(rs.getInt("idade"));
            cliente.setDdd(rs.getInt("ddd"));
            cliente.setTelefone(rs.getInt("telefone"));
            
            clientes.add(cliente);
        }
        
        return clientes;
    }
    
}

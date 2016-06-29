/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class PropostaDAO {
    Statement stmt;
    ResultSet rs;
    
    public void inserirNovaProposta(Proposta proposta) throws ClassNotFoundException, SQLException{
        stmt = Conexao.getStmt();
        String sql;
        
        sql = "INSERT INTO proposta VALUES ('"
                + proposta.getClinte().getCpf() + "','"
                + proposta.getVeiculo().getPlaca() + "','"
                + proposta.getData() + "',"
                + proposta.getValor() + ","
                + proposta.isRealizada() + ")";
        
        if(stmt.executeUpdate(sql) > 0)
            System.out.println("Dados da proposta gravados com sucesso");
        else
            System.err.println("Erro na gravação dos dados da proposta no BD");
    }
    
    public ArrayList<Proposta> listarTodasPropostas() throws SQLException, ClassNotFoundException{
        stmt = Conexao.getStmt();
        rs = stmt.executeQuery("SELECT * FROM proposta");
        
        ArrayList<Proposta> retorno = rsToPropostaArray(rs);
        
        //for (int i=0;i<retorno.size();i++)
            //System.out.println("Modelo DAO: " + retorno.get(i).getVeiculo().getModelo());
        return retorno;
    }
    
    public ArrayList<Proposta> filtrarProposta(String cpf, String modelo) throws ClassNotFoundException, SQLException{
        stmt = Conexao.getStmt();
        String sql;
        sql = "SELECT * FROM proposta p, veiculo v WHERE "
                + "p.cpf = '" + cpf + "' AND "
                + "v.modelo = '" + modelo + "' AND "
                + "p.placa = v.placa";
        rs = stmt.executeQuery(sql);
        return rsToPropostaArray(rs);
    }
    
    public ArrayList<Proposta> filtrarPropostaCPF(String cpf) throws ClassNotFoundException, SQLException{
        stmt = Conexao.getStmt();
        rs = stmt.executeQuery("SELECT * FROM proposta p WHERE "
                + "p.cpf = '" + cpf + "'");
        return rsToPropostaArray(rs);
    }
    
    public ArrayList<Proposta> filtrarPropostaModelo(String modelo) throws ClassNotFoundException, SQLException{
        stmt = Conexao.getStmt();
        rs = stmt.executeQuery("SELECT * FROM proposta p WHERE "
                + "v.modelo = '" + modelo + "' AND "
                + "p.placa = v.placa");
        return rsToPropostaArray(rs);
    }
    
    public void alterarProposta (Proposta p) throws ClassNotFoundException, SQLException{
        stmt = Conexao.getStmt();
        String sql;
        sql = "UPDATE proposta SET "
                + "data = '" + p.getData() + "',"
                + "valor = " + p.getValor() + ","
                + "realizada = " + p.isRealizada()
                + " WHERE cpf = '" + p.getClinte().getCpf() + "' AND "
                + "placa = '" + p.getVeiculo().getPlaca() + "'";
        stmt.executeUpdate(sql);
    }
    
    
    private ArrayList<Proposta> rsToPropostaArray(ResultSet rs) throws SQLException, ClassNotFoundException{
        ArrayList<Proposta> propostas = new ArrayList<>();
        
        while(rs.next()){
            Proposta p = new Proposta();
            p.setVeiculo(new VeiculoDAO().buscarVeiculoPlaca(rs.getString("placa")));
            p.setCliente(new ClienteDAO().buscarClienteCpf(rs.getString("cpf")));
            
            p.setData(rs.getString("data"));
            p.setRealizada(rs.getBoolean("realizada"));
            p.setValor(rs.getDouble("valor"));
            
            propostas.add(p);
        }
        
        
        
        return propostas;
    }
    
}


package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class VeiculoDAO {
    ResultSet rs;
    Statement stmt;
   
    public void alterarDisponibilidade (Veiculo v, boolean disponibilidade) throws SQLException, ClassNotFoundException{
        //Só altera se for diferente
        if(disponibilidade != v.isDisponivel()){
            v.setDisponivel(disponibilidade);
            alterarVeiculo(v);
        }
    }
    
    public void alterarVeiculo(Veiculo v) throws SQLException, ClassNotFoundException{
        stmt = Conexao.getStmt(); //Toda a clausula sql(select, insert...) recaira sobre essa conexao
        String sql;
        sql = "UPDATE veiculo SET "
                + "marca = '" + v.getMarca() + "',"
                + "modelo = '" + v.getModelo()+ "',"
                + "ano = '" + v.getAno()+ "',"
                + "cor = '" + v.getCor()+ "',"
                + "transmissao = '" + v.getTransmissao()+ "',"
                + "motor = '" + v.getMotor()+ "',"
                + "placa = '" + v.getPlaca()+ "',"
                + "renavam = '" + v.getRenavam()+ "',"
                + "chassi = '" + v.getChassi()+ "',"
                + "valorCompra = '" + v.getValorCompra()+ "',"
                + "odometro = '" + v.getOdometro()+ "',"
                + "disponivel = " + v.isDisponivel()+ ","
                + "categoria = '" + v.getCategoria() + "',"
                + "arCondicionado = " + v.isArCondicionado()+ ","
                + "abs = " + v.isAbs()+ ","
                + "tetoSolar = " + v.isTetoSolar()+ ","
                + "kitEletrico = " + v.isKitEletrico()+ ","
                + "bancoCouro = " + v.isBancoCouro()+ ","
                + "direcaoHidraulica = " + v.isDirecaoHidraulica()+ ","
                + "farolMilha = " + v.isFarolMilha()+ ","
                + "centralMultimidia = " + v.isCentralMultimidia()+ ","
                + "pilotoAutomatico = " + v.isPilotoAutomatico()+ ","
                + "luzDiurna = " + v.isLuzDiurna()+ ","
                + "comandoVolante = " + v.isComandoVolante()+ ","
                + "airBag = " + v.isAirBag()+ ","
                + "nomeImagem = '" + v.getNomeImagem()+ "'";
                
        if(stmt.executeUpdate(sql) > 0)
            System.out.println("Veiculo alterado com sucesso");
        else
            System.err.println("Erro de gravação no BD");
    }
    
    public void inserirNovoVeiculo(Veiculo v) throws SQLException, ClassNotFoundException{
        stmt = Conexao.getStmt(); //Toda a clausula sql(select, insert...) recaira sobre essa conexao
        String sql;
        sql = "INSERT INTO veiculo VALUES ('" 
                + v.getMarca()+ "','" 
                + v.getModelo()+ "','" 
                + v.getAno()+ "','" 
                + v.getCor()+ "','" 
                + v.getTransmissao()+ "','" 
                + v.getMotor()+ "','" 
                + v.getPlaca()+ "','" 
                + v.getRenavam()+ "','" 
                + v.getChassi()+ "','" 
                + v.getValorCompra()+ "','" 
                + v.getOdometro()+ "'," 
                + v.isDisponivel()+ ",'" 
                + v.getCategoria()+ "'," 
                + v.isArCondicionado()+ "," 
                + v.isAbs()+ "," 
                + v.isTetoSolar()+ "," 
                + v.isKitEletrico()+ ","  
                + v.isBancoCouro()+ ","  
                + v.isDirecaoHidraulica()+ "," 
                + v.isFarolMilha()+ ","  
                + v.isCentralMultimidia()+ ","  
                + v.isPilotoAutomatico()+ "," 
                + v.isLuzDiurna()+ ","  
                + v.isComandoVolante()+ ","  
                + v.isAirBag()+ ",'"  
                + v.getNomeImagem()+ "')"; 
        
        if(stmt.executeUpdate(sql) > 0)
            System.out.println("Dados do vaiculo gravados com sucesso");
        else
            System.err.println("Erro de gravação no BD");
    }
    
    public Veiculo buscarVeiculoModelo(String modelo) throws ClassNotFoundException, SQLException{
        stmt = Conexao.getStmt();
        
        rs = stmt.executeQuery("SELECT * FROM veiculo WHERE modelo = '" + modelo + "'");
        
        return rsToVeiculo(rs);
    }
    
    public ArrayList<Veiculo> listarTodosVeiculos() throws ClassNotFoundException, SQLException{
        stmt = Conexao.getStmt();
        rs = stmt.executeQuery("SELECT * FROM veiculo");
        return rsToVeiculoArray(rs);
    }
    
    //Filtros
    public ArrayList<Veiculo> filtrarVeiculo(String marca) throws ClassNotFoundException, SQLException{
        stmt = Conexao.getStmt();
        rs = stmt.executeQuery("SELECT * FROM veiculo WHERE marca = '" + marca + "'");
        return rsToVeiculoArray(rs);
    }
    public ArrayList<Veiculo> filtrarVeiculo(int anoMinimo) throws ClassNotFoundException, SQLException{
        stmt = Conexao.getStmt();
        rs = stmt.executeQuery("SELECT * FROM veiculo WHERE ano >= " + anoMinimo);
        return rsToVeiculoArray(rs);
    }
    public ArrayList<Veiculo> filtrarVeiculo(double valorMaximo) throws ClassNotFoundException, SQLException{
        stmt = Conexao.getStmt();
        rs = stmt.executeQuery("SELECT * FROM veiculo WHERE valorCompra <" + valorMaximo);
        return rsToVeiculoArray(rs);
    }
    public ArrayList<Veiculo> filtrarVeiculo(String marca, int anoMinimo, double valorMaximo) throws ClassNotFoundException, SQLException{
        stmt = Conexao.getStmt();
        String sql = "";
        
        if(marca.equals("Todos"))
            sql = "SELECT * FROM veiculo ano >= " + anoMinimo 
            +" AND valorCompra < " + valorMaximo;
        else
            sql = "SELECT * FROM veiculo WHERE marca = '" + marca 
            + "' AND ano >= " + anoMinimo 
            +" AND valorCompra < " + valorMaximo;
        
        rs = stmt.executeQuery(sql);
        return rsToVeiculoArray(rs);
    }
    
    //Conversoes
    private Veiculo rsToVeiculo (ResultSet rs) throws SQLException{
        Veiculo v = new Veiculo();
        
        if(rs.next()){
            v.setMarca(rs.getString("marca"));
            v.setModelo(rs.getString("modelo"));
            v.setAno(rs.getInt("ano"));
            v.setCor(rs.getString("cor"));
            v.setTransmissao(rs.getString("transmissao"));
            v.setMotor(rs.getString("motor"));
            v.setPlaca(rs.getString("placa"));
            v.setRenavam(rs.getLong("renavam"));
            v.setChassi(rs.getString("chassi"));
            v.setValorCompra(rs.getDouble("valorCompra"));
            v.setOdometro(rs.getInt("odometro"));
            v.setDisponivel(rs.getBoolean("disponivel"));
            v.setCategoria(rs.getString("categoria"));
            v.setArCondicionado(rs.getBoolean("arCondicionado"));
            v.setAbs(rs.getBoolean("abs"));
            v.setTetoSolar(rs.getBoolean("tetoSolar"));
            v.setKitEletrico(rs.getBoolean("kitEletrico"));
            v.setBancoCouro(rs.getBoolean("bancoCouro"));
            v.setDirecaoHidraulica(rs.getBoolean("direcaoHidraulica"));
            v.setFarolMilha(rs.getBoolean("farolMilha"));
            v.setCentralMultimidia(rs.getBoolean("centralMultimidia"));
            v.setPilotoAutomatico(rs.getBoolean("pilotoAutomatico"));
            v.setLuzDiurna(rs.getBoolean("luzDiurna"));
            v.setComandoVolante(rs.getBoolean("comandoVolante"));
            v.setAirBag(rs.getBoolean("airBag"));
            v.setNomeImagem(rs.getString("nomeImagem"));
        }
        
        return v;
    }
    private ArrayList<Veiculo> rsToVeiculoArray(ResultSet rs) throws SQLException{
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        Veiculo v = new Veiculo();
        while(rs.next()){
            v.setMarca(rs.getString("marca"));
            v.setModelo(rs.getString("modelo"));
            v.setAno(rs.getInt("ano"));
            v.setCor(rs.getString("cor"));
            v.setTransmissao(rs.getString("transmissao"));
            v.setMotor(rs.getString("motor"));
            v.setPlaca(rs.getString("placa"));
            v.setRenavam(rs.getLong("renavam"));
            v.setChassi(rs.getString("chassi"));
            v.setValorCompra(rs.getDouble("valorCompra"));
            v.setOdometro(rs.getInt("odometro"));
            v.setDisponivel(rs.getBoolean("disponivel"));
            v.setCategoria(rs.getString("categoria"));
            v.setArCondicionado(rs.getBoolean("arCondicionado"));
            v.setAbs(rs.getBoolean("abs"));
            v.setTetoSolar(rs.getBoolean("tetoSolar"));
            v.setKitEletrico(rs.getBoolean("kitEletrico"));
            v.setBancoCouro(rs.getBoolean("bancoCouro"));
            v.setDirecaoHidraulica(rs.getBoolean("direcaoHidraulica"));
            v.setFarolMilha(rs.getBoolean("farolMilha"));
            v.setCentralMultimidia(rs.getBoolean("centralMultimidia"));
            v.setPilotoAutomatico(rs.getBoolean("pilotoAutomatico"));
            v.setLuzDiurna(rs.getBoolean("luzDiurna"));
            v.setComandoVolante(rs.getBoolean("comandoVolante"));
            v.setAirBag(rs.getBoolean("airBag"));
            v.setNomeImagem(rs.getString("nomeImagem"));
            
            veiculos.add(v);
        }
        
        return veiculos;
    }
}//fim da classe
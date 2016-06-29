package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Veiculo;
import model.VeiculoDAO;

/**
 *
 * @author mario
 */
public class VeiculoController {
    private final JsonToJava jsonJava = new JsonToJava();
    private  ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
    private final VeiculoDAO veiculoDAO = new VeiculoDAO();
    
    
    
    public void jsonToDB(){
        this.listaVeiculos = jsonJava.getVeiculos();
        for(int i=0; i<listaVeiculos.size();i++){
            VeiculoDAO vDAO = new VeiculoDAO();
            
            try {
                vDAO.inserirNovoVeiculo(listaVeiculos.get(i));
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(VeiculoController.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("Erro no veiculo: " + listaVeiculos.get(i).getModelo());
            }
        }
    }
    
    public void adicionarVeiculo(Veiculo v){
        try {
            veiculoDAO.inserirNovoVeiculo(v);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(VeiculoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Veiculo getVeiculo(String modelo){
        try {
            return veiculoDAO.buscarVeiculoModelo(modelo);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VeiculoController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void alterarDisponibilidade(Veiculo v, boolean disponibilidade) throws SQLException, ClassNotFoundException{
        veiculoDAO.alterarDisponibilidade(v, disponibilidade);
    }
    
    public boolean isValido(String modelo){
        return getVeiculo(modelo)!=null;
    }
    
    public void alterarVeiculo(Veiculo novo){
        try {
            veiculoDAO.alterarVeiculo(novo);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(VeiculoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public ArrayList<Veiculo> listarTodosVeiculos(){
        ArrayList<Veiculo> resposta = new ArrayList<>();
        try {
            resposta = veiculoDAO.listarTodosVeiculos();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VeiculoController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return resposta;
    }
    
    //Filtros
    public ArrayList<Veiculo> filtrarVeiculo(String marca){
        ArrayList<Veiculo> resposta = new ArrayList<>();
        
        try {
            resposta = veiculoDAO.filtrarVeiculo(marca);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VeiculoController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        return resposta;
    }
    public ArrayList<Veiculo> filtrarVeiculo(int anoMinimo){
        ArrayList<Veiculo> resposta = new ArrayList<>();
        
        try {
            resposta = veiculoDAO.filtrarVeiculo(anoMinimo);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VeiculoController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        return resposta;
    }
    public ArrayList<Veiculo> filtrarVeiculo(double valorMaximo){
        ArrayList<Veiculo> resposta = new ArrayList<>();
        
        try {
            resposta = veiculoDAO.filtrarVeiculo(valorMaximo);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VeiculoController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        return resposta;
    }
    public ArrayList<Veiculo> filtrarVeiculo(String marca, int anoMinimo, double valorMaximo){
        ArrayList<Veiculo> resposta = new ArrayList<>();
        
        try {
            resposta = veiculoDAO.filtrarVeiculo(marca, anoMinimo, valorMaximo);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VeiculoController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        return resposta;
    }
    
}//fim classe
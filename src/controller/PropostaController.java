/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Proposta;
import model.PropostaDAO;

/**
 *
 * @author mario
 */
public class PropostaController {
    private final PropostaDAO pDAO = new PropostaDAO();
    
    
    public void jsonToDB(){
        ArrayList<Proposta> listaPropostas = new JsonToJava().getPropostas();
        PropostaDAO pDAO = new PropostaDAO();
        for(int i=0; i<listaPropostas.size(); i++){
            try {
                pDAO.inserirNovaProposta(listaPropostas.get(i));
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(PropostaController.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("Erro na proposta!!");
            }
        }
    }
    
    public void adicionarProposta(Proposta p) throws ClassNotFoundException, SQLException{
        pDAO.inserirNovaProposta(p);
    }
    
    public ArrayList<Proposta> getProposta() throws SQLException, ClassNotFoundException{
        return pDAO.listarTodasPropostas();
    }
    public ArrayList<Proposta> getProposta(String cpf, String modelo) throws SQLException, ClassNotFoundException{
        return pDAO.filtrarProposta(cpf, modelo);
    }
    
    public ArrayList<Proposta> getPropostaCPF(String cpf) throws ClassNotFoundException, SQLException{
        return pDAO.filtrarPropostaCPF(cpf);
    }
    
    public ArrayList<Proposta> getPropostaModelo(String modelo) throws ClassNotFoundException, SQLException{
        return pDAO.filtrarPropostaModelo(modelo);
    }

    public void alterarStatus(Proposta p) throws ClassNotFoundException, SQLException {
        pDAO.alterarProposta(p);
    }
    public void alterarProposta(Proposta p) throws ClassNotFoundException, SQLException {
        pDAO.alterarProposta(p);
    }
    
    public boolean isValido(String modelo, String cpf){
        boolean v = new VeiculoController().isValido(modelo);
        boolean c = new ClienteController().isValido(cpf);
        
        return (v && c);
    }
}

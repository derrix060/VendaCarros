package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
import model.ClienteDAO;

/**
 *
 * @author mario
 */
public class ClienteController {
    private final ClienteDAO cliDAO = new ClienteDAO();
    
    public void jsonToDB(){
        ArrayList<Cliente> listaCliente = new JsonToJava().getClientes();
        
            ClienteDAO cDAO = new ClienteDAO();
        for(int i=0;i<listaCliente.size();i++){
            try {
                cDAO.inserirNovoCliente(listaCliente.get(i));
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("Erro no cliente: " + listaCliente.get(i).getNomeCompleto());
            }
            
        }
    }
    
    public ArrayList<Cliente> listarClientes(){
        try {
            return cliDAO.listarTodosClientes();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
   
    public void adicionarCliente(Cliente c) throws SQLException, ClassNotFoundException{
        cliDAO.inserirNovoCliente(c);
    }
    
    public void alterarCliente(String cpf, Cliente c){
        try {
            cliDAO.alterarDadosCLiente(c);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Cliente getCliente(String cpf){
        try {
            return cliDAO.buscarClienteCpf(cpf);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean isValido(String cpf){
        return getCliente(cpf)!= null;
    }
}

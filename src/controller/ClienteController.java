package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Cliente;
import model.DAO.ClienteDAO;
import static view.FrameCliente.txtCPF;

/**
 *
 * @author mario
 */
public class ClienteController {
    private final ClienteDAO clienteDAO = new ClienteDAO();
    
    //Constructor
    public ClienteController() {
    }
    
    public boolean adicionarCliente(Cliente c) throws ClassNotFoundException, SQLException{
        //validar possíveis regras de negócio
        //Valida CPF
        if (!CPF.isValidCPF(txtCPF.getText())){
            JOptionPane.showMessageDialog(null, "CPF Inválido!!", "Warning",JOptionPane.WARNING_MESSAGE);
            return false;
        }else
            return clienteDAO.insertCliente(c);
    }
    
    public Cliente getCliente (String cpf) throws ClassNotFoundException, SQLException{
        return clienteDAO.selectClientePorCPF(cpf);
    }
    
    public ArrayList<Cliente> getAllClients() throws ClassNotFoundException, SQLException{
        return clienteDAO.selectAll();
    }
    //alterarCliente
    //getCliente (cpf)
   
}

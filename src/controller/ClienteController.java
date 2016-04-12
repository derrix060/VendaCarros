package controller;

import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author mario
 */
public class ClienteController {
    private final JavaToJson javaJson = new JavaToJson();
    private final JsonToJava jsonJava = new JsonToJava();
    private  ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    //Constructor
    public ClienteController() {
        //pega a lista atualizada
            this.listaClientes = jsonJava.getClientes();
    }
    
    public void adicionarCliente(Cliente c){
        listaClientes.add(c);
        salvarLista();
    }
    
    public void salvarLista(){
        javaJson.salvarClientes(listaClientes);
    }
    
    public Cliente getCliente(String cpf){
        int i = indexCliente(cpf);
        if (i!= -1){
            return listaClientes.get(i);
        }
        return null;
    }
    
    public boolean isValido(String cpf){
        return indexCliente(cpf) != -1;
    }
    
    private int indexCliente(String cpf){
        for (int i = 0; i<listaClientes.size(); i++){
            if (listaClientes.get(i).getCpf().equals(cpf)){
                return i;
            }
        }
        
        System.err.println("Cliente não encontrado!");
        return -1;
    }
}

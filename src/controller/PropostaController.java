/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Proposta;

/**
 *
 * @author mario
 */
public class PropostaController {
    private final JavaToJson javaJson = new JavaToJson();
    private final JsonToJava jsonJava = new JsonToJava();
    private ArrayList<Proposta> listaPropostas = new ArrayList<>();
    
    //Constructor
    public PropostaController() {
        //pega a lista atualizada
            this.listaPropostas = jsonJava.getPropostas();
    }
    
    public void adicionarProposta(Proposta p){
        listaPropostas.add(p);
        salvarLista();
    }
    
    public void salvarLista(){
        javaJson.salvarPropostas(listaPropostas);
    }
    
    public ArrayList<Proposta> getProposta(String s){
        if (CPF.isValidCPF(s)){
            //consulta por cpf
            
        }else{
            //consulta por modelo
            
        }
        ArrayList<Proposta> retorno = new ArrayList<>();
        
        
        return retorno;
    }
    
    public ArrayList<Proposta> getProposta(String cpf, String modelo){
        ArrayList<Proposta> retorno = new ArrayList<>();
        
        
        return retorno;
    }
    
    public boolean isValido(String modelo, String cpf){
        boolean v = new VeiculoController().isValido(modelo);
        boolean c = new ClienteController().isValido(cpf);
        
        return (v && c);
    }
    
    
    
}

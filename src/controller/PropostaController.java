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
    
    public void alterarStatus(Proposta p){
        Proposta temp = getProposta(p.getClinte().getCpf(), p.getveiculo().getModelo()).get(0);
        
        VeiculoController vc = new VeiculoController();
        
        vc.alterarDisponibilidade(temp.getveiculo().getModelo(), !temp.isRealizada());
        
        temp.setRealizada(!temp.isRealizada());
        
    }
    
    public void salvarLista(){
        javaJson.salvarPropostas(listaPropostas);
    }
    
    public ArrayList<Proposta> getProposta(String s){
        ArrayList<Proposta> retorno = new ArrayList<>();
        
        if (CPF.isValidCPF(s)){
            //consulta por cpf
            for(int i = 0; i<listaPropostas.size();i++){
                if(listaPropostas.get(i).getClinte().getCpf().equals(s)){
                    retorno.add(listaPropostas.get(i));
                }
            }
        }else{
            //consulta por modelo
            for(int i = 0; i<listaPropostas.size();i++){
                if(listaPropostas.get(i).getveiculo().getModelo().equals(s)){
                    retorno.add(listaPropostas.get(i));
                }
            }
        }
        
        return retorno;
    }
    
    public ArrayList<Proposta> getProposta(){
        return listaPropostas;
    }
    
    public ArrayList<Proposta> getProposta(String cpf, String modelo){
        ArrayList<Proposta> retorno = new ArrayList<>();
        for(int i = 0; i<listaPropostas.size();i++){
            if(listaPropostas.get(i).getveiculo().getModelo().equals(modelo) && listaPropostas.get(i).getClinte().getCpf().equals(cpf)){
                retorno.add(listaPropostas.get(i));
            }
        }
        
        return retorno;
    }
    
    public boolean isValido(String modelo, String cpf){
        boolean v = new VeiculoController().isValido(modelo);
        boolean c = new ClienteController().isValido(cpf);
        
        return (v && c);
    }
    
    
    
}

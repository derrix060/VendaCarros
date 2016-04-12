/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import model.Cliente;
import model.Proposta;
import model.Veiculo;

/**
 *
 * @author mario
 */
public class JsonToJava {
    private Gson gson = new Gson();
    
    public ArrayList<Veiculo> getVeiculos(){
        ArrayList<Veiculo> retorno = new ArrayList<>();
        Type t = new TypeToken<ArrayList<Veiculo>>(){}.getType();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("listaVeiculos.json"));
            retorno = gson.fromJson(br, t);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return retorno;
    }
    
    public ArrayList<Cliente> getClientes(){
        ArrayList<Cliente> retorno = new ArrayList<>();
        Type t = new TypeToken<ArrayList<Cliente>>(){}.getType();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("listaClientes.json"));
            retorno = gson.fromJson(br, t);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return retorno;
    }
    
    public ArrayList<Proposta> getPropostas(){
        ArrayList<Proposta> retorno = new ArrayList<>();
        Type t = new TypeToken<ArrayList<Proposta>>(){}.getType();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("listaPropostas.json"));
            retorno = gson.fromJson(br, t);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return retorno;
    }
    
    
    
    
}

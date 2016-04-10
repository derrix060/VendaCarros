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
import model.Veiculo;

/**
 *
 * @author mario
 */
public class JsonToJava {
    private Gson gson = new Gson();
    
    public ArrayList<Veiculo> getVeiculos(){
        ArrayList<Veiculo> retorno = new ArrayList<Veiculo>();
        Type t = new TypeToken<ArrayList<Veiculo>>(){}.getType();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("listaVeiculos.json"));
            //ret = gson.fromJson(br, VeiculoController.class);
            retorno = gson.fromJson(br, t);
            //System.out.println(ret);
            //retorno = ret.filtrarVeiculo();
            
            System.out.println(retorno);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        
        return retorno;
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import model.Veiculo;

/**
 *
 * @author mario
 */
public class JavaToJson {
    private Gson gson = new Gson();
    private String json;


    public void salvarVeiculo(ArrayList<Veiculo> listaVeiculos){
        json = gson.toJson(listaVeiculos);
        executa("listaVeiculos.json", json);
    }

    private void executa(String nomeArquivo, String json){
        try{
            FileWriter writer = new FileWriter(nomeArquivo);
            writer.write(json);
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }


        System.out.println(json);
    }
        
}

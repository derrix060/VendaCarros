/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Veiculo;

/**
 *
 * @author mario
 */
public class Teste {
    public static void main (String[]args){
        ArrayList<Veiculo> teste = new ArrayList<>();
        
        JsonToJava jsonJava = new JsonToJava();
        JavaToJson javaJson = new JavaToJson();
        
        
        teste = jsonJava.getVeiculos();
        /*
        for (int i=0; i< teste.size();i++){
            System.out.println(teste.get(i).getModelo());
        }
        */
        //javaJson.salvarVeiculo(teste);
        
        
    }
    
}

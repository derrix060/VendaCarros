package controller;

import java.util.ArrayList;
import model.Veiculo;

/**
 *
 * @author mario
 */
public class VeiculoController {
    private final JavaToJson javaJson = new JavaToJson();
    private final JsonToJava jsonJava = new JsonToJava();
    private  ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
    
    
    //Constructor
    
    public VeiculoController() {
        
        //pega a lista atualizada
            this.listaVeiculos = jsonJava.getVeiculos();
    }
    
    
    //Set
    
    
    //Adicionar veiculo
    public void adicionarVeiculo(Veiculo v){
        listaVeiculos.add(v);
        salvarLista();
    }
    
    //Salvar lista
    public void salvarLista(){
        javaJson.salvarVeiculo(listaVeiculos);
    }
    
    public Veiculo getVeiculo(String modelo){
        int i = indexVeiculo(modelo);
        if (i!= -1){
            return listaVeiculos.get(i);
        }
        return null;
    }
    
    public void alterarDisponibilidade(String modelo, boolean disponibilidade){
        int i = indexVeiculo(modelo);
        if (i != -1){
            listaVeiculos.get(i).setDisponivel(disponibilidade);
            salvarLista();
        }
    }
    
    public boolean isValido(String modelo){
        return indexVeiculo(modelo) != -1;
    }
    
    
    private int indexVeiculo(String modelo){
        for (int i = 0; i<listaVeiculos.size(); i++){
            if (listaVeiculos.get(i).getModelo().equals(modelo)){
                return i;
            }
        }
        
        System.err.println("Veiculo não encontrado!");
        return -1;
    }
    
    //filtrar veiculo
    public ArrayList<Veiculo> filtrarVeiculo(){
        return listaVeiculos;
    }
    public ArrayList<Veiculo> filtrarVeiculo(String marca){
        ArrayList<Veiculo> resposta = new ArrayList<>();
        
        for(int i=0; i<listaVeiculos.size();i++){
            //retorna só veiculos disponíveis
            if (listaVeiculos.get(i).getMarca().equals(marca) && listaVeiculos.get(i).isDisponivel()){
                resposta.add(listaVeiculos.get(i));
            }
        }
        return resposta;
    }
    public ArrayList<Veiculo> filtrarVeiculo(int anoMinimo){
        ArrayList<Veiculo> resposta = new ArrayList<>();
        
        for(int i=0; i<listaVeiculos.size();i++){
            //retorna só veiculos disponíveis
            if (listaVeiculos.get(i).getAno() >= anoMinimo && listaVeiculos.get(i).isDisponivel()){
                resposta.add(listaVeiculos.get(i));
            }
        }
        return resposta;
    }
    public ArrayList<Veiculo> filtrarVeiculo(double valorMaximo){
        ArrayList<Veiculo> resposta = new ArrayList<>();
        
        for(int i=0; i<listaVeiculos.size();i++){
            //retorna só veiculos disponíveis
            if (listaVeiculos.get(i).getValorCompra() <= valorMaximo && listaVeiculos.get(i).isDisponivel()){
                resposta.add(listaVeiculos.get(i));
            }
        }
        return resposta;
    }
    
}//fim classe


/*
            //Clio
            Veiculo veiculoTemp = new Veiculo("Renault", "Clio", 2013, "prata", "manual", "1.0", "AAAA-0000", 0l, "", 12500d, 0, true, "", true, true, true, true, true, true, true, true, true, true, true, true,"clio.jpg");
            listaVeiculos.add(veiculoTemp);

            //Corolla
            veiculoTemp = new Veiculo("Toyota", "Corolla", 2015, "prata", "automatico", "1.0", "AAAA-0000", 0l, "", 75500d, 0, true, "", true, true, true, true, true, true, true, true, true, true, true, true,"corolla.jpg");
            listaVeiculos.add(veiculoTemp);

            //Fusion
            veiculoTemp = new Veiculo("Ford", "Fusion", 2014, "preto", "automatico", "1.0", "AAAA-0000", 0l, "", 70500d, 0, true, "", true, true, true, true, true, true, true, true, true, true, true, true,"fusion.jpg");
            this.listaVeiculos.add(veiculoTemp);

            //Gol
            veiculoTemp = new Veiculo("Volkswagen", "Gol", 2012, "prata", "manual", "1.0", "AAAA-0000", 0l, "", 15500d, 0, true, "", true, true, true, true, true, true, true, true, true, true, true, true,"gol.jpg");
            this.listaVeiculos.add(veiculoTemp);

            //Ka
            veiculoTemp = new Veiculo("Ford", "Ka", 2013, "prata", "manual", "1.0", "AAAA-0000", 0l, "", 30500d, 0, true, "", true, true, true, true, true, true, true, true, true, true, true, true,"ka.jpg");
            this.listaVeiculos.add(veiculoTemp);

            //Sandero
            veiculoTemp = new Veiculo("Renault", "Sandero", 2014, "vermelho", "manual", "1.0", "AAAA-0000", 0l, "", 25500d, 0, true, "", true, true, true, true, true, true, true, true, true, true, true, true,"sandero.jpg");
            this.listaVeiculos.add(veiculoTemp);

            //Uno
            veiculoTemp = new Veiculo("Fiat", "Uno", 2013, "vermelho", "manual", "1.0", "AAAA-0000", 0l, "", 12500d, 0, true, "", true, true, true, true, true, true, true, true, true, true, true, true,"uno.jpg");
            this.listaVeiculos.add(veiculoTemp);

            //Up
            veiculoTemp = new Veiculo("Volkswagen", "up", 2014, "prata", "manual", "1.0", "AAAA-0000", 0l, "", 12500d, 0, true, "", true, true, true, true, true, true, true, true, true, true, true, true,"up.jpg");
            this.listaVeiculos.add(veiculoTemp);
        */
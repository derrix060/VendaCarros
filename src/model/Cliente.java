package model;
import controller.CPF;
/**
 *
 * @author mario
 */
public class Cliente {
    private String cpf;
    private String nomeCompleto;
    private int idade;
    private int ddd;
    private int telefone;
    
    
    
    //Constructor
    public Cliente() {
    }
    
    //Getters and Setters

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (CPF.isValidCPF(cpf)){
            this.cpf = cpf;
        }
        else{
            System.err.println("CPF Inválido!!");
        }
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
}

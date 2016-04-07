package model;

/**
 *
 * @author aluno
 */
public class Loja {
    private int codigo;
    private Endereco end;
    private String nome;
    private int telefone;
    
    //Constructor
    public Loja() {
    }
    
    //Getters and Setters
    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }
    
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {    
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    
    
    
}

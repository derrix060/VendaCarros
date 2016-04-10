package model;

/**
 *
 * @author mario
 */
public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String transmissao;
    private String motor;
    private String placa;
    private Long renavam;
    private String chassi;
    private Double valorCompra;
    private int odometro;
    private boolean disponivel;
    private String categoria;
    private boolean arCondicionado;
    private boolean abs;
    private boolean tetoSolar;
    private boolean kitEletrico;
    private boolean bancoCouro;
    private boolean direcaoHidraulica;
    private boolean farolMilha;
    private boolean centralMultimidia;
    private boolean pilotoAutomatico;
    private boolean luzDiurna;
    private boolean comandoVolante;
    private boolean airBag;
    private String nomeImagem;
    
    
    //Constructors
    
    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, int ano, String cor, String transmissao, String motor, String placa, Long renavam, String chassi, Double valorCompra, int odometro, boolean disponivel, String categoria, boolean arCondicionado, boolean abs, boolean tetoSolar, boolean kitEletrico, boolean bancoCouro, boolean direcaoHidraulica, boolean farolMilha, boolean centralMultimidia, boolean pilotoAutomatico, boolean luzDiurna, boolean comandoVolante, boolean airBag, String nomeImagem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.transmissao = transmissao;
        this.motor = motor;
        this.placa = placa;
        this.renavam = renavam;
        this.chassi = chassi;
        this.valorCompra = valorCompra;
        this.odometro = odometro;
        this.disponivel = disponivel;
        this.categoria = categoria;
        this.arCondicionado = arCondicionado;
        this.abs = abs;
        this.tetoSolar = tetoSolar;
        this.kitEletrico = kitEletrico;
        this.bancoCouro = bancoCouro;
        this.direcaoHidraulica = direcaoHidraulica;
        this.farolMilha = farolMilha;
        this.centralMultimidia = centralMultimidia;
        this.pilotoAutomatico = pilotoAutomatico;
        this.luzDiurna = luzDiurna;
        this.comandoVolante = comandoVolante;
        this.airBag = airBag;
        this.nomeImagem = nomeImagem;
    }
    

    //Getter and Setter
    
    public String getNomeImagem() {    
        return nomeImagem;
    }
    public void setNomeImagem(String nomeImagem){
        this.nomeImagem = nomeImagem;
    }
        

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Long getRenavam() {
        return renavam;
    }

    public void setRenavam(Long renavam) {
        this.renavam = renavam;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getOdometro() {
        return odometro;
    }

    public void setOdometro(int odometro) {
        this.odometro = odometro;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public boolean isKitEletrico() {
        return kitEletrico;
    }

    public void setKitEletrico(boolean kitEletrico) {
        this.kitEletrico = kitEletrico;
    }

    public boolean isBancoCouro() {
        return bancoCouro;
    }

    public void setBancoCouro(boolean bancoCouro) {
        this.bancoCouro = bancoCouro;
    }

    public boolean isDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    public void setDirecaoHidraulica(boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public boolean isFarolMilha() {
        return farolMilha;
    }

    public void setFarolMilha(boolean farolMilha) {
        this.farolMilha = farolMilha;
    }

    public boolean isCentralMultimidia() {
        return centralMultimidia;
    }

    public void setCentralMultimidia(boolean centralMultimidia) {
        this.centralMultimidia = centralMultimidia;
    }

    public boolean isPilotoAutomatico() {
        return pilotoAutomatico;
    }

    public void setPilotoAutomatico(boolean pilotoAutomatico) {
        this.pilotoAutomatico = pilotoAutomatico;
    }

    public boolean isLuzDiurna() {
        return luzDiurna;
    }

    public void setLuzDiurna(boolean luzDiurna) {
        this.luzDiurna = luzDiurna;
    }

    public boolean isComandoVolante() {
        return comandoVolante;
    }

    public void setComandoVolante(boolean comandoVolante) {
        this.comandoVolante = comandoVolante;
    }

    public boolean isAirBag() {
        return airBag;
    }

    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
    }
    
    
    
}

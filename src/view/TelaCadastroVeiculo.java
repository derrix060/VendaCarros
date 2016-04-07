/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Veiculo;

/**
 *
 * @author mario
 */
public class TelaCadastroVeiculo extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroVeiculo
     */
    public TelaCadastroVeiculo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupDisponivel = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        lblLoja = new javax.swing.JLabel();
        cmbLoja = new javax.swing.JComboBox<>();
        lblMarca = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox<>();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblAno = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        lblCor = new javax.swing.JLabel();
        cmbCor = new javax.swing.JComboBox<>();
        lblTransmissao = new javax.swing.JLabel();
        cmbTransmissao = new javax.swing.JComboBox<>();
        lblMotor = new javax.swing.JLabel();
        txtMotor = new javax.swing.JTextField();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblRenavam = new javax.swing.JLabel();
        txtRenavam = new javax.swing.JTextField();
        lblChassi = new javax.swing.JLabel();
        txtChassi = new javax.swing.JTextField();
        lblValorCompra = new javax.swing.JLabel();
        txtValorCompra = new javax.swing.JTextField();
        lblOdometro = new javax.swing.JLabel();
        txtOdometro = new javax.swing.JTextField();
        lblDisponivel = new javax.swing.JLabel();
        rdDisponivelSim = new javax.swing.JRadioButton();
        rdDisponivelNao = new javax.swing.JRadioButton();
        lblCategoria = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        panelOpcionais = new javax.swing.JPanel();
        chkArCondicionado = new javax.swing.JCheckBox();
        chkABS = new javax.swing.JCheckBox();
        chkTetoSolar = new javax.swing.JCheckBox();
        chkKitEletrico = new javax.swing.JCheckBox();
        chkBancoCouro = new javax.swing.JCheckBox();
        chkDirecaoHidraulica = new javax.swing.JCheckBox();
        chkFarolMilha = new javax.swing.JCheckBox();
        chkCentralMultimidia = new javax.swing.JCheckBox();
        chkPilotoAutomatico = new javax.swing.JCheckBox();
        chkLuzDiurna = new javax.swing.JCheckBox();
        chkComandoVolante = new javax.swing.JCheckBox();
        chkAirBag = new javax.swing.JCheckBox();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLocalFoto = new javax.swing.JTextField();
        btnInserirFoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        lblLoja.setText("Loja");

        cmbLoja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matriz", "Filial 1", "Filial 2", "Filial 3" }));
        cmbLoja.setSelectedIndex(-1);
        cmbLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLojaActionPerformed(evt);
            }
        });

        lblMarca.setText("Marca");

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Renault", "Ford", "Fiat", "Volkswagen", "Chevrolet", "Toyota", "Hyundai", "Honda", "BMW", "Mercedes", "Audi" }));
        cmbMarca.setSelectedIndex(-1);
        cmbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarcaActionPerformed(evt);
            }
        });

        lblModelo.setText("Modelo");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        lblAno.setText("Ano");

        lblCor.setText("Cor");

        cmbCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prata", "Preto", "Branco", "Azul", "Amarelo", "Vermelho", "Verde" }));
        cmbCor.setSelectedIndex(-1);

        lblTransmissao.setText("Transmissão");

        cmbTransmissao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Automatico" }));
        cmbTransmissao.setSelectedIndex(-1);

        lblMotor.setText("Motor");

        txtMotor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotorActionPerformed(evt);
            }
        });

        lblPlaca.setText("Placa");

        lblRenavam.setText("Renavam");

        lblChassi.setText("Chassi");

        lblValorCompra.setText("Valor Compra");

        lblOdometro.setText("Odômetro");

        txtOdometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOdometroActionPerformed(evt);
            }
        });

        lblDisponivel.setText("Disponível");

        btnGroupDisponivel.add(rdDisponivelSim);
        rdDisponivelSim.setText("Sim");

        btnGroupDisponivel.add(rdDisponivelNao);
        rdDisponivelNao.setText("Não");

        lblCategoria.setText("Categoria");

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Caminhonete", "Caminhão", "Moto" }));
        cmbCategoria.setSelectedIndex(-1);
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        panelOpcionais.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcionais"));

        chkArCondicionado.setText("Ar Condicionado");

        chkABS.setText("ABS");
        chkABS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkABSActionPerformed(evt);
            }
        });

        chkTetoSolar.setText("Teto Solar");

        chkKitEletrico.setText("Kit Eletrico");
        chkKitEletrico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkKitEletricoActionPerformed(evt);
            }
        });

        chkBancoCouro.setText("Banco de Couro");

        chkDirecaoHidraulica.setText("Direcao Hidraulica");
        chkDirecaoHidraulica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDirecaoHidraulicaActionPerformed(evt);
            }
        });

        chkFarolMilha.setText("Farol de Milha");

        chkCentralMultimidia.setText("Central Multimidia");
        chkCentralMultimidia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCentralMultimidiaActionPerformed(evt);
            }
        });

        chkPilotoAutomatico.setText("Piloto Automatico");

        chkLuzDiurna.setText("Luz Diurna");
        chkLuzDiurna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLuzDiurnaActionPerformed(evt);
            }
        });

        chkComandoVolante.setText("Comando de Volante");

        chkAirBag.setText("AirBag");

        javax.swing.GroupLayout panelOpcionaisLayout = new javax.swing.GroupLayout(panelOpcionais);
        panelOpcionais.setLayout(panelOpcionaisLayout);
        panelOpcionaisLayout.setHorizontalGroup(
            panelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionaisLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(panelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(chkBancoCouro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkKitEletrico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkArCondicionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkTetoSolar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkABS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(chkDirecaoHidraulica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkFarolMilha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkCentralMultimidia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkPilotoAutomatico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkLuzDiurna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkComandoVolante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(chkAirBag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelOpcionaisLayout.setVerticalGroup(
            panelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkArCondicionado)
                    .addComponent(chkFarolMilha))
                .addGap(18, 18, 18)
                .addGroup(panelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkABS)
                    .addComponent(chkCentralMultimidia))
                .addGap(18, 18, 18)
                .addGroup(panelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkTetoSolar)
                    .addComponent(chkPilotoAutomatico))
                .addGap(18, 18, 18)
                .addGroup(panelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkKitEletrico)
                    .addComponent(chkLuzDiurna))
                .addGap(18, 18, 18)
                .addGroup(panelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBancoCouro)
                    .addComponent(chkComandoVolante))
                .addGap(18, 18, 18)
                .addGroup(panelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOpcionaisLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(chkDirecaoHidraulica))
                    .addGroup(panelOpcionaisLayout.createSequentialGroup()
                        .addComponent(chkAirBag)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));

        jLabel2.setText("Local Foto:");

        btnInserirFoto.setText("Inserir Foto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLoja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTransmissao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbLoja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMotor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTransmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValorCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOdometro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblChassi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRenavam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDisponivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPlaca)
                            .addComponent(txtRenavam)
                            .addComponent(txtChassi)
                            .addComponent(txtValorCompra)
                            .addComponent(txtOdometro)
                            .addComponent(cmbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdDisponivelSim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdDisponivelNao)))
                        .addGap(37, 37, 37)
                        .addComponent(panelOpcionais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLocalFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnInserirFoto)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLoja))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMarca)
                            .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModelo))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAno)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCor)
                            .addComponent(cmbCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTransmissao)
                            .addComponent(cmbTransmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMotor)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPlaca)
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRenavam)
                                    .addComponent(txtRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblChassi)
                                    .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblValorCompra)
                                    .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblOdometro)
                                    .addComponent(txtOdometro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDisponivel)
                                    .addComponent(rdDisponivelSim)
                                    .addComponent(rdDisponivelNao))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCategoria)
                                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(panelOpcionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtLocalFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInserirFoto)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOdometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOdometroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOdometroActionPerformed

    private void chkABSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkABSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkABSActionPerformed

    private void chkKitEletricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkKitEletricoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkKitEletricoActionPerformed

    private void chkDirecaoHidraulicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDirecaoHidraulicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkDirecaoHidraulicaActionPerformed

    private void chkCentralMultimidiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCentralMultimidiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCentralMultimidiaActionPerformed

    private void chkLuzDiurnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLuzDiurnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkLuzDiurnaActionPerformed

    private void txtMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotorActionPerformed

    private void cmbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMarcaActionPerformed

    private void cmbLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLojaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbLojaActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        cmbLoja.setSelectedIndex(-1);
        cmbMarca.setSelectedIndex(-1);
        txtModelo.setText("");
        txtAno.setText("");
        cmbCor.setSelectedIndex(-1);
        cmbTransmissao.setSelectedIndex(-1);
        txtMotor.setText("");
        txtPlaca.setText("");
        txtRenavam.setText("");
        txtChassi.setText("");
        txtValorCompra.setText("");
        txtOdometro.setText("");
        rdDisponivelNao.setSelected(false);
        rdDisponivelSim.setSelected(false);
        cmbCategoria.setSelectedIndex(-1);
        chkArCondicionado.setSelected(false);
        chkABS.setSelected(false);
        chkTetoSolar.setSelected(false);
        chkKitEletrico.setSelected(false);
        chkBancoCouro.setSelected(false);
        chkDirecaoHidraulica.setSelected(false);
        chkFarolMilha.setSelected(false);
        chkCentralMultimidia.setSelected(false);
        chkPilotoAutomatico.setSelected(false);
        chkLuzDiurna.setSelected(false);
        chkComandoVolante.setSelected(false);
        chkAirBag.setSelected(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Veiculo veiculo = new Veiculo();
        
        veiculo.setLojaReferencia(cmbLoja.getSelectedItem().toString());
        veiculo.setMarca(cmbMarca.getSelectedItem().toString());
        veiculo.setModelo(txtModelo.getText());
        veiculo.setAno(Integer.parseInt(txtAno.getText()));
        veiculo.setCor(cmbCor.getSelectedItem().toString());
        veiculo.setTransmissao(cmbTransmissao.getSelectedItem().toString());
        veiculo.setMotor(txtMotor.getText());
        veiculo.setPlaca(txtPlaca.getText());
        veiculo.setRenavam(Long.parseLong(txtRenavam.getText()));
        veiculo.setChassi(txtChassi.getText());
        veiculo.setValorCompra(Double.parseDouble(txtValorCompra.getText()));
        veiculo.setOdometro(Integer.parseInt(txtOdometro.getText()));
        veiculo.setDisponivel(chkDirecaoHidraulica.isSelected());
        veiculo.setCategoria(cmbCategoria.getSelectedItem().toString());
        veiculo.setArCondicionado(chkArCondicionado.isSelected());
        veiculo.setAbs(chkABS.isSelected());
        veiculo.setTetoSolar(chkTetoSolar.isSelected());
        veiculo.setKitEletrico(chkKitEletrico.isSelected());
        veiculo.setBancoCouro(chkBancoCouro.isSelected());
        veiculo.setDirecaoHidraulica(chkDirecaoHidraulica.isSelected());
        veiculo.setFarolMilha(chkFarolMilha.isSelected());
        veiculo.setCentralMultimidia(chkCentralMultimidia.isSelected());
        veiculo.setPilotoAutomatico(chkPilotoAutomatico.isSelected());
        veiculo.setLuzDiurna(chkLuzDiurna.isSelected());
        veiculo.setComandoVolante(chkComandoVolante.isSelected());
        veiculo.setAirBag(chkAirBag.isSelected());
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupDisponivel;
    private javax.swing.JButton btnInserirFoto;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox chkABS;
    private javax.swing.JCheckBox chkAirBag;
    private javax.swing.JCheckBox chkArCondicionado;
    private javax.swing.JCheckBox chkBancoCouro;
    private javax.swing.JCheckBox chkCentralMultimidia;
    private javax.swing.JCheckBox chkComandoVolante;
    private javax.swing.JCheckBox chkDirecaoHidraulica;
    private javax.swing.JCheckBox chkFarolMilha;
    private javax.swing.JCheckBox chkKitEletrico;
    private javax.swing.JCheckBox chkLuzDiurna;
    private javax.swing.JCheckBox chkPilotoAutomatico;
    private javax.swing.JCheckBox chkTetoSolar;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbCor;
    private javax.swing.JComboBox<String> cmbLoja;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JComboBox<String> cmbTransmissao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblChassi;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblDisponivel;
    private javax.swing.JLabel lblLoja;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblMotor;
    private javax.swing.JLabel lblOdometro;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblRenavam;
    private javax.swing.JLabel lblTransmissao;
    private javax.swing.JLabel lblValorCompra;
    private javax.swing.JPanel panelOpcionais;
    private javax.swing.JRadioButton rdDisponivelNao;
    private javax.swing.JRadioButton rdDisponivelSim;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtChassi;
    private javax.swing.JTextField txtLocalFoto;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtOdometro;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtRenavam;
    private javax.swing.JTextField txtValorCompra;
    // End of variables declaration//GEN-END:variables
}

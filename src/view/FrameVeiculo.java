package view;

/**
 *
 * @author mario
 */
public class FrameVeiculo extends javax.swing.JPanel {

    public FrameVeiculo() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtValorCompra = new javax.swing.JTextField();
        lblOdometro = new javax.swing.JLabel();
        txtOdometro = new javax.swing.JTextField();
        lblFoto = new javax.swing.JLabel();
        lblDisponivel = new javax.swing.JLabel();
        lblLocalFoto = new javax.swing.JLabel();
        rdDisponivelSim = new javax.swing.JRadioButton();
        txtLocalFoto = new javax.swing.JTextField();
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
        lblMarca = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox<>();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblAno = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        lblCor = new javax.swing.JLabel();
        txtChassi = new javax.swing.JTextField();
        lblValorCompra = new javax.swing.JLabel();

        lblOdometro.setText("Odômetro");

        txtOdometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOdometroActionPerformed(evt);
            }
        });

        lblFoto.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));

        lblDisponivel.setText("Disponível");

        lblLocalFoto.setText("Local Foto:");

        buttonGroup1.add(rdDisponivelSim);
        rdDisponivelSim.setText("Sim");

        buttonGroup1.add(rdDisponivelNao);
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

        cmbCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "prata", "preto", "branco", "azul", "amarelo", "vermelho", "verde" }));
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

        lblMarca.setText("Marca");

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Renault", "Ford", "Fiat", "Volkswagen", "Chevrolet", "Toyota", "Hyundai", "Honda", "BMW", "Mercedes", "Audi" }));
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

        lblValorCompra.setText("Valor Compra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTransmissao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTransmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLocalFoto)
                        .addGap(18, 18, 18)
                        .addComponent(txtLocalFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
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
                .addGap(35, 35, 35)
                .addComponent(panelOpcionais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOpcionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(rdDisponivelNao)))
                            .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(lblMotor))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCategoria)
                            .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLocalFoto)
                            .addComponent(txtLocalFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtOdometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOdometroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOdometroActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriaActionPerformed

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

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    public static void limparCampos(){
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
        lblFoto.setIcon(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JCheckBox chkABS;
    public static javax.swing.JCheckBox chkAirBag;
    public static javax.swing.JCheckBox chkArCondicionado;
    public static javax.swing.JCheckBox chkBancoCouro;
    public static javax.swing.JCheckBox chkCentralMultimidia;
    public static javax.swing.JCheckBox chkComandoVolante;
    public static javax.swing.JCheckBox chkDirecaoHidraulica;
    public static javax.swing.JCheckBox chkFarolMilha;
    public static javax.swing.JCheckBox chkKitEletrico;
    public static javax.swing.JCheckBox chkLuzDiurna;
    public static javax.swing.JCheckBox chkPilotoAutomatico;
    public static javax.swing.JCheckBox chkTetoSolar;
    public static javax.swing.JComboBox<String> cmbCategoria;
    public static javax.swing.JComboBox<String> cmbCor;
    public static javax.swing.JComboBox<String> cmbMarca;
    public static javax.swing.JComboBox<String> cmbTransmissao;
    public static javax.swing.JLabel lblAno;
    public static javax.swing.JLabel lblCategoria;
    public static javax.swing.JLabel lblChassi;
    public static javax.swing.JLabel lblCor;
    public static javax.swing.JLabel lblDisponivel;
    public static javax.swing.JLabel lblFoto;
    public static javax.swing.JLabel lblLocalFoto;
    public static javax.swing.JLabel lblMarca;
    public static javax.swing.JLabel lblModelo;
    public static javax.swing.JLabel lblMotor;
    public static javax.swing.JLabel lblOdometro;
    public static javax.swing.JLabel lblPlaca;
    public static javax.swing.JLabel lblRenavam;
    public static javax.swing.JLabel lblTransmissao;
    public static javax.swing.JLabel lblValorCompra;
    public static javax.swing.JPanel panelOpcionais;
    public static javax.swing.JRadioButton rdDisponivelNao;
    public static javax.swing.JRadioButton rdDisponivelSim;
    public static javax.swing.JTextField txtAno;
    public static javax.swing.JTextField txtChassi;
    public static javax.swing.JTextField txtLocalFoto;
    public static javax.swing.JTextField txtModelo;
    public static javax.swing.JTextField txtMotor;
    public static javax.swing.JTextField txtOdometro;
    public static javax.swing.JTextField txtPlaca;
    public static javax.swing.JTextField txtRenavam;
    public static javax.swing.JTextField txtValorCompra;
    // End of variables declaration//GEN-END:variables
}

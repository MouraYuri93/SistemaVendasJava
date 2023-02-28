package formularios;

import classes.Dados;
import classes.Utilidades;
import java.util.Date;

public class frmVenda extends javax.swing.JInternalFrame {
    private Dados msDados;
    
    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }
    
    public frmVenda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        faturaQuantidade = new javax.swing.JLabel();
        faturaData = new javax.swing.JLabel();
        faturaCliente = new javax.swing.JLabel();
        faturaProduto = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        cmbProduto = new javax.swing.JComboBox<>();
        cmbCliente = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalhes = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnPesquisarPro = new javax.swing.JButton();
        btnAdicionar4 = new javax.swing.JButton();
        btnPesquisarCli = new javax.swing.JButton();
        faturaValor = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        faturaTotal1 = new javax.swing.JLabel();
        txtQuantiTotal = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Nova Venda");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        faturaQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        faturaQuantidade.setText("Quantidade:");

        faturaData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        faturaData.setText("Data:");

        faturaCliente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        faturaCliente.setText("Cliente:");

        faturaProduto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        faturaProduto.setText("Produto:");

        txtData.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        txtData.setEnabled(false);
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        txtQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        txtQuantidade.setEnabled(false);

        cmbProduto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cmbProduto.setEnabled(false);

        cmbCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cmbCliente.setEnabled(false);

        tblDetalhes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDetalhes);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/excluir-48.png"))); // NOI18N
        btnExcluir.setToolTipText("Excluir");

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/salvar48.png"))); // NOI18N
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.setEnabled(false);

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/deletar48.png"))); // NOI18N
        btnDeletar.setToolTipText("Deletar");

        btnPesquisarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pesquisar48.png"))); // NOI18N
        btnPesquisarPro.setToolTipText("Pesquisar");

        btnAdicionar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/adicionar48.png"))); // NOI18N
        btnAdicionar4.setToolTipText("Adicionar");

        btnPesquisarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pesquisar48.png"))); // NOI18N
        btnPesquisarCli.setToolTipText("Pesquisar");

        faturaValor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        faturaValor.setText("Valor Total:");

        txtValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        txtValorTotal.setEnabled(false);
        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });

        faturaTotal1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        faturaTotal1.setText("Quantidade Total:");

        txtQuantiTotal.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        txtQuantiTotal.setEnabled(false);
        txtQuantiTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantiTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionar4)
                        .addGap(34, 34, 34)
                        .addComponent(btnExcluir)
                        .addGap(43, 43, 43)
                        .addComponent(btnDeletar)
                        .addGap(31, 31, 31)
                        .addComponent(btnSalvar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(faturaTotal1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantiTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(faturaValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(faturaData)
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(faturaCliente)
                                            .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPesquisarCli)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(faturaQuantidade)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(faturaProduto)
                                            .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPesquisarPro)))))
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(faturaQuantidade)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPesquisarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(faturaProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(faturaData)
                        .addGap(3, 3, 3)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btnPesquisarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(faturaCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAdicionar4))
                    .addComponent(btnExcluir))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faturaValor)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faturaTotal1)
                    .addComponent(txtQuantiTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTotalActionPerformed

    private void txtQuantiTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantiTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantiTotalActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        txtData.setText(Utilidades.formatDate(new Date()));
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar4;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisarCli;
    private javax.swing.JButton btnPesquisarPro;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JLabel faturaCliente;
    private javax.swing.JLabel faturaData;
    private javax.swing.JLabel faturaProduto;
    private javax.swing.JLabel faturaQuantidade;
    private javax.swing.JLabel faturaTotal1;
    private javax.swing.JLabel faturaValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDetalhes;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQuantiTotal;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}

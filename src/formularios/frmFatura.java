package formularios;

import classes.Dados;
import classes.Opcoes;
import classes.Utilidades;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class frmFatura extends javax.swing.JInternalFrame {

    private Dados msDados;
    private DefaultTableModel mTabela;
    
    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }
    
    public frmFatura() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        faturaTotal1 = new javax.swing.JLabel();
        faturaValor = new javax.swing.JLabel();
        faturaData = new javax.swing.JLabel();
        faturaQuantidade = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        faturaTotal2 = new javax.swing.JLabel();
        faturaValor1 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        txtQuantiTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalhes = new javax.swing.JTable();
        faturaCliente = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        btnPesquisarCli = new javax.swing.JButton();
        faturaProduto = new javax.swing.JLabel();
        cmbProduto = new javax.swing.JComboBox<>();
        btnPesquisarPro = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();

        faturaTotal1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        faturaTotal1.setText("Quantidade Total:");

        faturaValor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        faturaValor.setText("Valor Total:");

        setClosable(true);
        setMaximizable(true);
        setTitle("Vendas");
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

        faturaData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        faturaData.setText("Data:");

        faturaQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        faturaQuantidade.setText("Quantidade:");

        txtData.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        txtData.setEnabled(false);

        txtQuantidade.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N

        faturaTotal2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        faturaTotal2.setText("Quantidade Total:");

        faturaValor1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        faturaValor1.setText("Valor Total:");

        txtValorTotal.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        txtValorTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValorTotal.setEnabled(false);

        txtQuantiTotal.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        txtQuantiTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQuantiTotal.setEnabled(false);

        tblDetalhes.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
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

        faturaCliente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        faturaCliente.setText("Cliente:");

        cmbCliente.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N

        btnPesquisarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pesquisar48.png"))); // NOI18N
        btnPesquisarCli.setToolTipText("Pesquisar");

        faturaProduto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        faturaProduto.setText("Produto:");

        cmbProduto.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N

        btnPesquisarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pesquisar48.png"))); // NOI18N
        btnPesquisarPro.setToolTipText("Pesquisar");

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/excluir-48.png"))); // NOI18N
        btnExcluir.setToolTipText("Excluir");

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/deletar48.png"))); // NOI18N
        btnDeletar.setToolTipText("Deletar");

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/salvar48.png"))); // NOI18N
        btnSalvar.setToolTipText("Salvar");

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/adicionar48.png"))); // NOI18N
        btnAdicionar.setToolTipText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(faturaData)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(faturaCliente)
                                        .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnPesquisarCli)
                                    .addComponent(btnExcluir)))
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnDeletar)
                                .addGap(264, 264, 264)
                                .addComponent(btnSalvar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(faturaQuantidade, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(faturaProduto)
                                    .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisarPro)))
                        .addGap(9, 9, 9))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(faturaTotal2)
                        .addGap(26, 26, 26)
                        .addComponent(txtQuantiTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(faturaValor1)
                        .addGap(18, 18, 18)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(faturaData)
                        .addGap(3, 3, 3)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(faturaQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(faturaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbCliente)
                            .addComponent(btnPesquisarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(faturaProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbProduto)
                            .addComponent(btnPesquisarPro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnDeletar)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(btnSalvar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(faturaTotal2)
                                .addComponent(txtQuantiTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(faturaValor1)
                                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Opcoes opc = new Opcoes("mourayuri93@gmail.com", "Selecione um cliente");
        cmbCliente.addItem(opc.toString());
        for(int i = 0; i < msDados.numeroClientes(); i++) {
            opc = new Opcoes(
                        msDados.getClientes()[i].getIdCliente(),
                        msDados.getClientes()[i].getNome() + " " +
                        msDados.getClientes()[i].getSobrenome());
                        cmbCliente.addItem(opc.toString());    
        }
        
        opc = new Opcoes("moruayuri93@gmail.com", "Selecione um produto");
        cmbProduto.addItem(opc.toString());
        for(int i = 0; i < msDados.numeroProdutos(); i++) {
            opc = new Opcoes(
          msDados.getProdutos()[i].getIdProduto(),
       msDados.getProdutos()[i].getDescricao());
                cmbProduto.addItem(opc.toString());            
        }
        
        txtData.setText(Utilidades.formatDate(new Date()));
        txtQuantiTotal.setText("0");
        txtValorTotal.setText("0");
        
        preencherTabela();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if(cmbProduto.getSelectedIndex() ==0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto!");
            cmbProduto.requestFocusInWindow();
            return;
        }
        
        if(cmbCliente.getSelectedIndex() ==0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um cliente!");
            cmbCliente.requestFocusInWindow();
            return;
        }
        
        if(txtQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Inserir quandidade!");
            txtQuantidade.requestFocusInWindow();
            return;
        }
        
        if(!Utilidades.isNumeric(txtQuantidade.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Inserir somente números!");
            txtQuantidade.setText("");
            txtQuantidade.requestFocusInWindow();
            return;
        }
        
        int quantidade = Integer.parseInt(txtQuantidade.getText());
        if(quantidade <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Favor colocar acima de 0");
            txtQuantidade.setText("");
            txtQuantidade.requestFocusInWindow();
            return;
        }
            
        int pos = msDados.posicaoProduto(((Opcoes)cmbProduto.getSelectedItem()).getValor());
        
        String registro[] = new String[5];
        registro[0] = msDados.getProdutos()[pos].getIdProduto();
        registro[1] = msDados.getProdutos()[pos].getDescricao();
        registro[2] = ""+ msDados.getProdutos()[pos].getPreco();
        registro[3] = ""+ quantidade;
        registro[4] = ""+ (quantidade* msDados.getProdutos()[pos].getPreco());
        mTabela.addRow(registro);
        
        cmbProduto.setSelectedIndex(0);
        txtQuantidade.setText("");
        cmbProduto.requestFocusInWindow();
    }//GEN-LAST:event_btnAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
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
    private javax.swing.JLabel faturaTotal2;
    private javax.swing.JLabel faturaValor;
    private javax.swing.JLabel faturaValor1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDetalhes;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQuantiTotal;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        String titulos[] = {"ID Produdo", "Descrição", "Preço", "Qtd", "Valor"};
        String registro[] = new String[5];
        mTabela = new DefaultTableModel(null, titulos);
        tblDetalhes.setModel(mTabela);
        
        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tblDetalhes.getColumnModel().getColumn(2).setCellRenderer(dtcr);
        tblDetalhes.getColumnModel().getColumn(3).setCellRenderer(dtcr);
        tblDetalhes.getColumnModel().getColumn(4).setCellRenderer(dtcr);
    }

}

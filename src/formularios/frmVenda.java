package formularios;

import classes.Dados;
import classes.Opcoes;
import classes.Utilidades;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class frmVenda extends javax.swing.JInternalFrame {
    private Dados msDados;
    private DefaultTableModel mTabela;
    
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

        cmbProduto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        cmbCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

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
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/deletar48.png"))); // NOI18N
        btnDeletar.setToolTipText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnPesquisarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pesquisar48.png"))); // NOI18N
        btnPesquisarPro.setToolTipText("Pesquisar");

        btnAdicionar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/adicionar48.png"))); // NOI18N
        btnAdicionar4.setToolTipText("Adicionar");
        btnAdicionar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionar4ActionPerformed(evt);
            }
        });

        btnPesquisarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pesquisar48.png"))); // NOI18N
        btnPesquisarCli.setToolTipText("Pesquisar");

        faturaValor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        faturaValor.setText("Valor Total:");

        txtValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        txtValorTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValorTotal.setEnabled(false);
        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });

        faturaTotal1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        faturaTotal1.setText("Quantidade Total:");

        txtQuantiTotal.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        txtQuantiTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
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
        Opcoes opc = new Opcoes("moruayuri93@gmail.com", "Selecione um cliente");
        cmbCliente.addItem(opc.toString());
        for(int i = 0; i < msDados.numeroClientes(); i++) {
            opc = new Opcoes(
           msDados.getClientes()[i].getIdCliente(),
                msDados.getClientes()[i].getNome() + "" +
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

    private void btnAdicionar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionar4ActionPerformed
        if(cmbProduto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar produto");
            cmbProduto.requestFocusInWindow();
            return;
        }
        
        if(txtQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Favor inserir uma Quantidade!");
            txtQuantidade.requestFocusInWindow();
            return;
        }
        
        if(!Utilidades.isNumeric(txtQuantidade.getText())) {
           JOptionPane.showMessageDialog(rootPane, "Favor inserir somente numeros");
           txtQuantidade.setText("");
           txtQuantidade.requestFocusInWindow();
           return; 
        }
        
        int quantidade = Integer.parseInt(txtQuantidade.getText());
        if(quantidade <= 0) {
            JOptionPane.showMessageDialog(rootPane,"Favor inserir numeros acima de zero");
            txtQuantidade.requestFocusInWindow();
            txtQuantidade.setText("");
            return;
        }
        
        int pos = msDados.posicaoProduto(((Opcoes)cmbProduto.getSelectedItem()).getValor());
        
        String registro[] = new String[5];
        registro[0] = msDados.getProdutos()[pos].getIdProduto();
        registro[1] = msDados.getProdutos()[pos].getDescricao();
        registro[2] = "" + msDados.getProdutos()[pos].getPreco();
        registro[3] = "" + quantidade;
        registro[4] = "" + (quantidade* msDados.getProdutos()[pos].getPreco());
        mTabela.addRow(registro);
        
        cmbProduto.setSelectedIndex(0);
        txtQuantidade.setText("");
        cmbProduto.requestFocusInWindow();
        totais();
        
    }//GEN-LAST:event_btnAdicionar4ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(cmbCliente.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar um cliente");
            cmbCliente.requestFocusInWindow();
            return;
        }
        int totalQuant = new Integer(txtQuantiTotal.getText());
        
        if(totalQuant==0) {
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar um produto");
            cmbProduto.requestFocusInWindow();
            return;
        }
        
        int resposta = JOptionPane.showConfirmDialog(rootPane,"Confirmar a venda?");
        if(resposta != 0) {
            return;
        }
        
        int numVenda = msDados.getNumeroVenda()+1;
            FileWriter fw = null;
            PrintWriter pw = null;
            try {
                fw = new FileWriter("Data/venda.txt", true);
                pw = new PrintWriter(fw);
                
                String aux = "1|"
                        + numVenda + "|"
                        + ((Opcoes)cmbCliente.getSelectedItem()).getValor() + "|"
                        + ((Opcoes)cmbCliente.getSelectedItem()).getDescricao() + "|"
                        + txtData.getText();
                pw.println(aux);
                
                int num = tblDetalhes.getRowCount();
                for(int i = 0; i < num; i++) {
                    aux = "2|"
                        + Utilidades.objectToString(tblDetalhes.getValueAt(i, 0)) + "|"
                        + Utilidades.objectToString(tblDetalhes.getValueAt(i, 1)) + "|"
                        + Utilidades.objectToString(tblDetalhes.getValueAt(i, 2)) + "|"
                        + Utilidades.objectToString(tblDetalhes.getValueAt(i, 3)) + "|"
                        + Utilidades.objectToString(tblDetalhes.getValueAt(i, 4));
                    pw.println(aux);
                }

            } catch (Exception e1) {
                e1.printStackTrace();
            } finally {
                try {
                    if(fw!= null) {
                        fw.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            JOptionPane.showMessageDialog(rootPane, 
                    "Venda:" + numVenda + "Venda realizada com sucesso!");
            msDados.setNumeroFatura(numVenda);
            cmbCliente.setSelectedIndex(0);
            limparTabela();
            totais();
            cmbCliente.requestFocusInWindow();
            
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
       int resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja deletar essa venda?");
        if(resposta != 0) {
            return;
        }
        limparTabela();
        totais();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void preencherTabela() {
        String titulos[] = {"ID Produdo", "Descriç]ao", "Preço", "Qtd", "Valor"};
        String registro[] = new String[5];
        mTabela = new DefaultTableModel(null, titulos);
        tblDetalhes.setModel(mTabela);
        
        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tblDetalhes.getColumnModel().getColumn(2).setCellRenderer(dtcr);
        tblDetalhes.getColumnModel().getColumn(3).setCellRenderer(dtcr);
        tblDetalhes.getColumnModel().getColumn(4).setCellRenderer(dtcr);
    }
    
    private void totais() {
        int num = tblDetalhes.getRowCount();
        int somQuant = 0, somVal = 0;
        for(int i = 0; i < num; i++) {
            somQuant += Utilidades.objectToInt(tblDetalhes.getValueAt(i, 3));
            somVal += Utilidades.objectToInt(tblDetalhes.getValueAt(i, 4));
        }
        txtQuantiTotal.setText("" + somQuant);
        txtValorTotal.setText("" + somVal);
    }
    
    public void limparTabela() {
        try {
            DefaultTableModel modelo = (DefaultTableModel)tblDetalhes.getModel();
            int linha = tblDetalhes.getRowCount();
            for(int i = 0; linha > i; i++){
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

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

package formularios;

import classes.Dados;
import classes.Produto;
import classes.Utilidades;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmProdutos extends javax.swing.JInternalFrame {
        private Dados msDados;
        private int proAtual = 0;
        private boolean novo = false;
        private DefaultTableModel mTabela;

            public void setDados(Dados msDados) {
                this.msDados = msDados;
            }
    
    public frmProdutos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuarioIdProduto = new javax.swing.JLabel();
        usuarioSobrenome = new javax.swing.JLabel();
        usuarioNome = new javax.swing.JLabel();
        usuarioSenha = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        txtIdProduto = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        usuarioPerfil = new javax.swing.JLabel();
        cmbImposto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnPrimeiro = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnotacoes = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setTitle("Produtos");
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

        usuarioIdProduto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        usuarioIdProduto.setText("ID Produto:");

        usuarioSobrenome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        usuarioSobrenome.setText("Preço:");

        usuarioNome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        usuarioNome.setText("Descrição:");

        usuarioSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        usuarioSenha.setText("Anotações:");

        txtPreco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPreco.setEnabled(false);

        txtIdProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtIdProduto.setEnabled(false);

        txtDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescricao.setEnabled(false);

        usuarioPerfil.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        usuarioPerfil.setText("Imposto:");

        cmbImposto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbImposto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "15%" }));
        cmbImposto.setToolTipText("");
        cmbImposto.setEnabled(false);
        cmbImposto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbImpostoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 60));
        jLabel3.setName(""); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 60));
        jLabel4.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 60));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/produto100.png"))); // NOI18N
        jLabel5.setName(""); // NOI18N

        btnPrimeiro.setBackground(new java.awt.Color(204, 204, 204));
        btnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back48.png"))); // NOI18N
        btnPrimeiro.setToolTipText("Primeiro");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnUltimo.setBackground(new java.awt.Color(204, 204, 204));
        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next48.png"))); // NOI18N
        btnUltimo.setToolTipText("Ultimo");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnAdicionar.setBackground(new java.awt.Color(204, 204, 204));
        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/adicionar48.png"))); // NOI18N
        btnAdicionar.setToolTipText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(204, 204, 204));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/editar48.png"))); // NOI18N
        btnEditar.setToolTipText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(204, 204, 204));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/salvar48.png"))); // NOI18N
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnDeletar.setBackground(new java.awt.Color(204, 204, 204));
        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/deletar48.png"))); // NOI18N
        btnDeletar.setToolTipText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancelar48.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAnterior.setBackground(new java.awt.Color(204, 204, 204));
        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/retrocesso-48.png"))); // NOI18N
        btnAnterior.setToolTipText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setBackground(new java.awt.Color(204, 204, 204));
        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/avanço48.png"))); // NOI18N
        btnProximo.setToolTipText("Proximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        tblTabela.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTabela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tblTabela);

        btnPesquisar.setBackground(new java.awt.Color(204, 204, 204));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pesquisar48.png"))); // NOI18N
        btnPesquisar.setToolTipText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtAnotacoes.setColumns(20);
        txtAnotacoes.setRows(5);
        txtAnotacoes.setEnabled(false);
        jScrollPane2.setViewportView(txtAnotacoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuarioNome)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuarioIdProduto)
                            .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuarioPerfil)
                            .addComponent(usuarioSobrenome)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbImposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(157, 157, 157)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuarioSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(35, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 404, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 404, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 404, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 404, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(usuarioIdProduto)
                                    .addComponent(usuarioPerfil))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbImposto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5))
                        .addGap(22, 22, 22)
                        .addComponent(usuarioNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usuarioSobrenome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(usuarioSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 377, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 378, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 377, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 378, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbImpostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbImpostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbImpostoActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnAdicionar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnDeletar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnPesquisar.setEnabled(false);
        //caixa de textos
        txtIdProduto.setEnabled(true);
        txtDescricao.setEnabled(true);
        txtPreco.setEnabled(true);
        txtAnotacoes.setEnabled(true);
        cmbImposto.setEnabled(true);
        
        //limpar caixa de textos
        txtIdProduto.setText(" ");
        txtDescricao.setText(" ");
        txtPreco.setText(" ");
        txtAnotacoes.setText(" ");        
        cmbImposto.setSelectedIndex(0);
        
        novo = true;
        txtIdProduto.requestFocus();
        
        
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       btnPrimeiro.setEnabled(false);
       btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnAdicionar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnDeletar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnPesquisar.setEnabled(false);
        //caixa de textos
        txtDescricao.setEnabled(true);
        txtPreco.setEnabled(true);
        cmbImposto.setEnabled(true);
        txtAnotacoes.setEnabled(true);
        
        novo = false;
        txtAnotacoes.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtIdProduto.getText().equals(" ")) {
            JOptionPane.showMessageDialog(rootPane,"Favor inserir um numero de ID");
            txtIdProduto.requestFocusInWindow();
            return;
        }
        
        if(cmbImposto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane,"Favor selecionar um imposto");
            cmbImposto.requestFocusInWindow();
            return;
        }
                        
        if(txtPreco.getText().equals(" ")) {
            JOptionPane.showMessageDialog(rootPane,"Favor inserir um preço");
            txtPreco.requestFocusInWindow();
            return;
        }
        
        if (!Utilidades.isNumeric(txtPreco.getText())) {
           JOptionPane.showMessageDialog(rootPane, "Favor inserir somente numeros");
            txtPreco.requestFocusInWindow();
            return; 
        }
        
        int preco = Integer.parseInt(txtPreco.getText());
        if (preco <=0) {
            JOptionPane.showMessageDialog(rootPane,"Favor inserir numeros acima de zero");
            txtPreco.requestFocusInWindow();
            return;
        }
        
        if(txtDescricao.getText().equals(" ")) {
            JOptionPane.showMessageDialog(rootPane,"Favor inserir uma descrição");
            txtDescricao.requestFocusInWindow();
            return;
        }
        
       int pos = msDados.posicaoProduto(txtIdProduto.getText());
       if(novo) {
           if(pos != -1) {
                JOptionPane.showMessageDialog(rootPane,"Produto já existe");
                txtIdProduto.requestFocusInWindow();
                return;
           }
       } else {
           if(pos == 1) {
                JOptionPane.showMessageDialog(rootPane, "Produto disponível");
                txtIdProduto.requestFocusInWindow();
                return;
           }
       }
       
        Produto mProduto = new Produto(
                txtIdProduto.getText(), 
                txtDescricao.getText(), 
                preco, 
                cmbImposto.getSelectedIndex(), 
                txtAnotacoes.getText());                           
       String msg;
       if(novo){
           msg  = msDados.adicionarProduto(mProduto);
       }else {
           msg  = msDados.editarPoduto(mProduto, pos);
           
          }  
           JOptionPane.showMessageDialog(rootPane, msg);
      
        
        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnAdicionar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnDeletar.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnPesquisar.setEnabled(true);
         //desabilitar os campos
        txtIdProduto.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtPreco.setEnabled(false);
        cmbImposto.setEnabled(false);
        txtAnotacoes.setEnabled(false);
        
        preencherTabela();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja deletar esse produto?");
        if(resposta != 0) {
            return;
        }
        String msg;
        msg = msDados.deletarProduto(proAtual);
        JOptionPane.showMessageDialog(rootPane, msg);
        proAtual = 0;
        mostrarRegistro();
        preencherTabela();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnAdicionar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnDeletar.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnPesquisar.setEnabled(true);
         //desabilitar os campos
        txtIdProduto.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtPreco.setEnabled(false);
         cmbImposto.setEnabled(false);
         txtAnotacoes.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
       proAtual = 0;
       mostrarRegistro();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        proAtual = msDados.numeroProdutos()-1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
      mostrarRegistro();
      preencherTabela();
      
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        proAtual++;
        if(  proAtual == msDados.numeroProdutos()) {
             proAtual = 0;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        proAtual --;
       if ( proAtual == -1) {
            proAtual = msDados.numeroProdutos()-1;
       }
       mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String produto = JOptionPane.showInputDialog("Favor inserir codigo do produto");
        if(produto.equals("")) {
            return;
        }
        int pos = msDados.posicaoProduto(produto);
        if(pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Este produto não existe");
            return;
        }
         proAtual = pos;
        mostrarRegistro();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void mostrarRegistro() {
        txtIdProduto.setText(msDados.getProdutos()[proAtual].getIdProduto());
        txtDescricao.setText(msDados.getProdutos()[proAtual].getDescricao());
        txtPreco.setText(" " + msDados.getProdutos()[proAtual].getPreco());
        txtAnotacoes.setText(msDados.getProdutos()[proAtual].getAnotacao());
        cmbImposto.setSelectedIndex(msDados.getProdutos()[proAtual].getImposto());
    }
    
    private void preencherTabela() {
        String titulos[] = {"ID Produto", "Descrição", "Preço", "Imposto", "Anotações"};
        String registro[] = new String[5];
        mTabela = new DefaultTableModel(null, titulos);
        for (int i = 0; i < msDados.numeroProdutos(); i++) {
            registro[0] = msDados.getProdutos()[i].getIdProduto();
            registro[1] = msDados.getProdutos()[i].getDescricao();
            registro[2] = " " + msDados.getProdutos()[i].getPreco();
            registro[3] = imposto (msDados.getProdutos()[i].getImposto());
            registro[4] = msDados.getProdutos()[i].getAnotacao();
            mTabela.addRow(registro);
        }
        tblTabela.setModel(mTabela);
    }
    
    private String imposto(int idIMPOSTO) {
        switch(idIMPOSTO) {
            case 0: return "0%";
            case 1: return "10%";
            case 2: return "15%";
            default : return "Não definido";
        }
    }
    

    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cmbImposto;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextArea txtAnotacoes;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JLabel usuarioIdProduto;
    private javax.swing.JLabel usuarioNome;
    private javax.swing.JLabel usuarioPerfil;
    private javax.swing.JLabel usuarioSenha;
    private javax.swing.JLabel usuarioSobrenome;
    // End of variables declaration//GEN-END:variables
}

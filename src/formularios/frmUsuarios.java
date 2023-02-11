package formularios;

import classes.Dados;
import classes.Usuario;
import javax.swing.JOptionPane;


public class frmUsuarios extends javax.swing.JInternalFrame {
        private Dados msDados;
        private int usuAtual = 0;
        private boolean novo = false;

            public void setDados(Dados msDados) {
                this.msDados = msDados;
            }
    
    public frmUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuarioIdUsuario = new javax.swing.JLabel();
        usuarioSobrenome = new javax.swing.JLabel();
        usuarioNome = new javax.swing.JLabel();
        usuarioSenha = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        txtIdUsuario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        usuarioPerfil = new javax.swing.JLabel();
        usuarioConfiSenha = new javax.swing.JLabel();
        cmbPerfil = new javax.swing.JComboBox<>();
        txtConfiSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnPrimeiro = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setTitle("Usuarios");
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

        usuarioIdUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        usuarioIdUsuario.setText("ID Usuario:");

        usuarioSobrenome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        usuarioSobrenome.setText("Sobrenome:");

        usuarioNome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        usuarioNome.setText("Nome:");

        usuarioSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        usuarioSenha.setText("Senha:");

        txtSobrenome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtSobrenome.setEnabled(false);

        txtIdUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtIdUsuario.setEnabled(false);

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtNome.setEnabled(false);

        usuarioPerfil.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        usuarioPerfil.setText("Perfil:");

        usuarioConfiSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        usuarioConfiSenha.setText("Confirmar Senha:");

        cmbPerfil.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Perfil", "Administrador", "Funcionario" }));
        cmbPerfil.setToolTipText("");
        cmbPerfil.setEnabled(false);
        cmbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilActionPerformed(evt);
            }
        });

        txtConfiSenha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtConfiSenha.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 60));
        jLabel3.setName(""); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 60));
        jLabel4.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 60));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user100.png"))); // NOI18N
        jLabel5.setName(""); // NOI18N

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtSenha.setEnabled(false);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usuarioNome)
                                    .addComponent(usuarioIdUsuario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usuarioPerfil)
                                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(128, 128, 128)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuarioSobrenome)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usuarioSenha, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(153, 153, 153)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(usuarioConfiSenha)
                                    .addComponent(txtConfiSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 243, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 491, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 492, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 491, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 492, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(usuarioIdUsuario)
                                    .addComponent(usuarioPerfil))
                                .addGap(49, 49, 49)))
                        .addComponent(usuarioNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(usuarioSobrenome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuarioSenha)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(usuarioConfiSenha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfiSenha))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 293, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 294, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 293, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 294, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPerfilActionPerformed

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
        //caixa de textos
        txtIdUsuario.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtConfiSenha.setEnabled(true);
        cmbPerfil.setEnabled(true);
        //limpar caixa de textos
        txtIdUsuario.setText(" ");
        txtNome.setText(" ");
        txtSobrenome.setText(" ");
        txtSenha.setText(" ");
        txtConfiSenha.setText("");
        cmbPerfil.setSelectedIndex(0);
        
        novo = true;
        txtIdUsuario.requestFocus();
        
        
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
        //caixa de textos
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtConfiSenha.setEnabled(true);
        cmbPerfil.setEnabled(true);
        
        novo = false;
        txtNome.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtIdUsuario.getText().equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Favor inserir um numero de ID");
            txtIdUsuario.requestFocusInWindow();
            return;
        }
        
        if(cmbPerfil.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar um perfil");
            cmbPerfil.requestFocusInWindow();
            return;
        }
        
        if(txtNome.getText().equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Favor inserir um nome");
            txtNome.requestFocusInWindow();
            return;
        }
        
        if(txtSobrenome.getText().equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Favor inserir um sobrenome");
            txtSobrenome.requestFocusInWindow();
            return;
        }
        
        String senha = new String (txtSenha.getPassword());
        String confirmar = new String (txtConfiSenha.getPassword());
        
        if(senha.equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Favor inserir uma senha");
            txtSenha.requestFocusInWindow();
            return;
        }
        
        if(confirmar.equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Favor confirmar senha");
            txtConfiSenha.requestFocusInWindow();
            return;
        }
        
       if(! senha.equals(confirmar)) {
            JOptionPane.showMessageDialog(rootPane, "Senhas diferentes");
            txtSenha.requestFocusInWindow();
            return;
        }
       
       int pos =msDados.posicaoUsuario(txtIdUsuario.getText());
       if(novo) {
           if(pos != -1) {
                JOptionPane.showMessageDialog(rootPane, "Usuário já existe");
                txtSenha.requestFocusInWindow();
                return;
           }
       } else {
           if(pos == 1) {
                JOptionPane.showMessageDialog(rootPane, "Usuário disponível");
                txtSenha.requestFocusInWindow();
                return;
           }
       }
       
       Usuario msUsuario = new Usuario(
               txtIdUsuario.getText(),
                txtNome.getText(),
                txtSobrenome.getText(),
                 senha,
                cmbPerfil.getSelectedIndex());
       String msg = msDados.adicionarUsuario(msUsuario);
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
         //desabilitar os campos
        txtIdUsuario.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        txtSenha.setEnabled(false);
        txtConfiSenha.setEnabled(false);
        cmbPerfil.setEnabled(false);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
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
         //desabilitar os campos
        txtIdUsuario.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        txtSenha.setEnabled(false);
        txtConfiSenha.setEnabled(false);
        cmbPerfil.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
       usuAtual = 0;
       mostrarRegistro();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        usuAtual = msDados.numerUsuarios() -1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
      mostrarRegistro();
      
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        usuAtual++;
        if( usuAtual == msDados.numerUsuarios()) {
            usuAtual = 0;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
       usuAtual --;
       if (usuAtual == -1) {
           usuAtual = msDados.numerUsuarios() -1;
       }
       mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void mostrarRegistro() {
        txtIdUsuario.setText(msDados.getUsuarios()[usuAtual].getIdUsuario());
        txtNome.setText(msDados.getUsuarios()[usuAtual].getNome());
        txtSobrenome.setText(msDados.getUsuarios()[usuAtual].getSobreNome());
        txtSenha.setText(msDados.getUsuarios()[usuAtual].getSenha());
        txtConfiSenha.setText(msDados.getUsuarios()[usuAtual].getSenha());
        cmbPerfil.setSelectedIndex(msDados.getUsuarios()[usuAtual].getPerfil());
    }
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtConfiSenha;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JLabel usuarioConfiSenha;
    private javax.swing.JLabel usuarioIdUsuario;
    private javax.swing.JLabel usuarioNome;
    private javax.swing.JLabel usuarioPerfil;
    private javax.swing.JLabel usuarioSenha;
    private javax.swing.JLabel usuarioSobrenome;
    // End of variables declaration//GEN-END:variables
}

package formularios;

import classes.Dados;
import javax.swing.JOptionPane;

public class frmTrocarSenha extends javax.swing.JDialog {
    private String senha;
    private String usuario;
    private Dados msDados;
        
    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }
        
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
        
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public frmTrocarSenha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tsSenhaAtual = new javax.swing.JLabel();
        tsNovaSenha = new javax.swing.JLabel();
        txtSenhaAtual = new javax.swing.JPasswordField();
        btnConfirmar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNovaSenha = new javax.swing.JPasswordField();
        tsConfiSenha = new javax.swing.JLabel();
        txtConfiSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Trocar senha");
        setResizable(false);

        tsSenhaAtual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tsSenhaAtual.setForeground(new java.awt.Color(0, 0, 60));
        tsSenhaAtual.setText("Senha Atual:");
        tsSenhaAtual.setName(""); // NOI18N

        tsNovaSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tsNovaSenha.setForeground(new java.awt.Color(0, 0, 60));
        tsNovaSenha.setText("Nova Senha:");
        tsNovaSenha.setName(""); // NOI18N

        txtSenhaAtual.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N

        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(0, 0, 60));
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ball_green.png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 0, 60));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/boll_cancel.png"))); // NOI18N
        btnSair.setText("Cancelar");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 60));
        jLabel6.setName(""); // NOI18N

        txtNovaSenha.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N

        tsConfiSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tsConfiSenha.setForeground(new java.awt.Color(0, 0, 60));
        tsConfiSenha.setText("Confirmar Senha:");
        tsConfiSenha.setName(""); // NOI18N

        txtConfiSenha.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tsConfiSenha)
                            .addComponent(txtConfiSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tsSenhaAtual)
                            .addComponent(tsNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConfirmar)
                        .addGap(30, 30, 30)
                        .addComponent(btnSair)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tsSenhaAtual)
                        .addGap(5, 5, 5)
                        .addComponent(txtSenhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tsNovaSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(tsConfiSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfiSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnSair))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String senhaAtual = new String(txtSenhaAtual.getPassword());
        String novaSenha = new String(txtNovaSenha.getPassword());
        String confiSenha = new String(txtConfiSenha.getPassword());
        
        if(senhaAtual.equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Favor inserir senha atual");
            txtSenhaAtual.requestFocusInWindow();
            return;
        }
        
        if(novaSenha.equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Favor inserir a nova senha");
            txtNovaSenha.requestFocusInWindow();
            return;
        }
        
        if(confiSenha.equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Favor confirmar senha");
            txtConfiSenha.requestFocusInWindow();
            return;
        }
        
        if(!senhaAtual.equals(senha)) {
            JOptionPane.showMessageDialog(rootPane, "Senhas diferente da atual");
            txtSenhaAtual.setText(" ");
            txtSenhaAtual.requestFocusInWindow();
            return;
        }
        
        if(!novaSenha.equals(confiSenha)) {
            JOptionPane.showMessageDialog(rootPane, "Senhas não correspondem");
            txtNovaSenha.setText(" ");
            txtConfiSenha.setText(" ");
            txtNovaSenha.requestFocusInWindow();
            return;
        }
        
        msDados.trocarSenha(usuario, novaSenha);
        JOptionPane.showMessageDialog(rootPane, "Senhas trocada com sucesso");
        this.dispose();
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmTrocarSenha dialog = new frmTrocarSenha(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel tsConfiSenha;
    private javax.swing.JLabel tsNovaSenha;
    private javax.swing.JLabel tsSenhaAtual;
    private javax.swing.JPasswordField txtConfiSenha;
    private javax.swing.JPasswordField txtNovaSenha;
    private javax.swing.JPasswordField txtSenhaAtual;
    // End of variables declaration//GEN-END:variables
}

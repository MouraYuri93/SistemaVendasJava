
package formularios;

import classes.Dados;

public class frmPrincipal extends javax.swing.JFrame {
        private Dados msDados;
    
    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }

    public frmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnDesk = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivosSair = new javax.swing.JMenu();
        mnuArquivosClientes = new javax.swing.JMenuItem();
        mnuArquivosProdutos = new javax.swing.JMenuItem();
        mnuArquivosUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuArquivosTrocarSenha = new javax.swing.JMenuItem();
        mnuArquivosTrocarUsuarios = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnuMovimentacoes = new javax.swing.JMenu();
        mnuMoviNovaVenda = new javax.swing.JMenuItem();
        mnuMoviRelatorio = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        mnuAjudaSobre = new javax.swing.JMenuItem();
        mnuAjudaAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dpnDesk.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout dpnDeskLayout = new javax.swing.GroupLayout(dpnDesk);
        dpnDesk.setLayout(dpnDeskLayout);
        dpnDeskLayout.setHorizontalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
        );
        dpnDeskLayout.setVerticalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );

        mnuArquivosSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/arq48.png"))); // NOI18N
        mnuArquivosSair.setText("Arquivos");

        mnuArquivosClientes.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        mnuArquivosClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cliente48.png"))); // NOI18N
        mnuArquivosClientes.setText("Clientes");
        mnuArquivosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivosClientesActionPerformed(evt);
            }
        });
        mnuArquivosSair.add(mnuArquivosClientes);

        mnuArquivosProdutos.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        mnuArquivosProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/produ48.png"))); // NOI18N
        mnuArquivosProdutos.setText("Produtos");
        mnuArquivosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivosProdutosActionPerformed(evt);
            }
        });
        mnuArquivosSair.add(mnuArquivosProdutos);

        mnuArquivosUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        mnuArquivosUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/usuarios48.png"))); // NOI18N
        mnuArquivosUsuarios.setText("Usuarios");
        mnuArquivosUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivosUsuariosActionPerformed(evt);
            }
        });
        mnuArquivosSair.add(mnuArquivosUsuarios);
        mnuArquivosSair.add(jSeparator1);

        mnuArquivosTrocarSenha.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        mnuArquivosTrocarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/senha48.png"))); // NOI18N
        mnuArquivosTrocarSenha.setText("Trocar senha");
        mnuArquivosSair.add(mnuArquivosTrocarSenha);

        mnuArquivosTrocarUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        mnuArquivosTrocarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tUsuarios48.png"))); // NOI18N
        mnuArquivosTrocarUsuarios.setText("Trocar Usuario");
        mnuArquivosTrocarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivosTrocarUsuariosActionPerformed(evt);
            }
        });
        mnuArquivosSair.add(mnuArquivosTrocarUsuarios);
        mnuArquivosSair.add(jSeparator2);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sair48.png"))); // NOI18N
        jMenuItem6.setText("Sair");
        mnuArquivosSair.add(jMenuItem6);

        jMenuBar1.add(mnuArquivosSair);

        mnuMovimentacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/movi48.png"))); // NOI18N
        mnuMovimentacoes.setText("Movimentações");

        mnuMoviNovaVenda.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        mnuMoviNovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/vendas48.png"))); // NOI18N
        mnuMoviNovaVenda.setText("Nova Venda");
        mnuMoviNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMoviNovaVendaActionPerformed(evt);
            }
        });
        mnuMovimentacoes.add(mnuMoviNovaVenda);

        mnuMoviRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        mnuMoviRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/relat48.png"))); // NOI18N
        mnuMoviRelatorio.setText("Relatorio");
        mnuMovimentacoes.add(mnuMoviRelatorio);

        jMenuBar1.add(mnuMovimentacoes);

        mnuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ajuda48.png"))); // NOI18N
        mnuAjuda.setText("Ajuda");

        mnuAjudaSobre.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        mnuAjudaSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sobre48.png"))); // NOI18N
        mnuAjudaSobre.setText("Sobre");
        mnuAjuda.add(mnuAjudaSobre);

        mnuAjudaAjuda.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        mnuAjudaAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ajuda-48.png"))); // NOI18N
        mnuAjudaAjuda.setText("Ajuda");
        mnuAjuda.add(mnuAjudaAjuda);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArquivosTrocarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivosTrocarUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuArquivosTrocarUsuariosActionPerformed

    private void mnuArquivosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivosClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuArquivosClientesActionPerformed

    private void mnuMoviNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMoviNovaVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuMoviNovaVendaActionPerformed

    private void mnuArquivosUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivosUsuariosActionPerformed
        frmUsuarios msUsuarios = new frmUsuarios();
        msUsuarios.setDados(msDados);
        dpnDesk.add(msUsuarios);
        msUsuarios.show();
    }//GEN-LAST:event_mnuArquivosUsuariosActionPerformed

    private void mnuArquivosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivosProdutosActionPerformed
        frmProdutos mProdutos = new frmProdutos();
        mProdutos.setDados(msDados);
        dpnDesk.add(mProdutos);
        mProdutos.show();
    }//GEN-LAST:event_mnuArquivosProdutosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnDesk;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenuItem mnuAjudaAjuda;
    private javax.swing.JMenuItem mnuAjudaSobre;
    private javax.swing.JMenuItem mnuArquivosClientes;
    private javax.swing.JMenuItem mnuArquivosProdutos;
    private javax.swing.JMenu mnuArquivosSair;
    private javax.swing.JMenuItem mnuArquivosTrocarSenha;
    private javax.swing.JMenuItem mnuArquivosTrocarUsuarios;
    private javax.swing.JMenuItem mnuArquivosUsuarios;
    private javax.swing.JMenuItem mnuMoviNovaVenda;
    private javax.swing.JMenuItem mnuMoviRelatorio;
    private javax.swing.JMenu mnuMovimentacoes;
    // End of variables declaration//GEN-END:variables
}

package formularios;

import classes.Dados;
import static formularios.frmClientes.formatDate;
import javax.swing.table.DefaultTableModel;

public class frmPesqCliente extends javax.swing.JDialog {

    private Dados msDados;
    private DefaultTableModel mTabela;
    
    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }
    
    private void preencherTabela() {
        String titulos[] = {"ID Cliente", "Tipo Identificação", "Nome"};
        String registro[] = new String[3];
        mTabela = new DefaultTableModel(null, titulos);
        if(txtPesqCli.getText().equals("")) {
           for(int i = 0; i < msDados.numeroClientes(); i++) {
               registro[0] = msDados.getClientes()[i].getIdCliente();
               registro[1] = msDados.getClientes()[i].getNome();
               registro[2] = tipoID(msDados.getClientes()[i].getIdTipo());
               mTabela.addRow(registro);
               
               tblTabela.setModel(mTabela);
               return;
               }
           }
        
        if(radioId.isSelected()){
            for(int i = 0; i < msDados.numeroClientes(); i++) {
                if(msDados.getClientes()[i].getIdCliente().startsWith(txtPesqCli.getText())){
                    registro[0] = msDados.getClientes()[i].getIdCliente();
                    registro[1] = msDados.getClientes()[i].getNome();
                    registro[2] = tipoID(msDados.getClientes()[i].getIdTipo());
                    mTabela.addRow(registro);
                    }
                }
            tblTabela.setModel(mTabela);
            return;
        }
        
        if(radioNome.isSelected()){
            for(int i = 0; i < msDados.numeroClientes(); i++) {
                if(msDados.getClientes()[i].getNome().startsWith(txtPesqCli.getText())){
                    registro[0] = msDados.getClientes()[i].getIdCliente();
                    registro[1] = msDados.getClientes()[i].getNome();
                    registro[2] = tipoID(msDados.getClientes()[i].getIdTipo());
                    mTabela.addRow(registro);
                    }
                }
            tblTabela.setModel(mTabela);
            return;
        }
        
        if(radioIden.isSelected()){
            for(int i = 0; i < msDados.numeroClientes(); i++) {
                if(String.valueOf(msDados.getClientes()[i].getIdTipo()).startsWith(txtPesqCli.getText())){
                    registro[0] = msDados.getClientes()[i].getIdCliente();
                    registro[1] = msDados.getClientes()[i].getNome();
                    registro[2] = tipoID(msDados.getClientes()[i].getIdTipo());
                    mTabela.addRow(registro);
                    }
                }
            tblTabela.setModel(mTabela);
            return;
        }
                
    }
    
    private String tipoID(int id) {
        switch(id) {
            case 1: return "CNH";
            case 2: return "CPF";
            case 3: return "Passaporte";
            case 4: return "RG";
            default : return "Não definido";
        }
    }
    
    public frmPesqCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        bgPesq.add(radioId);
        bgPesq.add(radioNome);
        bgPesq.add(radioIden);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPesq = new javax.swing.ButtonGroup();
        radioId = new javax.swing.JRadioButton();
        radioNome = new javax.swing.JRadioButton();
        radioIden = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        txtPesqCli = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Cliente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        radioId.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        radioId.setText("ID Cliente");
        radioId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioIdActionPerformed(evt);
            }
        });

        radioNome.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        radioNome.setText("Nome Cliente");
        radioNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNomeActionPerformed(evt);
            }
        });

        radioIden.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        radioIden.setText("Identificação");
        radioIden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioIdenActionPerformed(evt);
            }
        });

        tblTabela.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
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
        jScrollPane1.setViewportView(tblTabela);

        txtPesqCli.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        txtPesqCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqCliActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancelar48.png"))); // NOI18N
        jButton1.setToolTipText("Cancelar");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pesquisar48.png"))); // NOI18N
        jButton2.setToolTipText("Pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(49, 49, 49)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPesqCli, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(radioId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(radioNome)
                                .addGap(44, 44, 44)
                                .addComponent(radioIden))
                            .addComponent(jScrollPane1))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioId)
                    .addComponent(radioNome)
                    .addComponent(radioIden))
                .addGap(18, 18, 18)
                .addComponent(txtPesqCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        preencherTabela();
        txtPesqCli.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void radioIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioIdActionPerformed
        txtPesqCli.setText("");
        txtPesqCli.requestFocusInWindow();
        preencherTabela();
    }//GEN-LAST:event_radioIdActionPerformed

    private void radioNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNomeActionPerformed
        txtPesqCli.setText("");
        txtPesqCli.requestFocusInWindow();
        preencherTabela();
    }//GEN-LAST:event_radioNomeActionPerformed

    private void radioIdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioIdenActionPerformed
        txtPesqCli.setText("");
        txtPesqCli.requestFocusInWindow();
        preencherTabela();
    }//GEN-LAST:event_radioIdenActionPerformed

    private void txtPesqCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqCliActionPerformed
        preencherTabela();
    }//GEN-LAST:event_txtPesqCliActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPesqCliente dialog = new frmPesqCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup bgPesq;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioId;
    private javax.swing.JRadioButton radioIden;
    private javax.swing.JRadioButton radioNome;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtPesqCli;
    // End of variables declaration//GEN-END:variables
   
}

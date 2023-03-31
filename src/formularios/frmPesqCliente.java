package formularios;

import classes.Dados;
import classes.Utilidades;
import javax.swing.table.DefaultTableModel;

public class frmPesqCliente extends javax.swing.JDialog {

    private Dados msDados;
    private DefaultTableModel mTabela;
    private String resposta="";
    
    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }
    
    public String getResposta() {
        return resposta;
    }
    
    private void preencherTabela() {
        // Vetor com os títulos das colunas da tabela
        String titulos[] = {"ID Cliente", "Tipo Identificação", "Nome"};
        // Vetor que vai armazenar os dados de cada registro da tabela
        String registro[] = new String[3];
        // Criação do modelo de tabela com os títulos das colunas
        mTabela = new DefaultTableModel(null, titulos);
        // Verifica se o campo de pesquisa está vazio
        if(txtPesqCli.getText().equals("")) {
           // Se estiver, adiciona todos os registros da lista na tabela
           for(int i = 0; i < msDados.numeroClientes(); i++) {
               registro[0] = msDados.getClientes()[i].getIdCliente();
               registro[1] = tipoID(msDados.getClientes()[i].getIdTipo());
               registro[2] = msDados.getClientes()[i].getNome();
               mTabela.addRow(registro);
           }
           // Define o modelo da tabela
           tblTabela.setModel(mTabela);
           return;
        }

        // Verifica se o radioId está selecionado
        if(radioId.isSelected()){
            // Se estiver, adiciona os registros cujo ID começa com o texto digitado no campo de pesquisa
            for(int i = 0; i < msDados.numeroClientes(); i++) {
                if(msDados.getClientes()[i].getIdCliente().startsWith(txtPesqCli.getText())){
                    registro[0] = msDados.getClientes()[i].getIdCliente();
                    registro[1] = msDados.getClientes()[i].getNome();
                    mTabela.addRow(registro);
                }
            }
            // Define o modelo da tabela
            tblTabela.setModel(mTabela);
            return;
        }

        // Verifica se o radioNome está selecionado
        if(radioNome.isSelected()){
            // Se estiver, adiciona os registros cujo Nome começa com o texto digitado no campo de pesquisa
            for(int i = 0; i < msDados.numeroClientes(); i++) {
                if(msDados.getClientes()[i].getNome().startsWith(txtPesqCli.getText())){
                    registro[0] = msDados.getClientes()[i].getIdCliente();
                    registro[1] = msDados.getClientes()[i].getNome();
                    mTabela.addRow(registro);
                }
            }
            // Define o modelo da tabela
            tblTabela.setModel(mTabela);
            return;
        }

        // Verifica se o radioIden está selecionado
        /*if(radioIden.isSelected()){
            // Se estiver, adiciona os registros cujo Tipo Identificação começa com o texto digitado no campo de pesquisa
            for(int i = 0; i < msDados.numeroClientes(); i++) {
                if(String.valueOf(msDados.getClientes()[i].getIdTipo()).toLowerCase().contains(txtPesqCli.getText().toLowerCase())){
                    registro[0] = msDados.getClientes()[i].getIdCliente();
                    registro[1] = msDados.getClientes()[i].getNome();
                    mTabela.addRow(registro);
                    }
                }
            // Define o modelo da tabela
            tblTabela.setModel(mTabela);
            return;
        }   */       
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPesq = new javax.swing.ButtonGroup();
        radioId = new javax.swing.JRadioButton();
        radioNome = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        txtPesqCli = new javax.swing.JTextField();
        btnPesq = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

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

        btnPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pesquisar48.png"))); // NOI18N
        btnPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sair-48.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesq)
                        .addGap(40, 40, 40)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPesqCli, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(radioId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioNome))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioId)
                    .addComponent(radioNome))
                .addGap(18, 18, 18)
                .addComponent(txtPesqCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesq)
                    .addComponent(btnSair))
                .addGap(22, 22, 22))
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

    private void txtPesqCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqCliActionPerformed
        preencherTabela();
    }//GEN-LAST:event_txtPesqCliActionPerformed

    private void btnPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqActionPerformed
        int num = tblTabela.getRowCount();
        if(num == 0) {
            resposta="";
            dispose();
            return;
        }
        for(int i = 0; i < num; i++) {
            if(tblTabela.isRowSelected(i)) {
                resposta = Utilidades.objectToString(tblTabela.getValueAt(i, 0));
                dispose();
                return;              
            }
        }
        resposta = Utilidades.objectToString(tblTabela.getValueAt(0, 0));
        dispose();
    }//GEN-LAST:event_btnPesqActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        resposta="";
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
    private javax.swing.JButton btnPesq;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioId;
    private javax.swing.JRadioButton radioNome;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtPesqCli;
    // End of variables declaration//GEN-END:variables
   
}

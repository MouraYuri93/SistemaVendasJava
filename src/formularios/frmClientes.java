package formularios;

import classes.Dados;
import classes.Cliente;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.text.MaskFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmClientes extends javax.swing.JInternalFrame {
        private Dados msDados;
        private int cliAtual = 0;
        private boolean novo = false;
        private DefaultTableModel mTabela;

            public void setDados(Dados msDados) {
                this.msDados = msDados;
            }
    
    public frmClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clienteNome1 = new javax.swing.JLabel();
        usuarioIdCliente = new javax.swing.JLabel();
        clienteCidade = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        clienteSobrenome = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        clienteNome = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox<>();
        clienteIdentificacao = new javax.swing.JLabel();
        cmbIdentificacao = new javax.swing.JComboBox<>();
        clienteTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        clienteDataNascimento = new javax.swing.JLabel();
        clienteEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        DataNascimento = new com.toedter.calendar.JDateChooser();

        clienteNome1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clienteNome1.setText("Nome:");

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Clientes");
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

        usuarioIdCliente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        usuarioIdCliente.setText("ID Cliente:");

        clienteCidade.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clienteCidade.setText("Cidade:");

        txtIdCliente.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        txtIdCliente.setEnabled(false);

        txtNome.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        txtNome.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 60));
        jLabel3.setName(""); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 60));
        jLabel4.setName(""); // NOI18N

        btnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back48.png"))); // NOI18N
        btnPrimeiro.setToolTipText("Primeiro");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next48.png"))); // NOI18N
        btnUltimo.setToolTipText("Ultimo");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/adicionar48.png"))); // NOI18N
        btnAdicionar.setToolTipText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/editar48.png"))); // NOI18N
        btnEditar.setToolTipText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/salvar48.png"))); // NOI18N
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.setEnabled(false);
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

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancelar48.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/retrocesso-48.png"))); // NOI18N
        btnAnterior.setToolTipText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

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

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pesquisaCli48.png"))); // NOI18N
        btnPesquisar.setToolTipText("Pesquisar Cliente");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        clienteSobrenome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clienteSobrenome.setText("Sobrenome:");

        txtSobrenome.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        txtSobrenome.setEnabled(false);

        clienteNome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clienteNome.setText("Nome:");

        cmbCidade.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        cmbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione sua cidade", "Salvador", "Itaporanga D'Ajuda", "Aracaju" }));
        cmbCidade.setEnabled(false);

        clienteIdentificacao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clienteIdentificacao.setText("Identificação:");

        cmbIdentificacao.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        cmbIdentificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a sua ID", "CNH", "CPF", "Passaporte", "RG" }));
        cmbIdentificacao.setEnabled(false);

        clienteTelefone.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clienteTelefone.setText("Telefone:");

        txtTelefone.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        txtTelefone.setEnabled(false);

        clienteDataNascimento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clienteDataNascimento.setText("Data de Nascimento:");

        clienteEndereco.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clienteEndereco.setText("Endereço:");

        txtEndereco.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        txtEndereco.setEnabled(false);

        DataNascimento.setEnabled(false);
        DataNascimento.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuarioIdCliente)
                            .addComponent(clienteEndereco)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(clienteTelefone)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clienteCidade)
                                    .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(125, 125, 125)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clienteDataNascimento)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(clienteIdentificacao)
                                            .addComponent(cmbIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clienteNome))
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clienteSobrenome)
                                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(182, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 455, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 455, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 455, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 455, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(usuarioIdCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clienteSobrenome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(clienteNome)
                            .addGap(41, 41, 41))))
                .addGap(28, 28, 28)
                .addComponent(clienteEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clienteDataNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clienteTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteCidade)
                    .addComponent(clienteIdentificacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnProximo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 405, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 406, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 405, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 406, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {
        // Verifica se o campo de ID do cliente foi preenchido
        if(txtIdCliente.getText().equals(" ")) {            
            JOptionPane.showMessageDialog(rootPane, "Favor inserir um número de ID do cliente");
            txtIdCliente.requestFocusInWindow(); // Coloca o foco no campo de ID do cliente
            return; // Sai do método
        }

        // Verifica se o campo de ID de identificação não foi selecionado
        if(cmbIdentificacao.getSelectedIndex() == 0) {            
            JOptionPane.showMessageDialog(rootPane,"Favor selecionar ID de identificação");
            cmbIdentificacao.requestFocusInWindow(); // Coloca o foco no campo de ID de identificação
            return; // Sai do método
        }
        
        // Verifica se o campo de cidade não foi selecionado
        if(cmbCidade.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane,"Favor selecionar uma cidade");
            cmbCidade.requestFocusInWindow(); // Coloca o foco no campo de cidade
            return; // Sai do método
        }

        // Verifica se o campo de nome está vazio
        if(txtNome.getText().equals(" ")) {
            JOptionPane.showMessageDialog(rootPane,"Favor inserir um nome");
            txtNome.requestFocusInWindow(); // Coloca o foco no campo de nome
            return; // Sai do método
        }

        // Verifica se o campo de sobrenome está vazio
        if(txtSobrenome.getText().equals(" ")) {            
            JOptionPane.showMessageDialog(rootPane,"Favor inserir um sobrenome");
            txtSobrenome.requestFocusInWindow(); // Coloca o foco no campo de sobrenome
            return; // Sai do método
        }
        
        // Verifica se o campo de endereço está vazio
        if(txtEndereco.getText().equals(" ")) {            
            JOptionPane.showMessageDialog(rootPane,"Favor inserir um Endereço");
            txtEndereco.requestFocusInWindow(); // Coloca o foco no campo de endereço
            return; // Sai do método
        }
        
        String telefone = txtTelefone.getText();
        telefone = telefone.replaceAll("[^0-9]", ""); // remove todos os caracteres que não são números

        try {
            MaskFormatter formatter = new MaskFormatter("(##)#####-####");
            formatter.setValueContainsLiteralCharacters(false); // permite que o valor seja formatado
            String telefoneFormatado = formatter.valueToString(telefone); // formata o número de telefone

            // Salva o número de telefone formatado no campo txtTelefone
            txtTelefone.setText(telefoneFormatado);

            // Salva o número de telefone formatado no arquivo cliente.txt
            PrintWriter writer = new PrintWriter(new FileWriter("Data/clientes.txt", true));
            writer.println(telefoneFormatado);
            writer.close();
        } catch (ParseException ex) {
            // Trata o erro de formatação do número de telefone
            JOptionPane.showMessageDialog(null, "Erro ao formatar o número de telefone: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(frmClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        // Verifica se a data de nascimento é válida (não pode ser no futuro)
        if(DataNascimento.getDate().after(new Date())) {
           JOptionPane.showMessageDialog(rootPane,"Favor inserir uma data de nascimento");
            DataNascimento.requestFocusInWindow();
            return; 
        }
        
        // Verificar se o cliente já existe na lista de clientes
        int pos = msDados.posicaoCliente(txtIdCliente.getText());
        if(novo) {
            if(pos != -1) {
                JOptionPane.showMessageDialog(rootPane,"Cliente já existe");
                txtIdCliente.requestFocusInWindow();
                return;
            }
        } else {
            if(pos == -1) {
                JOptionPane.showMessageDialog(rootPane,"Cliente disponível");
                txtIdCliente.requestFocusInWindow();
                return;
            }
        }
        
        // Criar um objeto Cliente com as informações inseridas no formulário
        Cliente mCliente = new Cliente(
                txtIdCliente.getText(), 
                cmbIdentificacao.getSelectedIndex(), 
                txtNome.getText(), 
                txtSobrenome.getText(), 
                txtEndereco.getText(), 
                txtTelefone.getText(), 
                cmbCidade.getSelectedIndex(), 
                DataNascimento.getDate());
        String msg;
        // Adicionar ou editar o cliente na lista de clientes, dependendo do botão pressionado
        if(novo) {
            msg = msDados.adicionarCliente(mCliente);
        }else {
            msg = msDados.editarCliente(mCliente, pos);
        }
        // Exibir uma mensagem com o resultado da operação
        JOptionPane.showMessageDialog(rootPane, msg);
        
        // Habilitar os botões necessários e desabilitar os campos do formulário
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
        // Desabilitar os campos do formulário
        txtIdCliente.setEnabled(false);
        txtNome.setEnabled(false);
        txtIdCliente.setEnabled(false);
        cmbIdentificacao.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        cmbCidade.setEnabled(false);
        DataNascimento.setEnabled(false);
        // Atualizar a tabela de clientes
        preencherTabela();
    }

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {
        int resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja deletar esse cliente?");
        if(resposta != 0) {
            return;
        }
        String msg;
        msg = msDados.deletarCliente(cliAtual);
        JOptionPane.showMessageDialog(rootPane, msg);
        cliAtual = 0;
        mostrarRegistro();
        preencherTabela();
    }

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {
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
        txtIdCliente.setEnabled(true);
        cmbIdentificacao.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbCidade.setEnabled(true);
        DataNascimento.setEnabled(true);
                
        //limpar caixa de textos
        txtIdCliente.setText("");
        cmbIdentificacao.setSelectedIndex(0);
        txtNome.setText("");
        txtSobrenome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        cmbCidade.setSelectedIndex(0);
        DataNascimento.setDate(new Date());
        
        
        novo = true;
        txtIdCliente.requestFocus();
        
        
    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {
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
        txtNome.setEnabled(true);
        txtIdCliente.setEnabled(true);
        cmbIdentificacao.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbCidade.setEnabled(true);
        DataNascimento.setEnabled(true);
        
        novo = false;
        
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {
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
        txtIdCliente.setEnabled(false);
        txtNome.setEnabled(false);
        txtIdCliente.setEnabled(false);
        cmbIdentificacao.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        cmbCidade.setEnabled(false);
        DataNascimento.setEnabled(false);
    }

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {
       cliAtual = 0;
       mostrarRegistro();
    }

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {
        cliAtual = msDados.numeroClientes() -1;
        mostrarRegistro();
    }

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
      mostrarRegistro();
      preencherTabela();
      
    }

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {
        cliAtual++;
        if(  cliAtual == msDados.numeroClientes()) {
             cliAtual = 0;
        }
        mostrarRegistro();
    }

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {
        cliAtual --;
       if ( cliAtual == -1) {
            cliAtual = msDados.numeroClientes() -1;
       }
       mostrarRegistro();
    }

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {
        String cliente = JOptionPane.showInputDialog("Favor inserir codigo do Cliente");
        if(cliente.equals("")) {
            return;
        }
        int pos = msDados.posicaoCliente(cliente);
        if(pos == -1) {
            JOptionPane.showMessageDialog(rootPane,"Este cliente não existe");
            return;
        }
         cliAtual = pos;
        mostrarRegistro();
    }

    private void mostrarRegistro() {
        txtIdCliente.setText(msDados.getClientes()[cliAtual].getIdCliente());
        cmbIdentificacao.setSelectedIndex(msDados.getClientes()[cliAtual].getIdTipo());
        txtNome.setText(msDados.getClientes()[cliAtual].getNome());
        txtSobrenome.setText(msDados.getClientes()[cliAtual].getSobrenome());
        txtEndereco.setText(msDados.getClientes()[cliAtual].getEndereço());
        txtTelefone.setText(msDados.getClientes()[cliAtual].getTelefone());
        cmbCidade.setSelectedIndex(msDados.getClientes()[cliAtual].getIdCidade());
        DataNascimento.setDate(msDados.getClientes()[cliAtual].getDataNascimento());
        
    }
    
    private void preencherTabela() {
        String titulos[] = {
            "ID Cliente",
            "Tipo Identificação",
            "Nome", 
            "Sobrenome",
            "Endereço",
            "Telefone",
            "CIdade", 
            "Data Nascimento"
        };
        String registro[] = new String[8];
        mTabela = new DefaultTableModel(null, titulos);
        for (int i = 0; i < msDados.numeroClientes(); i++) {
            registro[0] = msDados.getClientes()[i].getIdCliente();
            registro[1] = tipoID(msDados.getClientes()[i].getIdTipo());
            registro[2] = msDados.getClientes()[i].getNome();
            registro[3] = msDados.getClientes()[i].getSobrenome();
            registro[4] = msDados.getClientes()[i].getEndereço();
            registro[5] = msDados.getClientes()[i].getTelefone();
            registro[6] = cidade(msDados.getClientes()[i].getIdCidade());

            if (msDados.getClientes()[i].getDataNascimento() != null) {
                registro[7] = formatDate(msDados.getClientes()[i].getDataNascimento());
            } else {
                registro[7] = "";
            }

            mTabela.addRow(registro);
        }
        tblTabela.setModel(mTabela);
    }
    
    public static Date stringtoDate(String newData) {
    SimpleDateFormat formatotexto = new SimpleDateFormat("dd/MM/yyyy");
    Date x = null;
    try {
        x = formatotexto.parse(newData);
    } catch (ParseException ex) {   
    }
    return x;
}

    public static String formatDate(Date newData) {
        SimpleDateFormat formatotexto = new SimpleDateFormat("dd/MM/yyyy");
        return formatotexto.format(newData);
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
    
    private String cidade(int id) {
        switch(id) {
            case 1: return "Salvador";
            case 2: return "Itaporanga D'Ajuda";
            case 3: return "Aracaju";
            default : return "Não definido";
        }
    }
    

    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DataNascimento;
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
    private javax.swing.JLabel clienteCidade;
    private javax.swing.JLabel clienteDataNascimento;
    private javax.swing.JLabel clienteEndereco;
    private javax.swing.JLabel clienteIdentificacao;
    private javax.swing.JLabel clienteNome;
    private javax.swing.JLabel clienteNome1;
    private javax.swing.JLabel clienteSobrenome;
    private javax.swing.JLabel clienteTelefone;
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JComboBox<String> cmbIdentificacao;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JLabel usuarioIdCliente;
    // End of variables declaration//GEN-END:variables

    
}

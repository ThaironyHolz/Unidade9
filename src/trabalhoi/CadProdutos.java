/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Cria o cadastro de produtos
 * @author Christian
 */
public class CadProdutos extends javax.swing.JDialog {

    /**
     * Creates new form CadPessoas
     * 
     * cria o Form do cadastro
     */
    public CadProdutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.setTitle("Cadastro de Produtos");
        BtnCancelar.doClick();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Referencia = new javax.swing.JTextField();
        Unidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NomeFornecedor = new javax.swing.JTextField();
        CodFornecedor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        QtdEstoque = new javax.swing.JTextField();
        VlrVenda = new javax.swing.JTextField();
        VlrCusto = new javax.swing.JTextField();
        NCM = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        BtnCancelar = new javax.swing.JButton();
        BtnConsultar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        BtnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Codigo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 10, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        ID.setMaximumSize(new java.awt.Dimension(100, 20));
        ID.setMinimumSize(new java.awt.Dimension(80, 20));
        ID.setPreferredSize(new java.awt.Dimension(80, 20));
        ID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLostGen(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 10, 0);
        getContentPane().add(ID, gridBagConstraints);

        jLabel2.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 10, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        Nome.setMaximumSize(new java.awt.Dimension(300, 20));
        Nome.setMinimumSize(new java.awt.Dimension(300, 20));
        Nome.setPreferredSize(new java.awt.Dimension(300, 20));
        Nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLostGen(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        getContentPane().add(Nome, gridBagConstraints);

        jLabel3.setText("Referencia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 10, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("Unidade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 10, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        Referencia.setMaximumSize(new java.awt.Dimension(100, 20));
        Referencia.setMinimumSize(new java.awt.Dimension(100, 20));
        Referencia.setPreferredSize(new java.awt.Dimension(100, 20));
        Referencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLostGen(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        getContentPane().add(Referencia, gridBagConstraints);

        Unidade.setMaximumSize(new java.awt.Dimension(100, 20));
        Unidade.setMinimumSize(new java.awt.Dimension(100, 20));
        Unidade.setPreferredSize(new java.awt.Dimension(100, 20));
        Unidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLostGen(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        getContentPane().add(Unidade, gridBagConstraints);

        jLabel7.setText("Fornecedor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 10, 0);
        getContentPane().add(jLabel7, gridBagConstraints);

        jLabel8.setText("Qtd. Estoque");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 10, 0);
        getContentPane().add(jLabel8, gridBagConstraints);

        jLabel9.setText("NCM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 10, 0);
        getContentPane().add(jLabel9, gridBagConstraints);

        NomeFornecedor.setEditable(false);
        NomeFornecedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLostGen(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        getContentPane().add(NomeFornecedor, gridBagConstraints);

        CodFornecedor.setMaximumSize(new java.awt.Dimension(100, 20));
        CodFornecedor.setMinimumSize(new java.awt.Dimension(80, 20));
        CodFornecedor.setPreferredSize(new java.awt.Dimension(80, 20));
        CodFornecedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLostGen(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        getContentPane().add(CodFornecedor, gridBagConstraints);

        jLabel10.setText("Vlr. Venda");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 10, 0);
        getContentPane().add(jLabel10, gridBagConstraints);

        jLabel11.setText("Vlr. Custo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 10, 0);
        getContentPane().add(jLabel11, gridBagConstraints);

        QtdEstoque.setMaximumSize(new java.awt.Dimension(100, 20));
        QtdEstoque.setMinimumSize(new java.awt.Dimension(80, 20));
        QtdEstoque.setPreferredSize(new java.awt.Dimension(80, 20));
        QtdEstoque.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLostGen(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        getContentPane().add(QtdEstoque, gridBagConstraints);

        VlrVenda.setMaximumSize(new java.awt.Dimension(150, 20));
        VlrVenda.setMinimumSize(new java.awt.Dimension(150, 20));
        VlrVenda.setPreferredSize(new java.awt.Dimension(150, 20));
        VlrVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLostGen(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        getContentPane().add(VlrVenda, gridBagConstraints);

        VlrCusto.setMaximumSize(new java.awt.Dimension(150, 20));
        VlrCusto.setMinimumSize(new java.awt.Dimension(150, 20));
        VlrCusto.setPreferredSize(new java.awt.Dimension(150, 20));
        VlrCusto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLostGen(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        getContentPane().add(VlrCusto, gridBagConstraints);

        NCM.setMaximumSize(new java.awt.Dimension(100, 20));
        NCM.setMinimumSize(new java.awt.Dimension(80, 20));
        NCM.setPreferredSize(new java.awt.Dimension(80, 20));
        NCM.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLostGen(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        getContentPane().add(NCM, gridBagConstraints);

        BtnCancelar.setText("ESC Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAction(evt);
            }
        });

        BtnConsultar.setText("F02 Consultar");
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAction(evt);
            }
        });

        BtnExcluir.setText("F09 Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAction(evt);
            }
        });

        BtnOK.setText("F10 OK");
        BtnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAction(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(BtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(BtnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 15, 15);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo generico de todos cliques em botões
     * Executa as ações devidas de acordo com o botão clicado.
     *
     * F10 grava ou altera.
     * F02 abre uma consulta rapida para seleção de Produtos e Fornecedores (clientes) existentes.
     * F09 exclui
     * Esc Cancela
     * 
     * @param evt evento a ser executado
     */
    private void BtnAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAction
        if (evt.getSource() == BtnCancelar)
        {
            ID.setText("0");
            Nome.setText("");
            Referencia.setText("");
            Unidade.setText("");
            CodFornecedor.setText("");
            QtdEstoque.setText("0");
            VlrVenda.setText("0");
            VlrCusto.setText("0");
            CodFornecedor.setText("0");
        }
        if (evt.getSource() == BtnConsultar)
        {
            //aaa
        }
        if (evt.getSource() == BtnExcluir)
        {
            if (!ID.getText().isEmpty())
            {
                try {
                    ConexaoSQL.ExecSQL("delete from Produtos where Prd_ID=" + ID.getText());
                } catch (SQLException ex) {
                    Logger.getLogger(CadProdutos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            BtnCancelar.doClick();
        }
        if (evt.getSource() == BtnOK)
        {
            if (ID.getText().isEmpty() || 
                Nome.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Campos obrigatórios não preenchidos \n  Código e Nome");
            }
                   
            try {
                if (ID.getText().isEmpty())
                {    
                    ConexaoSQL.ExecSQL("Insert into Produtos " +
                            "(Prd_nome, Prd_referencia, Prd_unidade, Prd_Id_Pessoa, Prd_NCM, " + 
                            "Prd_Estoque, Prd_Venda, Prd_Custo) values (" +
                            Nome.getText() + ", " );
                }
                else
                {
                    ConexaoSQL.ExecSQL("Update");
                }
                    
            } catch (SQLException ex) {
                Logger.getLogger(CadProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }

            BtnCancelar.doClick();
        }
        
    }//GEN-LAST:event_BtnAction

    /**
     * Metodo genérico ligado a todos campos com perda de foco.
     * Executa as ações devidas de acordo com o campo que perdeu o foco.
     *
     * No campo da ID, verifica a existencia da mesma, e carrega os dados.
     * Em campos Text, executa um ajuste de caracteres, deixando as iniciais maiusculas
     * 
     * @param evt evento a ser executado
     */
    private void FocusLostGen(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FocusLostGen
        if (evt.getComponent() == ID)
        {
            try 
            {
                ResultSet result = ConexaoSQL.RetornoSQL("Select * from Produtos where Prd_ID=" + ID.getText());

                Nome.setText(result.getString("Prd_Nome"));
                Referencia.setText(result.getString("Prd_referencia"));
                Unidade.setText(result.getString("Prd_unidade"));
                NCM.setText(result.getString("Prd_ncm"));
                CodFornecedor.setText(result.getString("Prd_id_Pessoa"));
                QtdEstoque.setText(result.getString("Prd_Estoque"));
                VlrVenda.setText(result.getString("Prd_Venda"));
                VlrCusto.setText(result.getString("Prd_Custo"));
            } catch (SQLException ex) {
                Logger.getLogger(CadProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (Nome.getText().isEmpty()) 
            {
                ID.setText("");
            }
        }
        if (evt.getComponent() == Nome)
        {
            Nome.setText(Utils.AjustaTexto(Nome.getText()));
        }
        if (evt.getComponent() == Referencia)
        {
            Referencia.setText(Utils.AjustaTexto(Referencia.getText()));
        }
        if (evt.getComponent() == Unidade)
        {
            Unidade.setText(Utils.AjustaTexto(Unidade.getText()));
        }
    }//GEN-LAST:event_FocusLostGen

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadProdutos dialog = new CadProdutos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnOK;
    private javax.swing.JTextField CodFornecedor;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField NCM;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField NomeFornecedor;
    private javax.swing.JTextField QtdEstoque;
    private javax.swing.JTextField Referencia;
    private javax.swing.JTextField Unidade;
    private javax.swing.JTextField VlrCusto;
    private javax.swing.JTextField VlrVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

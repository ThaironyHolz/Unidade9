/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoi;

import Manager.DocumentoManager;
import Manager.PessoaManager;
import Model.Documento;
import Model.Pessoa;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 * Cria o cadastro de produtos
 *
 * @author Christian
 */
public class Documentos extends javax.swing.JDialog {

    Documento Doc_atual = new Documento();

    /**
     * Creates new form CadPessoas
     *
     * cria o Form do cadastro
     */
    public Documentos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.setTitle("Lancamento de Documentos");
        BtnCancelar.doClick();

        ArrayList<Pessoa> pessoas = PessoaManager.getInstance().selecionar("");
        Pessoa.setModel(new DefaultComboBoxModel<>(pessoas.toArray(new Pessoa[pessoas.size()])));
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
        Pagamento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Documento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        BtnCancelar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        BtnOK = new javax.swing.JButton();
        Pessoa = new javax.swing.JComboBox<>();
        Emissao = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();

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

        jLabel2.setText("Forma Pag");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 10, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        Pagamento.setMaximumSize(new java.awt.Dimension(300, 20));
        Pagamento.setMinimumSize(new java.awt.Dimension(300, 20));
        Pagamento.setPreferredSize(new java.awt.Dimension(300, 20));
        Pagamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLostGen(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        getContentPane().add(Pagamento, gridBagConstraints);

        jLabel3.setText("Documento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 10, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        Documento.setMaximumSize(new java.awt.Dimension(100, 20));
        Documento.setMinimumSize(new java.awt.Dimension(100, 20));
        Documento.setPreferredSize(new java.awt.Dimension(100, 20));
        Documento.addFocusListener(new java.awt.event.FocusAdapter() {
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
        getContentPane().add(Documento, gridBagConstraints);

        jLabel7.setText("Cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 10, 0);
        getContentPane().add(jLabel7, gridBagConstraints);

        jLabel8.setText("Total");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 10, 0);
        getContentPane().add(jLabel8, gridBagConstraints);

        Total.setMaximumSize(new java.awt.Dimension(100, 20));
        Total.setMinimumSize(new java.awt.Dimension(80, 20));
        Total.setPreferredSize(new java.awt.Dimension(80, 20));
        Total.addFocusListener(new java.awt.event.FocusAdapter() {
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
        getContentPane().add(Total, gridBagConstraints);

        BtnCancelar.setText("ESC Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
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
            .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(BtnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 15, 15);
        getContentPane().add(jPanel1, gridBagConstraints);

        Pessoa.setName(""); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        getContentPane().add(Pessoa, gridBagConstraints);

        Emissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        Emissao.setMaximumSize(new java.awt.Dimension(100, 20));
        Emissao.setMinimumSize(new java.awt.Dimension(80, 20));
        Emissao.setPreferredSize(new java.awt.Dimension(80, 20));
        Emissao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmissaoFocusLostGen(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 15, 0);
        getContentPane().add(Emissao, gridBagConstraints);

        jLabel13.setText("Emissao");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 15, 0);
        getContentPane().add(jLabel13, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo generico de todos cliques em botões Executa as ações devidas de
     * acordo com o botão clicado.
     *
     * F10 grava ou altera. F02 abre uma consulta rapida para seleção de
     * Documentos e Fornecedores (clientes) existentes. F09 exclui Esc Cancela
     *
     * @param evt evento a ser executado
     */
    private void BtnAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAction
        if (evt.getSource() == BtnCancelar) {
            ID.setText("0");
            Documento.setText("");
            Pagamento.setText("");
            Total.setText("0");
            Emissao.setText("");
        }
        if (evt.getSource() == BtnExcluir) {
            if (!ID.getText().isEmpty()) {
                DocumentoManager.getInstance().delete(Doc_atual);
            }

            BtnCancelar.doClick();
        }
        if (evt.getSource() == BtnOK) {
            if (Pagamento.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Campos obrigatórios não preenchidos: Nome");
            }

            try {
                DecimalFormat format = new DecimalFormat("##,#0.00");
                format.setParseBigDecimal(true);

                Doc_atual.setDocumento(Documento.getText());
                Doc_atual.setMeio(Pagamento.getText());
                Doc_atual.setTotal((BigDecimal) format.parseObject(Total.getText()));

                if (!Emissao.getText().startsWith("/")) {
                    Doc_atual.setEmissao(Date.valueOf(Emissao.getText()));
                }

                Doc_atual.setPessoaId(((Pessoa) Pessoa.getSelectedItem()).getId());

                if (ID.getText().isEmpty()) {
                    DocumentoManager.getInstance().add(Doc_atual);
                } else {
                    Doc_atual.setId(Integer.parseInt(ID.getText()));
                    DocumentoManager.getInstance().update(Doc_atual);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            BtnCancelar.doClick();
        }

    }//GEN-LAST:event_BtnAction

    /**
     * Metodo genérico ligado a todos campos com perda de foco. Executa as ações
     * devidas de acordo com o campo que perdeu o foco.
     *
     * No campo da ID, verifica a existencia da mesma, e carrega os dados. Em
     * campos Text, executa um ajuste de caracteres, deixando as iniciais
     * maiusculas
     *
     * @param evt evento a ser executado
     */
    private void FocusLostGen(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FocusLostGen
        if (evt.getComponent() == ID) {
            if (!ID.getText().isEmpty()) {

                ArrayList<Documento> D1 = DocumentoManager.getInstance().Selecionar("Doc_ID=" + ID.getText());

                if (!D1.isEmpty()) {
                    Doc_atual = D1.get(0);

                    Pagamento.setText(Doc_atual.getMeio());
                    Documento.setText(Doc_atual.getDocumento());
                    Total.setText(String.valueOf(Doc_atual.getTotal()));
                    Emissao.setText(String.valueOf(Doc_atual.getEmissao()));
                }

                if (Total.getText().isEmpty()) {
                    ID.setText("");
                }
            }
        }
        if (evt.getComponent() == Pagamento) {
            Pagamento.setText(Utils.AjustaTexto(Pagamento.getText()));
        }
        if (evt.getComponent() == Documento) {
            Documento.setText(Utils.AjustaTexto(Documento.getText()));
        }
    }//GEN-LAST:event_FocusLostGen

    private void EmissaoFocusLostGen(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmissaoFocusLostGen
        if (evt.getComponent() == ID) {
            if (!ID.getText().isEmpty()) {

                ArrayList<Documento> D1 = DocumentoManager.getInstance().Selecionar("Doc_ID=" + ID.getText());

                if (!D1.isEmpty()) {
                    Doc_atual = D1.get(0);
                    ID.setText(String.valueOf(Doc_atual.getId()));
                    Pagamento.setText(Doc_atual.getMeio());
                    Documento.setText(Doc_atual.getDocumento());
                    Total.setText(String.valueOf(Doc_atual.getMeio()));
                    Emissao.setText(String.valueOf(Doc_atual.getEmissao()));

                }
            }

            if (Pagamento.getText().isEmpty()) {
                ID.setText("");
            }
        }
        if (evt.getComponent() == Pagamento) {
            Pagamento.setText(Utils.AjustaTexto(Pagamento.getText()));
        }
    }//GEN-LAST:event_EmissaoFocusLostGen

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
            java.util.logging.Logger.getLogger(Documento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Documento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Documento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Documento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Documentos dialog = new Documentos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnOK;
    private javax.swing.JTextField Documento;
    private javax.swing.JFormattedTextField Emissao;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Pagamento;
    private javax.swing.JComboBox<Pessoa> Pessoa;
    private javax.swing.JTextField Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

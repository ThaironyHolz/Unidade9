/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoi;

import Manager.ComodoManager;
import Model.Comodo;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class CadComodos extends javax.swing.JDialog {

    Comodo Com_atual = new Comodo();

    /**
     * Creates new form CadComodos
     */
    public CadComodos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.setTitle("Cadastro de Cômodos");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ID = new javax.swing.JFormattedTextField();
        Descricao = new javax.swing.JTextField();
        Maximo = new javax.swing.JFormattedTextField();
        Diaria = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        BtnCancelar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        BtnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Numero");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("Descrição");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Nro. Máximo de Pessoas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("Valor da Diária");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        ID.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#####"))));
        ID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                focusLostGen(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 9, 0, 0);
        getContentPane().add(ID, gridBagConstraints);

        Descricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                focusLostGen(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 273;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 9, 0, 0);
        getContentPane().add(Descricao, gridBagConstraints);

        Maximo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#####"))));
        Maximo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                focusLostGen(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        getContentPane().add(Maximo, gridBagConstraints);

        Diaria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤##,##0.00"))));
        Diaria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                focusLostGen(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        getContentPane().add(Diaria, gridBagConstraints);

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
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 11, 10);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private void focusLostGen(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusLostGen
        if (evt.getComponent() == ID) {
            if (!ID.getText().isEmpty()) {

                ArrayList<Comodo> C1 = ComodoManager.getInstance().selecionar("Com_ID=" + ID.getText());

                if (!C1.isEmpty()) {
                    Com_atual = C1.get(0);
                    ID.setText(String.valueOf(Com_atual.getId()));
                    Descricao.setText(Com_atual.getDescricao());
                    Maximo.setText(String.valueOf(Com_atual.getMaxpessoas()));
                    Diaria.setText(String.valueOf(Com_atual.getDiaria()));
                }
            }

            if (Descricao.getText().isEmpty()) {
                ID.setText("");
            }
        }
        if (evt.getComponent() == Descricao) {
            Descricao.setText(Utils.AjustaTexto(Descricao.getText()));
        }

    }//GEN-LAST:event_focusLostGen

    /**
     * Metodo generico de todos cliques em botões Executa as ações devidas de
     * acordo com o botão clicado.
     *
     * F10 grava ou altera. F02 abre uma consulta rapida para seleção de Comodos
     * existentes. F09 exclui Esc Cancela
     *
     * @param evt evento a ser executado
     */
    private void BtnAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAction
        if (evt.getSource() == BtnCancelar) {
            ID.setText("0");
            Descricao.setText("");
            Maximo.setText("0");
            Diaria.setText("0.0");
        }
        if (evt.getSource() == BtnExcluir) {
            if (!ID.getText().isEmpty()) {
                ComodoManager.getInstance().delete(Com_atual);
            }

            BtnCancelar.doClick();
        }
        if (evt.getSource() == BtnOK) {
            if (Descricao.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Campos obrigatórios não preenchidos: Descrição");
            }

            try {
                DecimalFormat format = new DecimalFormat("##,#0.00");
                format.setParseBigDecimal(true);

                Com_atual.setDescricao(Descricao.getText());
                Com_atual.setMaxpessoas(Integer.parseInt(Maximo.getText()));
                Com_atual.setDiaria((BigDecimal) format.parseObject(Diaria.getText()));

                if (ID.getText().isEmpty()) {
                    ComodoManager.getInstance().add(Com_atual);
                } else {
                    Com_atual.setId(Integer.parseInt(ID.getText()));
                    ComodoManager.getInstance().update(Com_atual);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            BtnCancelar.doClick();
        }
    }//GEN-LAST:event_BtnAction

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
            java.util.logging.Logger.getLogger(CadComodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadComodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadComodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadComodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadComodos dialog = new CadComodos(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField Descricao;
    private javax.swing.JFormattedTextField Diaria;
    private javax.swing.JFormattedTextField ID;
    private javax.swing.JFormattedTextField Maximo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

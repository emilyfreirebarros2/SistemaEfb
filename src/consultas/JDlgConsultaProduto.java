/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas;

import padraoNovo.*;
import dao.ProdutoDao_efb;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tools.Util;

public class JDlgConsultaProduto extends javax.swing.JDialog {

    /**
     * Creates new form JDlgPesquisaCliente
     */
    JDlgProdutoIA jDlgProduto;
    Util util;
    ConsultaProduto_efb pesquisarProduto_efb;
    ProdutoDao_efb produtoDao;
    List lista;
    private static final Logger LOGGER = Logger.getLogger("ProdutoDao_efb");

    public JDlgConsultaProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Consultar Produto");
        pesquisarProduto_efb = new ConsultaProduto_efb();
        produtoDao = new ProdutoDao_efb();

        lista = produtoDao.listAll();
        pesquisarProduto_efb.setList(lista);
        jTable1.setModel(pesquisarProduto_efb);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnIncluir_efb = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTxtQuantidade_Efb = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtPrecoMaior_Efb = new javax.swing.JTextField();
        jBtnPesquisar_efb = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBtnCancelar_efb = new javax.swing.JButton();
        jTxtPrecoMenor_Efb1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBtnIncluir_efb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        jBtnIncluir_efb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluir_efbActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Quantidade:");

        jBtnPesquisar_efb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisa-global.png"))); // NOI18N
        jBtnPesquisar_efb.setText("Pesquisar");
        jBtnPesquisar_efb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisar_efbActionPerformed(evt);
            }
        });

        jLabel2.setText("Preço Maior:");

        jBtnCancelar_efb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair.png"))); // NOI18N
        jBtnCancelar_efb.setText("Cancelar");
        jBtnCancelar_efb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelar_efbActionPerformed(evt);
            }
        });

        jLabel3.setText("Preço Menor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtPrecoMaior_Efb)
                            .addComponent(jTxtQuantidade_Efb, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtPrecoMenor_Efb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnPesquisar_efb))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnIncluir_efb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCancelar_efb)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtPrecoMaior_Efb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtPrecoMenor_Efb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtQuantidade_Efb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnIncluir_efb))
                    .addComponent(jBtnCancelar_efb, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnPesquisar_efb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluir_efbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluir_efbActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBtnIncluir_efbActionPerformed

    private void jBtnPesquisar_efbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisar_efbActionPerformed
        // TODO add your handling code here:
       

        if (jTxtPrecoMaior_Efb.getText().isEmpty() && jTxtQuantidade_Efb.getText().isEmpty() && jTxtPrecoMenor_Efb1.getText().isEmpty()) {
            // Se todos os campos de preço, quantidade e preço menor estiverem vazios
            LOGGER.log(Level.INFO, "Pesquisando todos os produtos.");
            lista = produtoDao.listAll();
            pesquisarProduto_efb.setList(lista);
        } else if (!jTxtPrecoMaior_Efb.getText().isEmpty() && jTxtQuantidade_Efb.getText().isEmpty() && jTxtPrecoMenor_Efb1.getText().isEmpty()) {
            // Se somente o campo de preço maior estiver preenchido
            LOGGER.log(Level.INFO, "Pesquisando por preço maior que: " + jTxtPrecoMaior_Efb.getText());
            lista = produtoDao.listPorPrecoMaiorQue(Double.parseDouble(jTxtPrecoMaior_Efb.getText()));
            pesquisarProduto_efb.setList(lista);
        } else if (jTxtPrecoMaior_Efb.getText().isEmpty() && !jTxtQuantidade_Efb.getText().isEmpty() && jTxtPrecoMenor_Efb1.getText().isEmpty()) {
            // Se somente o campo de quantidade estiver preenchido
            LOGGER.log(Level.INFO, "Pesquisando por quantidade maior que: " + jTxtQuantidade_Efb.getText());
            lista = produtoDao.listPorQuantidadeMaiorQue(Integer.parseInt(jTxtQuantidade_Efb.getText()));
            pesquisarProduto_efb.setList(lista);
        } else if (!jTxtPrecoMaior_Efb.getText().isEmpty() && !jTxtQuantidade_Efb.getText().isEmpty() && jTxtPrecoMenor_Efb1.getText().isEmpty()) {
            // Se ambos os campos de preço maior e quantidade estiverem preenchidos
            LOGGER.log(Level.INFO, "Pesquisando por preço e quantidade: " + jTxtPrecoMaior_Efb.getText() + ", " + jTxtQuantidade_Efb.getText());
            lista = produtoDao.listPorPrecoEQuantidade(Double.parseDouble(jTxtPrecoMaior_Efb.getText()), Integer.parseInt(jTxtQuantidade_Efb.getText()));
            pesquisarProduto_efb.setList(lista);
        } else if (jTxtPrecoMaior_Efb.getText().isEmpty() && jTxtQuantidade_Efb.getText().isEmpty() && !jTxtPrecoMenor_Efb1.getText().isEmpty()) {
            // Se somente o campo de preço menor estiver preenchido
            LOGGER.log(Level.INFO, "Pesquisando por preço menor que: " + jTxtPrecoMenor_Efb1.getText());
            lista = produtoDao.listPorPrecoMenorQue(Double.parseDouble(jTxtPrecoMenor_Efb1.getText()));
            pesquisarProduto_efb.setList(lista);
        } else if (!jTxtPrecoMaior_Efb.getText().isEmpty() && jTxtQuantidade_Efb.getText().isEmpty() && !jTxtPrecoMenor_Efb1.getText().isEmpty()) {
            // Se somente os campos de preço maior e preço menor estiverem preenchidos
            LOGGER.log(Level.INFO, "Pesquisando por preço maior que e preço menor que: " + jTxtPrecoMaior_Efb.getText() + ", " + jTxtPrecoMenor_Efb1.getText());
            lista = produtoDao.listPorPrecoMaiorQueEMenorQue(Double.parseDouble(jTxtPrecoMaior_Efb.getText()), Double.parseDouble(jTxtPrecoMenor_Efb1.getText()));
            pesquisarProduto_efb.setList(lista);
        } else if (jTxtPrecoMaior_Efb.getText().isEmpty() && !jTxtQuantidade_Efb.getText().isEmpty() && !jTxtPrecoMenor_Efb1.getText().isEmpty()) {
            // Se somente os campos de quantidade e preço menor estiverem preenchidos
            LOGGER.log(Level.INFO, "Pesquisando por quantidade maior que e preço menor que: " + jTxtQuantidade_Efb.getText() + ", " + jTxtPrecoMenor_Efb1.getText());
            lista = produtoDao.listPorQuantidadeMaiorQueEPrecoMenorQue(Integer.parseInt(jTxtQuantidade_Efb.getText()), Double.parseDouble(jTxtPrecoMenor_Efb1.getText()));
            pesquisarProduto_efb.setList(lista);
        } else if (!jTxtPrecoMaior_Efb.getText().isEmpty() && !jTxtQuantidade_Efb.getText().isEmpty() && !jTxtPrecoMenor_Efb1.getText().isEmpty()) {
            // Se todos os campos de preço maior, quantidade e preço menor estiverem preenchidos
            LOGGER.log(Level.INFO, "Pesquisando por preço maior que, quantidade maior que e preço menor que: " + jTxtPrecoMaior_Efb.getText() + ", " + jTxtQuantidade_Efb.getText() + ", " + jTxtPrecoMenor_Efb1.getText());
            lista = produtoDao.listPorPrecoMaiorQueEQuantidadeMaiorQueEPrecoMenorQue(Double.parseDouble(jTxtPrecoMaior_Efb.getText()), Integer.parseInt(jTxtQuantidade_Efb.getText()), Double.parseDouble(jTxtPrecoMenor_Efb1.getText()));
            pesquisarProduto_efb.setList(lista);
        }

    }//GEN-LAST:event_jBtnPesquisar_efbActionPerformed

    private void jBtnCancelar_efbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelar_efbActionPerformed
        // TODO add your handling code here:
        if (util.pergunta("Deseja Cancelar ?")) {
            setVisible(false);
        } else {
            util.mensagem("Selecione uma linha");
        }
    }//GEN-LAST:event_jBtnCancelar_efbActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgConsultaProduto dialog = new JDlgConsultaProduto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnCancelar_efb;
    private javax.swing.JButton jBtnIncluir_efb;
    private javax.swing.JButton jBtnPesquisar_efb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtPrecoMaior_Efb;
    private javax.swing.JTextField jTxtPrecoMenor_Efb1;
    private javax.swing.JFormattedTextField jTxtQuantidade_Efb;
    // End of variables declaration//GEN-END:variables
}

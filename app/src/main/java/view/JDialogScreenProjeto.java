/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.ProjetoController;
import javax.swing.JOptionPane;
import model.Projeto;

/**
 *
 * @author parel
 */
public class JDialogScreenProjeto extends javax.swing.JDialog {

    ProjetoController projetoController;
    
    public JDialogScreenProjeto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); 
        projetoController = new ProjetoController();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelProjeto = new javax.swing.JPanel();
        JLabelProjetoTitulo = new javax.swing.JLabel();
        JLabelProjetoIMG = new javax.swing.JLabel();
        JPanelDados = new javax.swing.JPanel();
        JLabelDadosNome = new javax.swing.JLabel();
        JTextFieldNome = new javax.swing.JTextField();
        JLabelDadosDescricao = new javax.swing.JLabel();
        JScrollPaneDadosDescricao = new javax.swing.JScrollPane();
        JTextAreaDescricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));

        JPanelProjeto.setBackground(new java.awt.Color(0, 51, 255));

        JLabelProjetoTitulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JLabelProjetoTitulo.setForeground(java.awt.Color.white);
        JLabelProjetoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelProjetoTitulo.setText("Projeto");

        JLabelProjetoIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelProjetoIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\parel\\Downloads\\icons8-selecionado-20.png")); // NOI18N
        JLabelProjetoIMG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelProjetoIMGMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPanelProjetoLayout = new javax.swing.GroupLayout(JPanelProjeto);
        JPanelProjeto.setLayout(JPanelProjetoLayout);
        JPanelProjetoLayout.setHorizontalGroup(
            JPanelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelProjetoLayout.createSequentialGroup()
                .addComponent(JLabelProjetoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelProjetoIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPanelProjetoLayout.setVerticalGroup(
            JPanelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelProjetoLayout.createSequentialGroup()
                .addComponent(JLabelProjetoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(JLabelProjetoIMG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JPanelDados.setBackground(java.awt.Color.white);

        JLabelDadosNome.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        JLabelDadosNome.setText("Nome");

        JTextFieldNome.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        JTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldNomeActionPerformed(evt);
            }
        });

        JLabelDadosDescricao.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        JLabelDadosDescricao.setText("Descri��o");

        JTextAreaDescricao.setColumns(20);
        JTextAreaDescricao.setRows(5);
        JScrollPaneDadosDescricao.setViewportView(JTextAreaDescricao);

        javax.swing.GroupLayout JPanelDadosLayout = new javax.swing.GroupLayout(JPanelDados);
        JPanelDados.setLayout(JPanelDadosLayout);
        JPanelDadosLayout.setHorizontalGroup(
            JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTextFieldNome)
                    .addComponent(JScrollPaneDadosDescricao)
                    .addGroup(JPanelDadosLayout.createSequentialGroup()
                        .addGroup(JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabelDadosNome, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabelDadosDescricao))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPanelDadosLayout.setVerticalGroup(
            JPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDadosLayout.createSequentialGroup()
                .addComponent(JLabelDadosNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelDadosDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JScrollPaneDadosDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPanelDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNomeActionPerformed

    private void JLabelProjetoIMGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelProjetoIMGMouseClicked
        try {
            if (!JTextFieldNome.getText().equals("")) {
            Projeto projeto = new Projeto();
            projeto.setNome(JTextFieldNome.getText());
            projeto.setDescricao(JTextAreaDescricao.getText());
            projetoController.save(projeto);
            JOptionPane.showMessageDialog(rootPane, "Projeto Salvo ihu!");
            this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar o projeto =/. Coloque um nome!");
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(rootPane, exception.getMessage());}
    }//GEN-LAST:event_JLabelProjetoIMGMouseClicked

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
                if ("Java Swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDialogScreenProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogScreenProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogScreenProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogScreenProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogScreenProjeto dialog = new JDialogScreenProjeto(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel JLabelDadosDescricao;
    private javax.swing.JLabel JLabelDadosNome;
    private javax.swing.JLabel JLabelProjetoIMG;
    private javax.swing.JLabel JLabelProjetoTitulo;
    private javax.swing.JPanel JPanelDados;
    private javax.swing.JPanel JPanelProjeto;
    private javax.swing.JScrollPane JScrollPaneDadosDescricao;
    private javax.swing.JTextArea JTextAreaDescricao;
    private javax.swing.JTextField JTextFieldNome;
    // End of variables declaration//GEN-END:variables
}

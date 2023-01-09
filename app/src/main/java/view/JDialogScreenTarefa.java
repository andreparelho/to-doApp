/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.TarefaController;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import javax.swing.JOptionPane;
import model.Projeto;
import model.Tarefa;

/**
 *
 * @author parel
 */
public class JDialogScreenTarefa extends javax.swing.JDialog {

    TarefaController tarefaController;
    Projeto projeto;
    
    public JDialogScreenTarefa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tarefaController = new TarefaController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelTarefa = new javax.swing.JPanel();
        JLabelTarefaTitulo = new javax.swing.JLabel();
        JLabelTarefaIMG = new javax.swing.JLabel();
        JPanelDadosTarefa = new javax.swing.JPanel();
        JLabelDadosNome = new javax.swing.JLabel();
        JTextFieldNome = new javax.swing.JTextField();
        JLabelDadoslDescricao = new javax.swing.JLabel();
        JTextFieldDescricao = new javax.swing.JTextField();
        JLabelDadosPrazo = new javax.swing.JLabel();
        JLabelDadosObs = new javax.swing.JLabel();
        JScrollPaneDadosObs = new javax.swing.JScrollPane();
        JTextAreaObs = new javax.swing.JTextArea();
        jFormattedTextFieldPrazo = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JPanelTarefa.setBackground(new java.awt.Color(0, 51, 255));

        JLabelTarefaTitulo.setBackground(new java.awt.Color(0, 153, 153));
        JLabelTarefaTitulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        JLabelTarefaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        JLabelTarefaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelTarefaTitulo.setText("Tarefas");

        JLabelTarefaIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelTarefaIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\parel\\Downloads\\icons8-selecionado-20.png")); // NOI18N
        JLabelTarefaIMG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelTarefaIMGMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPanelTarefaLayout = new javax.swing.GroupLayout(JPanelTarefa);
        JPanelTarefa.setLayout(JPanelTarefaLayout);
        JPanelTarefaLayout.setHorizontalGroup(
            JPanelTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTarefaLayout.createSequentialGroup()
                .addComponent(JLabelTarefaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabelTarefaIMG, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
        );
        JPanelTarefaLayout.setVerticalGroup(
            JPanelTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelTarefaIMG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JLabelTarefaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        JPanelDadosTarefa.setBackground(new java.awt.Color(255, 255, 255));

        JLabelDadosNome.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        JLabelDadosNome.setText("Nome");

        JTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldNomeActionPerformed(evt);
            }
        });

        JLabelDadoslDescricao.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        JLabelDadoslDescricao.setText("Descrição");

        JLabelDadosPrazo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        JLabelDadosPrazo.setText("Prazo");

        JLabelDadosObs.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        JLabelDadosObs.setText("Observações");

        JTextAreaObs.setColumns(20);
        JTextAreaObs.setRows(5);
        JScrollPaneDadosObs.setViewportView(JTextAreaObs);

        javax.swing.GroupLayout JPanelDadosTarefaLayout = new javax.swing.GroupLayout(JPanelDadosTarefa);
        JPanelDadosTarefa.setLayout(JPanelDadosTarefaLayout);
        JPanelDadosTarefaLayout.setHorizontalGroup(
            JPanelDadosTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelDadosTarefaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelDadosTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextFieldPrazo)
                    .addComponent(JTextFieldDescricao)
                    .addComponent(JTextFieldNome)
                    .addComponent(JScrollPaneDadosObs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelDadosTarefaLayout.createSequentialGroup()
                        .addGroup(JPanelDadosTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabelDadosNome)
                            .addComponent(JLabelDadoslDescricao)
                            .addComponent(JLabelDadosPrazo)
                            .addComponent(JLabelDadosObs))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPanelDadosTarefaLayout.setVerticalGroup(
            JPanelDadosTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDadosTarefaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabelDadosNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabelDadoslDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabelDadosPrazo)
                .addGap(11, 11, 11)
                .addComponent(jFormattedTextFieldPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelDadosObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JScrollPaneDadosObs)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPanelDadosTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanelDadosTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLabelTarefaIMGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelTarefaIMGMouseClicked
        try {
        Tarefa tarefa = new Tarefa();
        tarefa.setProjetoID(projeto.getProjetoID());
        
        tarefa.setNome(JTextFieldNome.getText());
        tarefa.setDescricao(JTextFieldDescricao.getText());
        tarefa.setObservacoes(JTextAreaObs.getText());
        tarefa.setStatus(false);
            
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date prazo = null;
        prazo = dateFormat.parse(jFormattedTextFieldPrazo.getText());
        tarefa.setPrazo(prazo);
        
        tarefaController.save(tarefa);
        JOptionPane.showMessageDialog(rootPane, "Tarefa Salva! uhu");
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(rootPane, exception.getMessage());
        }
        this.dispose();
    }//GEN-LAST:event_JLabelTarefaIMGMouseClicked

    private void JTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNomeActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogScreenTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogScreenTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogScreenTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogScreenTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogScreenTarefa dialog = new JDialogScreenTarefa(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel JLabelDadosNome;
    private javax.swing.JLabel JLabelDadosObs;
    private javax.swing.JLabel JLabelDadosPrazo;
    private javax.swing.JLabel JLabelDadoslDescricao;
    private javax.swing.JLabel JLabelTarefaIMG;
    private javax.swing.JLabel JLabelTarefaTitulo;
    private javax.swing.JPanel JPanelDadosTarefa;
    private javax.swing.JPanel JPanelTarefa;
    private javax.swing.JScrollPane JScrollPaneDadosObs;
    private javax.swing.JTextArea JTextAreaObs;
    private javax.swing.JTextField JTextFieldDescricao;
    private javax.swing.JTextField JTextFieldNome;
    private javax.swing.JFormattedTextField jFormattedTextFieldPrazo;
    // End of variables declaration//GEN-END:variables

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}

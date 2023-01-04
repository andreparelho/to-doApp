

package view;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author parel
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        JPanelListaVazia = new javax.swing.JPanel();
        JLabelListaIMG = new javax.swing.JLabel();
        JLabelListaTexto1 = new javax.swing.JLabel();
        JLabelListaTexto2 = new javax.swing.JLabel();
        JPanelCabecalho = new javax.swing.JPanel();
        JLabelCabecalhoTitulo = new javax.swing.JLabel();
        JLabelCabecalhoSubtitulo = new javax.swing.JLabel();
        JLabelCabecalhoIMG = new javax.swing.JLabel();
        JPanelProjeto = new javax.swing.JPanel();
        JLabelProjetoTitulo = new javax.swing.JLabel();
        JLabelProjetoIMG = new javax.swing.JLabel();
        JPanelTarefa = new javax.swing.JPanel();
        JLabelTarefaTitulo = new javax.swing.JLabel();
        JLabelTarefaIMG = new javax.swing.JLabel();
        JPanelLista = new javax.swing.JPanel();
        JScrollPaneProjetos = new javax.swing.JScrollPane();
        JListProjetos = new javax.swing.JList<>();
        JPanelTabelaTarefas = new javax.swing.JPanel();
        JScrollPaneTabelaTarefa = new javax.swing.JScrollPane();
        JTableTarefas = new javax.swing.JTable();

        JPanelListaVazia.setBackground(new java.awt.Color(255, 255, 255));

        JLabelListaIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelListaIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\parel\\Downloads\\icons8-faturas-de-pasta-40.png")); // NOI18N

        JLabelListaTexto1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JLabelListaTexto1.setForeground(new java.awt.Color(0, 51, 255));
        JLabelListaTexto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelListaTexto1.setText("Nenhuma tarefa por aqui!");

        JLabelListaTexto2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        JLabelListaTexto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelListaTexto2.setText("Clique no icone para criar tarefas");

        javax.swing.GroupLayout JPanelListaVaziaLayout = new javax.swing.GroupLayout(JPanelListaVazia);
        JPanelListaVazia.setLayout(JPanelListaVaziaLayout);
        JPanelListaVaziaLayout.setHorizontalGroup(
            JPanelListaVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelListaTexto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JPanelListaVaziaLayout.createSequentialGroup()
                .addGroup(JPanelListaVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelListaIMG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelListaTexto2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JPanelListaVaziaLayout.setVerticalGroup(
            JPanelListaVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelListaVaziaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(JLabelListaIMG)
                .addGap(18, 18, 18)
                .addComponent(JLabelListaTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabelListaTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 600));

        JPanelCabecalho.setBackground(new java.awt.Color(0, 51, 255));

        JLabelCabecalhoTitulo.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        JLabelCabecalhoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        JLabelCabecalhoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelCabecalhoTitulo.setText("Todo App");
        JLabelCabecalhoTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        JLabelCabecalhoSubtitulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JLabelCabecalhoSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        JLabelCabecalhoSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelCabecalhoSubtitulo.setText("Escreva todos os seus projetos e tarefas!");

        JLabelCabecalhoIMG.setForeground(new java.awt.Color(255, 255, 255));
        JLabelCabecalhoIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelCabecalhoIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\parel\\Downloads\\icons8-pasta-50.png")); // NOI18N

        javax.swing.GroupLayout JPanelCabecalhoLayout = new javax.swing.GroupLayout(JPanelCabecalho);
        JPanelCabecalho.setLayout(JPanelCabecalhoLayout);
        JPanelCabecalhoLayout.setHorizontalGroup(
            JPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelCabecalhoLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(JLabelCabecalhoIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabelCabecalhoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JPanelCabecalhoLayout.createSequentialGroup()
                .addComponent(JLabelCabecalhoSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JPanelCabecalhoLayout.setVerticalGroup(
            JPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelCabecalhoLayout.createSequentialGroup()
                .addGroup(JPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelCabecalhoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(JLabelCabecalhoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelCabecalhoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLabelCabecalhoIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabelCabecalhoSubtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        JPanelProjeto.setBackground(new java.awt.Color(0, 51, 255));

        JLabelProjetoTitulo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        JLabelProjetoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        JLabelProjetoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelProjetoTitulo.setText("Projetos");

        JLabelProjetoIMG.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        JLabelProjetoIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelProjetoIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\parel\\Downloads\\icons8-mais-20.png")); // NOI18N
        JLabelProjetoIMG.setMaximumSize(new java.awt.Dimension(69, 69));
        JLabelProjetoIMG.setMinimumSize(new java.awt.Dimension(69, 69));
        JLabelProjetoIMG.setPreferredSize(new java.awt.Dimension(69, 69));
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
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(JLabelProjetoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabelProjetoIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPanelProjetoLayout.setVerticalGroup(
            JPanelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelProjetoIMG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
            .addComponent(JLabelProjetoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JPanelTarefa.setBackground(new java.awt.Color(0, 51, 255));

        JLabelTarefaTitulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        JLabelTarefaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        JLabelTarefaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelTarefaTitulo.setText("Tarefas");

        JLabelTarefaIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\parel\\Downloads\\icons8-mais-20.png")); // NOI18N

        javax.swing.GroupLayout JPanelTarefaLayout = new javax.swing.GroupLayout(JPanelTarefa);
        JPanelTarefa.setLayout(JPanelTarefaLayout);
        JPanelTarefaLayout.setHorizontalGroup(
            JPanelTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTarefaLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(JLabelTarefaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabelTarefaIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        JPanelTarefaLayout.setVerticalGroup(
            JPanelTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTarefaLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(JPanelTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelTarefaLayout.createSequentialGroup()
                        .addComponent(JLabelTarefaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(JLabelTarefaIMG, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
        );

        JPanelLista.setBackground(new java.awt.Color(255, 255, 255));

        JListProjetos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        JListProjetos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        JListProjetos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JListProjetos.setFixedCellHeight(20);
        JListProjetos.setSelectionBackground(new java.awt.Color(0, 51, 255));
        JListProjetos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        JScrollPaneProjetos.setViewportView(JListProjetos);

        javax.swing.GroupLayout JPanelListaLayout = new javax.swing.GroupLayout(JPanelLista);
        JPanelLista.setLayout(JPanelListaLayout);
        JPanelListaLayout.setHorizontalGroup(
            JPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JScrollPaneProjetos)
        );
        JPanelListaLayout.setVerticalGroup(
            JPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JScrollPaneProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );

        JPanelTabelaTarefas.setBackground(new java.awt.Color(255, 255, 255));

        JTableTarefas.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        JTableTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Tarefa Concluida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableTarefas.setGridColor(new java.awt.Color(204, 204, 204));
        JTableTarefas.setSelectionBackground(new java.awt.Color(0, 51, 255));
        JTableTarefas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        JTableTarefas.setShowGrid(true);
        JScrollPaneTabelaTarefa.setViewportView(JTableTarefas);

        javax.swing.GroupLayout JPanelTabelaTarefasLayout = new javax.swing.GroupLayout(JPanelTabelaTarefas);
        JPanelTabelaTarefas.setLayout(JPanelTabelaTarefasLayout);
        JPanelTabelaTarefasLayout.setHorizontalGroup(
            JPanelTabelaTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JScrollPaneTabelaTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        JPanelTabelaTarefasLayout.setVerticalGroup(
            JPanelTabelaTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JScrollPaneTabelaTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPanelProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JPanelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JPanelTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JPanelTabelaTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(JPanelCabecalho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPanelTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanelTabelaTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLabelProjetoIMGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelProjetoIMGMouseClicked
        JDialogScreenProjeto jDialogScreenProjeto = new JDialogScreenProjeto(this, rootPaneCheckingEnabled);
        jDialogScreenProjeto.setVisible(true);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelCabecalhoIMG;
    private javax.swing.JLabel JLabelCabecalhoSubtitulo;
    private javax.swing.JLabel JLabelCabecalhoTitulo;
    private javax.swing.JLabel JLabelListaIMG;
    private javax.swing.JLabel JLabelListaTexto1;
    private javax.swing.JLabel JLabelListaTexto2;
    private javax.swing.JLabel JLabelProjetoIMG;
    private javax.swing.JLabel JLabelProjetoTitulo;
    private javax.swing.JLabel JLabelTarefaIMG;
    private javax.swing.JLabel JLabelTarefaTitulo;
    private javax.swing.JList<String> JListProjetos;
    private javax.swing.JPanel JPanelCabecalho;
    private javax.swing.JPanel JPanelLista;
    private javax.swing.JPanel JPanelListaVazia;
    private javax.swing.JPanel JPanelProjeto;
    private javax.swing.JPanel JPanelTabelaTarefas;
    private javax.swing.JPanel JPanelTabelaTarefas1;
    private javax.swing.JPanel JPanelTabelaTarefas2;
    private javax.swing.JPanel JPanelTabelaTarefas3;
    private javax.swing.JPanel JPanelTabelaTarefas4;
    private javax.swing.JPanel JPanelTabelaTarefas5;
    private javax.swing.JPanel JPanelTarefa;
    private javax.swing.JScrollPane JScrollPaneProjetos;
    private javax.swing.JScrollPane JScrollPaneTabelaTarefa;
    private javax.swing.JScrollPane JScrollPaneTabelaTarefa1;
    private javax.swing.JScrollPane JScrollPaneTabelaTarefa2;
    private javax.swing.JScrollPane JScrollPaneTabelaTarefa3;
    private javax.swing.JScrollPane JScrollPaneTabelaTarefa4;
    private javax.swing.JScrollPane JScrollPaneTabelaTarefa5;
    private javax.swing.JTable JTableTarefas;
    private javax.swing.JTable JTableTarefas1;
    private javax.swing.JTable JTableTarefas2;
    private javax.swing.JTable JTableTarefas3;
    private javax.swing.JTable JTableTarefas4;
    private javax.swing.JTable JTableTarefas5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

  public void DecorationTarefas(){
      /*Customização da Lista de Tarefas*/
      JTableTarefas.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 14));
      JTableTarefas.getTableHeader().setBackground(new Color(0,51,255));
      JTableTarefas.getTableHeader().setForeground(new Color (255, 255, 255));
      JTableTarefas.setAutoCreateRowSorter(true);
    
}
}
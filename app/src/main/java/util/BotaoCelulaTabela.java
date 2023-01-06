/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;



/**
 *
 * @author parel
 */
public class BotaoCelulaTabela extends DefaultTableCellRenderer {
    
    private String buttonType;

    public BotaoCelulaTabela(String buttonType) {
        this.buttonType = buttonType;
    }

    @Override
     public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
      int row, int col){
         
         JLabel jLabel;
         jLabel = (JLabel) super.getTableCellRendererComponent(
         table, value, isSelected, hasFocus, row, col);
         
         
         jLabel.setHorizontalAlignment(JLabel.CENTER);
         jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + buttonType + ".png")));
         
         return jLabel;
     }

    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }
    
}

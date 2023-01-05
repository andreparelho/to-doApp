package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.table.AbstractTableModel;

import javax.swing.table.AbstractTableModel;
import model.Tarefa;

public class TarefaModelTabela extends AbstractTableModel {

    String[] colunas = {"Nome", "Descrição",
        "Prazo", "Tarefa Concluida", "Editar", "Excluir"};
    List<Tarefa> tarefas = new ArrayList();

    @Override
    public int getRowCount() {
        return tarefas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return columnIndex == 3;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        if (tarefas.isEmpty()) {
            return Object.class;
        }
        return  this.getValueAt(0, columnIndex).getClass();  
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: 
                return tarefas.get(rowIndex).getNome();
            case 1:
                return tarefas.get(rowIndex).getDescricao();
            case 2:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return simpleDateFormat.format(tarefas.get(rowIndex).getPrazo());
            case 3:
                return tarefas.get(rowIndex).getStatus();
            case 4:
                return "";
            case 5:
                return "";
            default:
                return "Dados não encontrados";
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
        tarefas.get(rowIndex).setStatus((boolean)aValue);
    }

    public String[] getColunas() {
        return colunas;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
}

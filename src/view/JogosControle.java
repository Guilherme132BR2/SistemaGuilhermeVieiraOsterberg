/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JogosGvo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Guilh
 */
public class JogosControle extends AbstractTableModel {
    private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public JogosGvo getBean(int linha) {
        return (JogosGvo) lista.get(linha);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JogosGvo jogosGvo = (JogosGvo) lista.get(rowIndex);
        if (columnIndex == 0) {
            return jogosGvo.getIdJogosGvo();
        }
        if (columnIndex == 1) {
            return jogosGvo.getNomeGvo();
        }
        if (columnIndex == 2) {
            return jogosGvo.getPrecoGvo();
        }
        if (columnIndex == 3) {
            return jogosGvo.getPlataforma();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Nome";
        }
        if (columnIndex == 2) {
            return "Preço";
        }
        if (columnIndex == 3) {
            return "Plataforma";
        }
        return "";
    }
}

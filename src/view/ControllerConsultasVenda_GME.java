/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.Venda;

import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerConsultasVenda_GME extends AbstractTableModel {

    private List lsVendaConsultar;

    public void setList(List lsVendaConsultar) {
        this.lsVendaConsultar = lsVendaConsultar;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lsVendaConsultar.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Venda venda = (Venda) lsVendaConsultar.get( rowIndex);
        if ( columnIndex == 0 ){
            return venda.getGmeIdVenda();
        } else if (columnIndex ==1) {
            return venda.getEmpresas().getGmeNomeEmpresa();        
        } else if (columnIndex ==2) {
            return venda.getClientes().getGmeNomePessoal();
        } 
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Empresa";         
        } else if ( columnIndex == 2) {
            return "Cliente";
        }
        return "";
    }
}

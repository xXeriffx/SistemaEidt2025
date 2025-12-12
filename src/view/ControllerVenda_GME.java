/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import bean.Venda;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerVenda_GME extends AbstractTableModel {

    private List lstVenda;

    public void setList(List lstVenda) {
        this.lstVenda = lstVenda;
    }
    
    public Venda getBean(int rowIndex) {
        return (Venda) lstVenda.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstVenda.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Venda venda = (Venda) lstVenda.get( rowIndex);
        if ( columnIndex == 0 ){
            return venda.getGmeIdVenda();
        } else if (columnIndex ==1) {
            return venda.getClientes();        
        } else if (columnIndex ==2) {
            return venda.getGmeData();
        } else if (columnIndex ==3) {
            return venda.getGmeTotal();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Cliente";         
        } else if ( columnIndex == 2) {
            return "Data";
        } else if ( columnIndex == 3) {
            return "Total";
        } 
        return "";
    }
    
}

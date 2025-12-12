/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VendaProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerVendaProdutos_GME extends AbstractTableModel {

    private List lstVendaProduto;

    public void setList(List lstVendaProduto) {
        this.lstVendaProduto = lstVendaProduto;
        this.fireTableDataChanged();
    }
    
   public VendaProduto getBean(int rowIndex) {
        return (VendaProduto) lstVendaProduto.get(rowIndex);
    }

    public void addBean(VendaProduto pedidosProdutos) {
        this.lstVendaProduto.add(pedidosProdutos);
        this.fireTableDataChanged();
    }
    
    public void removeBean(int rowIndex) {
        this.lstVendaProduto.remove(rowIndex);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstVendaProduto.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VendaProduto vendaProduto = (VendaProduto) lstVendaProduto.get( rowIndex);
        if ( columnIndex == 0 ){
            return vendaProduto.getGmeIdVendaProduto();
        } else if (columnIndex ==1) {
            return vendaProduto.getProdutos();        
        } else if (columnIndex ==2) {
            return vendaProduto.getGmeQuantidade();
        } else if (columnIndex ==3) {
            return vendaProduto.getGmeValorUnitario();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Produto";         
        } else if ( columnIndex == 2) {
            return "Quantidade";
        } else if ( columnIndex == 3) {
            return "Valor";
        } 
        return "";
    }
    
}

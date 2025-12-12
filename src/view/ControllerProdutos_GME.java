/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Produtos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerProdutos_GME extends AbstractTableModel {

    private List lstProdutos;

    public void setList(List lstProdutos) {
        this.lstProdutos = lstProdutos;
    }
    
    public Produtos getBean(int rowIndex) {
        return (Produtos) lstProdutos.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstProdutos.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produtos produtos = (Produtos) lstProdutos.get( rowIndex);
        if ( columnIndex == 0 ){
            return produtos.getGmeIdProdutos();
        } else if (columnIndex ==1) {
            return produtos.getGmeNomeProduto();        
        } else if (columnIndex ==2) {
            return produtos.getGmeLitragem();
        } else if (columnIndex ==3) {
            return produtos.getGmeValorUnitario();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "nome";         
        } else if ( columnIndex == 2) {
            return "Litragem";
        } else if ( columnIndex == 3) {
            return "Valor";
        } 
        return "";
    }
    
}

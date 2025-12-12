/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Clientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerClientes_GME extends AbstractTableModel {

    private List lstClientess;

    public void setList(List lstClientess) {
        this.lstClientess = lstClientess;
    }
    
    public Clientes getBean(int rowIndex) {
        return (Clientes) lstClientess.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstClientess.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Clientes clientes = (Clientes) lstClientess.get( rowIndex);
        if ( columnIndex == 0 ){
            return clientes.getGmeIdClientes();
        } else if (columnIndex ==1) {
            return clientes.getGmeNomePessoal();        
        } else if (columnIndex ==2) {
            return clientes.getGmeNomeLoja();
        } else if (columnIndex ==3) {
            return clientes.getGmeTelefoneLoja();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Nome";         
        } else if ( columnIndex == 2) {
            return "Empresa";
        } else if ( columnIndex == 3) {
            return "TEL. Empresa";
        } 
        return "";
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.Empresas;

import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerConsultasEmpresas_GME extends AbstractTableModel {

    private List lstEmpresas;

    public void setList(List lstEmpresas) {
        this.lstEmpresas = lstEmpresas;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstEmpresas.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Empresas produtos = (Empresas) lstEmpresas.get( rowIndex);
        if ( columnIndex == 0 ){
            return produtos.getGmeIdEmpresas();
        } else if (columnIndex ==1) {
            return produtos.getGmeNomeEmpresa();        
        } else if (columnIndex ==2) {
            return produtos.getGmeTelefoneEmpresa();
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
            return "Telefone";
        }
        return "";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import bean.Empresas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerEmpresas_GME extends AbstractTableModel {

    private List lstEmpresas;

    public void setList(List lstEmpresas) {
        this.lstEmpresas = lstEmpresas;
    }
    
    public Empresas getBean(int rowIndex) {
        return (Empresas) lstEmpresas.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstEmpresas.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Empresas empresas = (Empresas) lstEmpresas.get( rowIndex);
        if ( columnIndex == 0 ){
            return empresas.getGmeIdEmpresas();
        } else if (columnIndex ==1) {
            return empresas.getGmeNomeEmpresa();        
        } else if (columnIndex ==2) {
            return empresas.getGmeTelefoneEmpresa();
        } else if (columnIndex ==3) {
            return empresas.getGmeNomeRepresentante();
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
            return "TEL. Empresa";
        } else if ( columnIndex == 3) {
            return "Representante";
        } 
        return "";
    }
    
}

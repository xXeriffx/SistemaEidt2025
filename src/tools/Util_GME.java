/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author u07273579130
 */
public class Util_GME {
    public static void habilitar(boolean Valor, JComponent... componentes){
        for (int i = 0; i < componentes.length; i++) {
            JComponent componente = componentes[i];
            componentes[i].setEnabled(Valor);
        }
    }
    
    //SEM instanceof
    //public static void Limpar(JComponent ...componentes){
    //    for(int i = 0; i < componentes.length; i ++){
    //        //instanceof
    //        ((JTextField)componentes[i]).setText("");
    //    }
    //}
    //Com instanceof
    public static void Limpar(JComponent ...componentes){
        for(int i = 0; i < componentes.length; i ++){
           
        //instanceof
        if (componentes[i] instanceof JTextField) {
            ((JTextField) componentes[i]).setText("");
        }
          
        if (componentes[i] instanceof JComboBox){
            ((JComboBox) componentes[i]).setSelectedIndex(-1);
        }
        
        if (componentes[i] instanceof JFormattedTextField){
            ((JFormattedTextField) componentes[i]).setText("");
        }
        
        if (componentes[i] instanceof JPasswordField){
            ((JPasswordField) componentes[i]).setText("");
        }
        
        if (componentes[i] instanceof JCheckBox){
            ((JCheckBox) componentes[i]).setSelected(false);
        }
      }
    }
    
    public static void messagem(String cad){
        JOptionPane.showMessageDialog(null,cad);
    }
    
    public static boolean perguntar(String cad){
        JOptionPane.showConfirmDialog(null, cad);
        return true;
        //se o botao for "yes" returna true /// se nao retorna false (palavras ditas em sala)
    }
    
    public static int strToInt(String num){
        return Integer.valueOf(num);
    }
    
    public static String intToStr(String cad){
        return String.valueOf(cad);
    }
    
    public static double strToDouble(String cad){
    return Double.valueOf(cad);
    }
    
    
    //O lucas Boeira me ajudou nessa parte, eu usei o chat mas não parecia em nada com oque a gente viu na sala. 
    
    public static Date strToDate(String cad){
        
    try {
        return new java.text.SimpleDateFormat("dd/MM/yyyy").parse(cad);//obrigatorio estar formatado os campos [date] se não da B.O. (eu acho, ainda nao testei no banco)
    } catch (Exception e) { //cath para se a STR estiver sem formatção não crashar o progama.
        return null;
    }
    
    }
    public static String dateToStr(Date data){
        return new java.text.SimpleDateFormat("dd/MM/yyyy").format(data);
    }
}

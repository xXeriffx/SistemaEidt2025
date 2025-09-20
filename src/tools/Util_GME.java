/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
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
          
        }
    }
    public static void messagem(String cad){
        JOptionPane.showMessageDialog(null,cad);
    }
    
    public static boolean perguntar(String cad){
        JOptionPane.showConfirmDialog(null, cad);
        return true;
        //se o botao for "yes" returna true se nao retorna false 
    }
    
    public static int strToInt(String num){
        return Integer.valueOf(num);
    }
    
    public static String intToStr(String cad){
        return String.valueOf(cad);
    }
}

/**
1. Elaborar um programa em Java que calcule a área de
uma circunferência.
Obs.: Área = 2 ∏ . r
 */

package Lista;
import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main (String []args){
        Double pi = 3.14, area;
        
        area = pi *2;
        
        JOptionPane.showMessageDialog(null, "A área da circuferência é: "+ area);
        
     System.exit(0);  
    }
    
}

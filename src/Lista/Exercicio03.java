/**
 3. Elaborar um programa em Java que receber um
número e informe se o mesmo é par ou impar.
 */
package Lista;
import javax.swing.*;

public class Exercicio03 {
    public static void main (String [] args){
    String saida="";
    String entrada = JOptionPane.showInputDialog("Entre com um número: ");
    
    int i = Integer.parseInt(entrada);
        
        if (i % 2 == 0){
        saida+="par";
    }else{
        saida+="impar";
            }
       
        JOptionPane.showMessageDialog(null, "O numero é: " + saida);
  
    
    
    System.exit(0);
    }
    
}

/**
 * 2. Aceitar dois números e conseqüentemente realizar a
soma, subtração, divisão, multiplicação desses número.
 */

package Lista;
import javax.swing.*;

public class Exercicio02 {
    public static void main (String [] args){
        String Pnum, Snum;
        int num1, num2, soma, subtracao, multiplicacao, divisao, resto;
        
        Pnum = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        
        Snum =JOptionPane.showInputDialog("Digite o segundo numero: ");
        
        num1 = Integer.parseInt (Pnum);
        num2 = Integer.parseInt (Snum);
        
        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;
        resto = num1 % num2;
        
        JOptionPane.showConfirmDialog(null, "O da soma é: " + soma +
                "\n O subtração é: " + subtracao +
                "\n a multiplição é: " + multiplicacao +
                "\n a divisão é: " + divisao +
                "\n o resto é: " + resto);
        
        System.exit(0);
    
    }
}

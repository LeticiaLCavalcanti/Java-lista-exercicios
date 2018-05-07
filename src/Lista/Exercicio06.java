/**
 * 6. Aceitar dois números e um sinal (+,-,/ ou *), após
confirmação exiba o resultado correspondente.*/


package Lista;
import javax.swing.*;

public class Exercicio06 {
	public static void main (String [] args) {
		String StringNum1, StringNum2, StringSinal;
		int num1, num2, sinal;
		
		StringNum1 = JOptionPane.showInputDialog("Insira o numero que você deseja calcular: ");
		StringNum2 = JOptionPane.showInputDialog("Insira  sinal de operação que você deseja usar no calculo: ");
		StringSinal = JOptionPane.showInputDialog("Insira segundo numero que você deseja calcular: ");
		
		num1 = Integer.parseInt(StringNum1);
		num2 = Integer.parseInt(StringNum2);
		sinal = Integer.parseInt(StringSinal);
		
		
		
		/*EM construção*/
	}
	

}

/**
 * 5. Crie um programa para receber o ano de nascimento
do usuário e exiba na tela as seguintes informações:
• O usuário é maior de idade?
• O usuário pode votar?
• O usuário pode tirar a Carteira Nacional de Habilitação
(CNH)?
 */

package Lista;
import javax.swing.*;

public class Exercicio05 {
	public static void main (String [] args) {
		String anoString;
		int idade, anoNascimento;
		
		anoString = JOptionPane.showInputDialog("Insira seu ano de nascimento: ");
		anoNascimento = Integer.parseInt(anoString);
		
		idade = 2018 - anoNascimento;
		
		/*System.out.print(anoNascimento);
		System.out.print(idade);*/
		
				
		if (idade <16) {
			JOptionPane.showMessageDialog(null, "Você tem "+idade+" anos e ainda terá que aguardar para ter permissão de voto e tirar a CNH");
			
		}else if ((idade >= 16) && (idade<18)) {
			JOptionPane.showMessageDialog(null, "Você tem " +idade+ " anos, sendo ainda menor de idade, terá permissão apenas ao voto");
			
		}else if (idade >18) {
			JOptionPane.showMessageDialog(null, "Você tem "+idade+ " anos, sendo maior de idade, poderá votar, e tirar a CNH");
		}
	
		
		System.exit(0);
		
	}

}



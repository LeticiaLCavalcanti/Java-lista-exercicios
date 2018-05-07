/**
 Aceitar quatro notas(Portfólio*2, Nota do professor*2,
Avaliação Dissertativa*3 e Provão eletrônico*3), realizar a
média entre elas e exibir se o aluno esta Aprovado (caso
média maior ou igual a seis) ou reprovado.
 */
package Lista;
import javax.swing.*;

public class Exercicio04 {
    public static void main (String [] args){
        String Nport, Nprof, Nprov, NprovE;
        double nota1, nota2, nota3, nota4, media;
              
        Nport = JOptionPane.showInputDialog("Insira a nota do portfólio: ");
        Nprof = JOptionPane.showInputDialog("Insira a nota do professor: ");
        Nprov = JOptionPane.showInputDialog("Insira a nota da prova dissertativa: ");
        NprovE = JOptionPane.showInputDialog("Insira a nota da prova eletronica: ");
        
        nota1 = Double.parseDouble (Nport);
        nota2 = Double.parseDouble (Nprof);
        nota3 = Double.parseDouble (Nprov);
        nota4 = Double.parseDouble (NprovE);
               
        media = ((nota1*2)+(nota2*2)+(nota3*3)+(nota4*3))/10;
        
        if (media >= 6){
            JOptionPane.showMessageDialog(null, "O aluno foi aprovado e sua nota é esta: " + media);
        }else{
            JOptionPane.showMessageDialog(null, "O aluno foi reprovado e a sua nota é esta: " + media);
        }
        
        
        System.exit(0);
    }
    
}




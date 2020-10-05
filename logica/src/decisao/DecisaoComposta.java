package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade de faltas"));	
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
		float media = (nota1 + nota2) / 2;
		System.out.println("Aluno: " + nome + " sua media foi: " + media);
				
		if (faltas>20 || media <4)
		{
			 System.out.println("Infelizmente " + nome + " você foi reaprovado !!");
		}else
		if (media>=6)
		 {
			 System.out.println("Parabens !! " + nome + " você foi aprovado !!");
		 }else
		 {
			 System.out.println(nome + " você ainda tem chance no exame !!");
		 }
		 
		
	}

}

package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade de faltas"));	
		if (faltas>20) {
			System.out.println("Infelizmente " + nome + " voc� foi reaprovado !!");
			return;
		}else
		{
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
			float media = (nota1 + nota2) / 2;
			System.out.println("Aluno: " + nome + " sua media foi: " + media);
			if (media <4)
			{
				System.out.println("Infelizmente " + nome + " voc� foi reaprovado !!");
			}else
				if (media>=6)
				{
					System.out.println("Parabens !! " + nome + " voc� foi aprovado !!");
				}else
				{
					System.out.println(nome + " voc� ainda tem chance no exame !!");
				}
		}
		System.out.println("fim");
		
		switch (faltas)
		{
		case 6 : {System.out.println("");}
		default : {System.out.println("");}
		}
		
	}
}

package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
		float media = (nota1 + nota2) / 2;
		System.out.println("Aluno: " + nome + " sua media foi: " + media);
		 if (media<4)
		 {
			 System.out.println("Infelizmente " + nome + " voc� foi reaprovado !!");
		 }

		 if (media>=4 && media<6)
		 {
			 System.out.println(nome + " voc� ainda tem chance no exame !!");
		 }

		if (media>=6)
		 {
			 System.out.println("Parabens !! " + nome + " voc� foi aprovado !!");
		 }

		 
		
	}

}

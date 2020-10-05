package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		
		if (idade >= 18 && idade <= 70)
		{			
			System.out.println(nome + " É obrigado votar !!");
		}
		
		if (idade == 16 || idade == 17 || idade > 70)
		{			
			System.out.println(nome + " Voto Facultativo !!");
		}
		
		if (idade < 16)
		{			
			System.out.println(nome + " Não pode votar !!");
		}

	}

}

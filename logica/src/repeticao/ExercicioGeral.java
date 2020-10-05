package repeticao;

import javax.swing.JOptionPane;

public class ExercicioGeral {

	public static void main(String[] args) {
		int idade = 0;
		String nomePessoa = "";
		int maiorIdade = Integer.MIN_VALUE;
		String nomePessoaMaisVelha = "";
		int menorIdade = Integer.MAX_VALUE;
		String nomePessoaMaisNova = "";
		int qtdeMaiorIdade = 0;
		int somaIdade = 0;
		int qtdeInformado = 0;
		
		do {
			nomePessoa = JOptionPane.showInputDialog("Informe o Nome da Pessoa").toUpperCase();
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade da Pessoa").toUpperCase());
			
			if (idade > maiorIdade)
			{
				maiorIdade = idade;
				nomePessoaMaisVelha = nomePessoa;
			}
			
			if (idade < menorIdade)
			{
				menorIdade = idade;
				nomePessoaMaisNova = nomePessoa;
			}
			
			if (idade >= 18)
			{
				qtdeMaiorIdade++;
			}
			
			somaIdade += idade;
			qtdeInformado++;
			
		} while ((JOptionPane.showInputDialog("Deseja Continuar ? ").toUpperCase().charAt(0)) == 'S');
		
		System.out.println("Pessoa mais Velha é " + nomePessoaMaisVelha + " com " + maiorIdade + " anos" );
		System.out.println("Pessoa mais Nova  é " + nomePessoaMaisNova  + " com " + menorIdade + " anos" );
		System.out.println("Total de pessoas maiores de idade é " + qtdeMaiorIdade);
		System.out.println("A Media das idades informadas é " + (somaIdade / qtdeInformado));
	}

}

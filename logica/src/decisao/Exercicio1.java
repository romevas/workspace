package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		boolean fim = false;
		String nome = "";
		double valorInvestido = 0.0;
		double valorAtual = 0.0;	
		float anosFidelidade = 0;
		String regiao = "";

		while (!fim) {
			nome = JOptionPane.showInputDialog("Informe o Nome do Cliente").toUpperCase();

			if (!nome.isEmpty())
				fim = true;
			else
				System.out.println("Nome do Cliente n�o informado !!");		
		}

		fim = false;
		while (!fim) {
			try 
			{
				valorInvestido = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor Investido"));

				if (!(valorInvestido == 0))
					fim = true;
				else
					System.out.println("Valor Investido deve ser maior que zeros !!");
			}
			catch (Exception ex)
			{
				System.out.println("Valor Investido invalido !!");
			}
		}

		fim = false;
		while (!fim) {
			try 
			{
				anosFidelidade = Float.parseFloat(JOptionPane.showInputDialog("Informe os Anos de Fidelidade"));

				if (!(anosFidelidade == 0.0))
					fim = true;
				else
					System.out.println("Anos de Fidelidade deve ser maior que zeros !!");
			}
			catch (Exception ex)
			{
				System.out.println("Anos de Fidelidade invalido !!");
			}
		}

		fim = false;
		while (!fim) {
			regiao = JOptionPane.showInputDialog("Informe a Regi�o do Cliente").toUpperCase();

			if (!regiao.isEmpty())
				fim = true;
			else
				System.out.println("Regi�o n�o Informada !!");		
		}

		if (regiao.equals("SUL") || regiao.equals("SUDESTE"))
			anosFidelidade = anosFidelidade + (anosFidelidade * (float)0.2);

		if (valorInvestido < 1000) 
			valorAtual = valorInvestido + (valorInvestido * (float)0.015);
		else 
			if (valorInvestido <= 5000) 
				valorAtual = valorInvestido + (valorInvestido * (float)0.02);
			else 
				valorAtual = valorInvestido + (valorInvestido * (float)0.03);

		if (anosFidelidade > 5)
			valorAtual = valorAtual + (valorAtual * (float)0.01);

		System.out.println("Cliente             : " + nome);
		System.out.println("Regi�o              : " + regiao);
		System.out.println("Fidelidade em anos  : " + anosFidelidade);
		System.out.println("Valor investido     : " + valorInvestido);
		System.out.printf ("Valor atual         : %.2f\n", valorAtual);
		System.out.printf ("Diferen�a           : %.2f\n", (valorAtual - valorInvestido));

	}

}

package variaveis;

import javax.swing.JOptionPane;

public class ExemploProduto {

	public static void main(String[] args) {

		String produto = "";
		int quantidade = 0;
		double valor = 0.0;
		boolean fim = false;

		while (!fim)
		{
			produto = JOptionPane.showInputDialog("Informe o nome do produto");
			
			if (!produto.isEmpty())
				fim = true;
			else
				System.out.println("Nome n�o pode ser brancos !!");
		}
		
		fim = false;
		while (!fim)
		{
			try
			{
				quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto"));
				if (quantidade==0)
					throw new Exception("Quantidade Zerada !!");
				fim = true;
			}
			catch (Exception ex)
			{
				System.out.println("Informe uma quantidade valida !! (" + ex.getMessage() + ")");
			}
		}
		
		fim = false;
		while (!fim)
		{
			try
			{
				valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
				if (valor==0.0)
					throw new Exception("Valor Zerado !!");		
				fim = true;
			}
			catch (Exception ex)
			{
				System.out.println("Informe um valor valido !! (" + ex.getMessage() + ")");
			}
		}

		double valorTotal = valor * quantidade;
		System.out.println("Produto                    : " + produto);
		System.out.println("Quantidade                 : " + quantidade);
		System.out.println("Valor Unitario             : " + (valor));
		System.out.println("Valor Unitario c/ Desconto : " + (valor - (valor * 10 / 100)));
		System.out.println("Valor Total                : " + valorTotal);
		System.out.println("Valor Total    c/ Desconto : " + (valorTotal - (valorTotal * 10 / 100)));
			
	}

}

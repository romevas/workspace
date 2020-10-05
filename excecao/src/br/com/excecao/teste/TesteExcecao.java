package br.com.excecao.teste;

public class TesteExcecao {

	public static void main(String[] args) {

		try
		{
			int numero = Integer.parseInt("7");
			System.out.println(numero);
			
			String palavra = "";
			
			System.out.println(palavra.length());
			
			int [] valores = new int[2];
			valores[0] = 511;
			valores[1] = 512;
			valores[2] = 513;
			
		}
		catch (NumberFormatException e)
		{
			System.out.println("Numero Invalido !");
		}
		catch (NullPointerException e)
		{
			System.out.println("Objeto nulo !");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Vetor estourou !");
		}		
		catch (Exception e)
		{
			//e.printStackTrace();
			System.err.println("Excecao Desconhecida !");
		}
		finally
		{
			System.out.println("Fim TRY");
		}
		
	}

}

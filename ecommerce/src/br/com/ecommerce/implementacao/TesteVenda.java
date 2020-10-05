package br.com.ecommerce.implementacao;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import br.com.ecommerce.tela.Magica;

public class TesteVenda {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setAll(
				Magica.i("ID Produto"), 
				Magica.s("Descricao"), 
				Magica.i("Quantidade"), 
				Magica.f("Valor Compra"), 
				Magica.f("Valor Venda"));
		
		Endereco endereco = new Endereco();
		
		endereco.setAll(
				Magica.s("Logradouro"), 
				Magica.s("Bairro"), 
				Magica.s("Cidade"),
				Magica.s("Estado"), 
				Magica.s("Cep"), 
				Magica.s("Numero"), 
				Magica.s("Complemento"));
		
		Cliente cliente = new Cliente();
		
		cliente.setAll(
				Magica.i("ID Cliente"), 
				Magica.s("Nome"), 
				endereco);
		
		Venda venda = new Venda();
		
		venda.setAll(
				Magica.i("Nota Fiscal"), 
				Magica.s("Data"), 
				Magica.i("Total"), 
				produto,
				cliente);
		
		System.out.println(venda.getAll());
	}

}

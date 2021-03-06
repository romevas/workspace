package br.com.ecommerce.implementacao;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import br.com.ecommerce.tela.Magica;

public class ImplementarVendaConstrutor {

	public static void main(String[] args) {
			
		Venda objeto = new Venda(
				Magica.i("Nota Fiscal"),
				Magica.s("Data"),
				Magica.f("Total"),
				new Produto(
						Magica.i("Id Produto"),
						Magica.s("Descricao"),
						Magica.i("Quantidade"),
						Magica.f("Valor Compra"),
						Magica.f("Valor Venda")
						),
				new Cliente(
						Magica.i("Id Cliente"),
						Magica.s("Nome Cliente"),
						new Endereco(
								Magica.s("Logradouro"),
								Magica.s("Bairro"),
								Magica.s("Cidade"),
								Magica.s("Estado"),
								Magica.s("Cep"),
								Magica.s("Numero"),
								Magica.s("Complemento")
								)
						)
				);
		
		System.out.println(objeto.getAll());
	}

}

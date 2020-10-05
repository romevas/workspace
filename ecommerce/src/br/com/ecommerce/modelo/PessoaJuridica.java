package br.com.ecommerce.modelo;

public class PessoaJuridica extends Cliente {
	public String cnpj;
	public String ie;
	public String contato;
	
	public void setAll(int id, String nome, Endereco endereco, String cnpj, String ie, String contato) {
		super.setAll(id, nome, endereco);
		this.cnpj = cnpj;
		this.ie = ie;
		this.contato = contato;
	}
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"CNPJ : " + cnpj + "\n" +
				"IE : " + ie + "\n" +
				"contato : " + contato;
	}
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(int id, String nome, Endereco endereco, String cnpj, String ie, String contato) {
		super(id, nome, endereco);
		this.cnpj = cnpj;
		this.ie = ie;
		this.contato = contato;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}

	
}

package br.com.lojauati.modelo;

public class Elevador {
	private int qtdePessoas;
	private int capacidadePessoas;
	private int andarAtual;
	private int maiorAndar;
	private int menorAndar;

	public Elevador()
	{
		
	}
	public Elevador(int cp, int ma, int me)
	{
		this.capacidadePessoas = cp;
		this.maiorAndar = ma;
		this.menorAndar = me;
	}
	public void preencherMaiorAndar(int pAndar)
	{
		if (pAndar>menorAndar)
			maiorAndar=pAndar;
	}

	public void preencherMenorAndar(int pAndar)
	{
		if (pAndar<maiorAndar)
			menorAndar=pAndar;
	}
	public void preencherCapacidadePessoas(int pessoas)
	{
		if(pessoas>0)
			capacidadePessoas=pessoas;
	}
	public void subir()
	{
		if (andarAtual<maiorAndar)
			andarAtual++;
	}
	public void descer()
	{
		if (andarAtual>menorAndar)
			andarAtual--;
	}
	public void entrar(int entrando)
	{
		if (qtdePessoas+entrando<=capacidadePessoas)
			qtdePessoas += entrando;
	}
	public void sair(int saindo)
	{
		if (saindo<=qtdePessoas)
			qtdePessoas -= saindo;
	}
	public String exibirTudo()
	{ 
		return 
				"Capacidade Maxima  : " + capacidadePessoas + "\n" +
				"Quantidade pessoas : " + qtdePessoas + "\n" +
				"Andar Atual        : " + andarAtual + "\n" +
				"Maior Andar        : " + maiorAndar + "\n" +
				"Menor Andar        : " + menorAndar;				
	}


}

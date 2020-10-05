package br.com.lojauati.modelo;

public class Formula1 {
	private String escuderia;
	private float valor;
	private int rpm;
	
	public void preencherEscuderia(String parametro)
	{
		escuderia = parametro.toUpperCase();
	}
	public void preencherValor(float parametro)
	{
		valor = parametro;
	}
	public void preencherRpm(int parametro)
	{
		rpm = parametro;
	}
	
	public String exibirEscuderia()
	{
		return escuderia;
	}
	
	public float exibirValor()
	{
		return valor;
	}
	
	public int exibirRpm()
	{
		return rpm;
	}
	public void preencherTudo(String escuderia, float valor, int rpm)
	{
		this.escuderia = escuderia.toUpperCase();
		this.valor = valor;
		this.rpm = rpm;
	}
	public Object[] exibirTudo()
	{
		return new Object[] {"Escuderia: " + escuderia, "Valor    : " + valor, "RPM      : " + rpm};
	}
	public float exibirPromocao()
	{
		return this.valor - this.valor * (float)0.01;
	}
	public float exibirPromocao(float desconto)
	{
		return this.valor - this.valor * (desconto / 100);
	}

}

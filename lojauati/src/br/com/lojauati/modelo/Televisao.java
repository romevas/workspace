package br.com.lojauati.modelo;

public class Televisao {
	private int canal;
	private boolean status;
	private int volume;

	public Televisao()
	{
		status = false;
		canal = 0;
		volume = 0;
	}
	public void aumentarVolume()
	{
		if (status)
		volume++;
	}
	public void diminuirVolume()
	{
		if (status && volume>0)
			volume--;
	}
	public void mudarCanal(int numero)
	{ 
		if (status && canal!=numero)
			canal = numero;
	}
	public void ligar()
	{
		if (!status)
			status=true;
	}
	public void desligar()
	{
		if (status)
			status=false;
	}
	public String exibirStatus()
	{
		return String.valueOf(status);
	}
	public String exibirTudo()
	{ 
		return 
				"Status : " + statusTv(status) + "\n" +
				"Canal  : " + canal + "\n" +
				"Volume : " + volume;
	}
	private String statusTv(boolean status)
	{
		if (status)
			return "LIGADA";
		else
			return "DESLIGADA";
	}


}

package Bancos;

public class contaEspecial extends contaCorrente
{
	private double valorLimite;

	
	//encapsulamento
	
	public contaEspecial(int numeroConta, double valorLimite) {
		super(numeroConta);
		this.valorLimite = valorLimite;
	}

	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	
	
}
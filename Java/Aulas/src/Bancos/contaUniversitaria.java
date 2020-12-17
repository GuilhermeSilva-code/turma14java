package Bancos;

public class contaUniversitaria extends contaEspecial
{
	private double emprestimoUniversitario;

	
	//construtor
	public contaUniversitaria(int numeroConta, double valorLimite, double emprestimoUniversitario) {
		super(numeroConta, valorLimite);
		this.emprestimoUniversitario = emprestimoUniversitario;
	}

	//encapsulamento - getters and setters
	
	public double getEmprestimoUniversitario() {
		return emprestimoUniversitario;
	}

	public void setEmprestimoUniversitario(double emprestimoUniversitario) {
		this.emprestimoUniversitario = emprestimoUniversitario;
	}
	
	
	
}
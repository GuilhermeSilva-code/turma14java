package Bancos;

public class contaCorrente extends Conta 
{
	public int numeroTalaoCheque;

	
	//construtor
	public contaCorrente(int numeroConta) {
		super(numeroConta);
	}
	public contaCorrente(int numeroConta, String cpf) {
		super(numeroConta, cpf);
	}

	//ENCAPSULAMENTO
	
	public int getNumeroTalaoCheque() {
		return numeroTalaoCheque;
	}

	public void setNumeroTalaoCheque(int numeroTalaoCheque) {
		this.numeroTalaoCheque = numeroTalaoCheque;
	}
	public void credito(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
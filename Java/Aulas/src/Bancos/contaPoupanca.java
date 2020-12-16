package Bancos;
public class contaPoupanca  extends Conta{
	private int dataAniversarioConta;
	
	
	//Cnstrutor
	public contaPoupanca(int numeroConta, String cpf, int dataAniversarioConta) {
		super(numeroConta, cpf);
		this.dataAniversarioConta = dataAniversarioConta;
	}
	//encapsulamento
	public int getDataAniversarioConta() {
		return dataAniversarioConta;
	}

	public void setDataAniversarioConta(int dataAniversarioConta) {
		this.dataAniversarioConta = dataAniversarioConta;
	}
	public void trocarNumero(int i) {
		// TODO Auto-generated method stub
		
	}
	public String getNumeroConta() {
		// TODO Auto-generated method stub
		return null;
	}
	public void correcaoPoupanca(int i) {
		// TODO Auto-generated method stub
		
	}
	public void credito(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
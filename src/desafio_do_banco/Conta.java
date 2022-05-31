package desafio_do_banco;

public abstract class Conta implements Iconta{
	
	private final static int AGENCIA_PADRAO = 1;
	
	private static int SEQUENCIAL = 1;
	
	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	

	public void sacar() {}
	
	public void depositar() {}
	
	public void transferir() {}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		 saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void extrairInfosComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero : %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
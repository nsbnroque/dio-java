package desafio_do_banco;

public interface Iconta {
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();

}

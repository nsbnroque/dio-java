package desafio_do_banco;

public class ContaPoupanca extends Conta {

	@Override
	public void imprimirExtrato() {
		System.out.println("==== Extrato Conta Poupança===");
		super.extrairInfosComuns();

		
	}



}

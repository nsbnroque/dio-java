package desafio_do_banco;

public class ContaCorrente extends Conta {

	@Override
	public void imprimirExtrato() {
		System.out.println("==== Extrato Conta Corrente===");
		super.extrairInfosComuns();

		
	}
	

}

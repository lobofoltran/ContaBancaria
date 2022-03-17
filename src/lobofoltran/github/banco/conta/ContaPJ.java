package lobofoltran.github.banco.conta;

public class ContaPJ extends ContaBancaria {

	public ContaPJ (String nome, Double saldo, String numero, String tipo) {
		super(nome, saldo, numero, tipo);
	}
	
	@Override
	public void depositar (Double valor) {
		Double desconto = (valor * 2) / 100;
		Double saldo = getSaldo();
		saldo += (valor - desconto);
		setSaldo(saldo);
	}
	
	@Override
	public void sacar (Double valor) {
		Double saldo = getSaldo();
		saldo = saldo - valor;
		setSaldo(saldo);
	}	

}

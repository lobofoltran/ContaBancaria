package lobofoltran.github.banco.conta;

public class ContaPJ extends ContaBancaria {

	public ContaPJ (String nome, Double saldo, String numero, String tipoconta) {
		super(nome, saldo, numero, tipoconta);
	}
	
	public void depositar (Double valor) {
		Double desconto = 0.00;
		desconto = (valor * 1) / 100;
		Double saldo = valor - desconto;
		setSaldo(saldo);
		this.setSaldo(valor);
		super.depositar(valor);
		return;
	}
	
	public void sacar (Double valor) {
		Double saldo = valor;
		this.setSaldo(saldo);
		super.sacar(valor);
		return;
	}	

}

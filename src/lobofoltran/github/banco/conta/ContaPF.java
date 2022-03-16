package lobofoltran.github.banco.conta;

public class ContaPF extends ContaBancaria {

	private Integer saquesDisponiveis = 0;
		
	public ContaPF (String nome, Double saldo, String numero, String tipoconta) {
		super(nome, saldo, numero, tipoconta);
	}

	public void depositar (Double valor) {
		Double desconto = 0.00;
		desconto = (valor * 1) / 100;
		Double saldo = valor - desconto;
		setSaldo(saldo);
		return;
	}
	
	@Override
	public void sacar (Double valor) {
		
		if (valor > this.getSaldo()) {
			System.err.println("Conta PF não pode ficar com saldo negativo!");
			return;
		}
		saquesDisponiveis++;
		if (this.saquesDisponiveis > 3) {
			Double taxa = 0.01;
			Double desconto = valor * taxa;
			Double saldo = valor + desconto;
			this.setSaldo(saldo);
			return;
		}
	
		super.sacar(valor);
	}
}

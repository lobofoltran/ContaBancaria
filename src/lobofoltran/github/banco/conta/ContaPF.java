package lobofoltran.github.banco.conta;

public class ContaPF extends ContaBancaria {

	private Integer saquesDisponiveis = 0;
		
	public ContaPF (String nome, Double saldo, String numero, String tipo) {
		super(nome, saldo, numero, tipo);
	}

	@Override
	public void depositar (Double valor) {
		Double desconto = (valor * 1) / 100;
		Double saldo = getSaldo();
		saldo += (valor - desconto);
		setSaldo(saldo);
	}
	
	@Override
	public void sacar (Double valor) {
		Double desconto = 0.00;
		if (valor > getSaldo()) {
			System.err.println("Conta PF não pode ficar com saldo negativo!");
			return;
		}
		saquesDisponiveis++;
		if (this.saquesDisponiveis > 3) {
			desconto = (valor * 1) / 100;
		}
		Double saldo = getSaldo();
		saldo = saldo - (valor - desconto);
		setSaldo(saldo);
	}
}

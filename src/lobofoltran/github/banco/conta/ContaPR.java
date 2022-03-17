package lobofoltran.github.banco.conta;

public class ContaPR extends ContaBancaria {

	private Integer saquesDisponiveis = 0;
	
	public ContaPR (String nome, Double saldo, String numero, String tipo, String porte) {
		super(nome, saldo, numero, tipo);
		this.porte = porte;
	}

	@Override
	public void depositar (Double valor) {
		Double desconto = 0.00;
		if (valor < 1000) {
			desconto = (valor * 0.8) / 100;
		} 
		Double saldo = getSaldo();
		saldo += (valor - desconto);
		setSaldo(saldo);
	}
	
	@Override
	public void sacar (Double valor) {
		Double desconto = 0.00;
		if (valor > getSaldo()) {
			System.out.println("Conta PR não pode ficar com saldo negativo!");
			return;
		}
		saquesDisponiveis++;
		if (this.saquesDisponiveis > 3) {
			desconto = (valor * 1.5) / 100; 
		}
		Double saldo = getSaldo();
		saldo = saldo - (valor - desconto);
		setSaldo(saldo);
		return;
	}

}

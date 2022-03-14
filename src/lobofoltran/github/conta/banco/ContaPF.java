package lobofoltran.github.conta.banco;

public class ContaPF extends ContaBancaria {

	public ContaPF(String nome, Double saldo, String numero, String tipoconta) {
		super();
		this.nome = nome;
		this.saldo = saldo;
		this.numero = numero;
		this.tipoconta = tipoconta;
	}

	public Double depositar (Double valor) {
		this.valor = valor;
		Double desconto = 0.00;
		desconto = (valor * 1) / 100;
		saldo = (saldo + valor) - desconto;
		return saldo;
	}
	
	public Double sacar (Double valor) {
		this.valor = valor;
		Double desconto = 0.00;
		if (this.valor > saldo) {
			System.out.println("Conta PF não pode ficar com saldo negativo!");
			return saldo + conta;
		}
		conta++;
		if (this.conta > 3) {
			desconto = (valor * 1) / 100; 
		}
		saldo = (saldo - valor) - desconto;
		return saldo + conta;
	}
	
}

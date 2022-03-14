package lobofoltran.github.conta.banco;

public class ContaPJ extends ContaBancaria {
	
	public ContaPJ(String nome, Double saldo, String numero, String tipoconta) {
		super();
		this.nome = nome;
		this.saldo = saldo;
		this.numero = numero;
		this.tipoconta = tipoconta;
	}
	
	public Double depositar (Double valor) {
		this.valor = valor;
		Double desconto = 0.00;
		desconto = (valor * 2) / 100;
		saldo = (saldo + valor) - desconto;
		return saldo;
	}
	
	public Double sacar (Double valor) {
		this.valor = valor;
		saldo = saldo - valor;
		return saldo;
	}	
	
}

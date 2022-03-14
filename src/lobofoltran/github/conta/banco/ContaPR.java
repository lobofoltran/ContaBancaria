package lobofoltran.github.conta.banco;

public class ContaPR extends ContaBancaria {

	public ContaPR(String nome, Double saldo, String numero, String tipoconta, String porte) {
		super();
		this.nome = nome;
		this.saldo = saldo;
		this.numero = numero;
		this.tipoconta = tipoconta;
		this.porte = porte;
	}

	public Double depositar (Double valor) {
		this.valor = valor;
		Double desconto = 0.00;
		if (valor < 1000) {
			desconto = (valor * 0.8) / 100;
		} 
		saldo += valor - desconto;
		return saldo;
	}
	
	public Double sacar (Double valor) {
		this.valor = valor;
		Double desconto = 0.00;
		if (this.valor > saldo) {
			System.out.println("Conta PR não pode ficar com saldo negativo!");
			return saldo + conta;
		}
		conta++;
		if (this.conta > 3) {
			desconto = (valor * 1.5) / 100; 
		}
		saldo = (saldo - valor) - desconto;
		return saldo + conta;
	}
	
}

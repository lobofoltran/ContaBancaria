package lobofoltran.com.github.atividade.banco;

public class Conta {
	
	String nome;
	Double saldo;
	String numero;
	String tipoconta;
	Double valor;
	Integer conta = 0;
	
	public Conta(String nome, Double saldo, String numero, String tipoconta) {
		this.nome = nome;
		this.saldo = saldo;
		this.numero = numero;
		this.tipoconta = tipoconta;
	}
	
	public Double depositar(Double valor) {
		this.valor = valor;
		Double desconto = 0.00;
		if (this.tipoconta.equals("PJ")) {
			desconto = (valor*2)/100;
			saldo = (saldo + valor) - desconto;
			return saldo;
		} else {
			desconto = (valor*1)/100;
			saldo = (saldo + valor) - desconto;
			return saldo;
		}
	}
	
	public Double sacar(Double valor) {
		this.valor = valor;
		Double desconto = 0.00;
		if (this.tipoconta.equals("PF")) {
			if (valor > saldo) {
				System.out.println("Conta PF não pode ficar com saldo negativo!");
				return saldo + conta;
			}
			conta++;
			if (conta > 3) {
				desconto = (valor*1)/100; 
				saldo = (saldo - valor) - desconto;
				return saldo + conta;
			} else {
				saldo = (saldo - valor);
				return saldo + conta;
			}
		} else {
			conta++;
			if (this.conta > 3) {
				desconto = (valor*2)/100; 
				saldo = (saldo - valor) - desconto;
				return saldo + conta;
			} else {
				saldo = (saldo - valor);
				return saldo + conta;
			}
		}
	}
	
	public void dados() {
		System.out.println("Nome: " + nome);
		System.out.println("Saldo: " + saldo);
		System.out.println("Numero: " + numero);
		System.out.println("Tipo conta: " + tipoconta);
		
	}
}

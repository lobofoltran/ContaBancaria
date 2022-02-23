package lobofoltran.com.github.atividade.banco;

public class Conta {
	
	String nome;
	Double saldo;
	String numero;
	String tipoconta;
	Double valor;
	
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
			System.out.println("Entrou na validação 1");
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
		
		if (this.tipoconta == "PJ") {
			return saldo = (saldo - valor);
		} else {
			return saldo = (saldo - valor);
		}
		
	}
}

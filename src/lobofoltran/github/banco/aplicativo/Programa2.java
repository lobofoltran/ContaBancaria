package lobofoltran.github.banco.aplicativo;

import lobofoltran.github.banco.conta.ContaBancaria;
import lobofoltran.github.banco.conta.ContaPJ;

public class Programa2 {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaPJ("João da Silva", 800.00, "123456", "PJ");
		
		conta1.depositar(100.0); // a classe deve ter seu saldo para 900.00
		System.out.println("===========================");
		System.out.println("Deposito");
		System.out.println("===========================");
		conta1.detalhes();
		
		conta1.sacar(100.0); // a classe deve ter seu saldo para 800.00
		System.out.println("===========================");
		System.out.println("Saque 1");
		System.out.println("===========================");
		conta1.detalhes();
		
		conta1.sacar(100.0); // a classe deve ter seu saldo para 700.00
		System.out.println("===========================");
		System.out.println("Saque 2");
		System.out.println("===========================");
		conta1.detalhes();
		
		conta1.sacar(500.0); // a classe deve ter seu saldo para 200.00
		System.out.println("===========================");
		System.out.println("Saque 3");
		System.out.println("===========================");
		conta1.detalhes();
		
		conta1.sacar(100.0); // a classe deve ter seu saldo para 100.00
		System.out.println("===========================");
		System.out.println("Saque 4");
		System.out.println("===========================");
		conta1.detalhes();
	}

}

package lobofoltran.github.banco.aplicativo;

import lobofoltran.github.banco.conta.*;

public class Programa1 {
	
	public static void main(String args[]) {
		ContaBancaria conta1 = new ContaPF("João da Silva", 800.00, "123456", "PF");
		
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

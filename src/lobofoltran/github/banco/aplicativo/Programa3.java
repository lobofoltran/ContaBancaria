package lobofoltran.github.banco.aplicativo;

import lobofoltran.github.banco.conta.ContaBancaria;
// import lobofoltran.github.banco.conta.ContaPJ;
import lobofoltran.github.banco.conta.ContaPF;
// import lobofoltran.github.banco.conta.ContaPR;

public class Programa3 {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaPF("João da Silva", 800.00, "123456", "PJ");
		
		conta1.depositar(100.0);
		System.out.println("Deposito");
		System.out.println();
		conta1.detalhes();
		
		conta1.sacar(100.0);
		System.out.println();
		System.out.println("Saque 1");
		System.out.println();
		conta1.detalhes();
		
		conta1.sacar(100.0);
		System.out.println();
		System.out.println("Saque 2");
		System.out.println();
		conta1.detalhes();
		
		conta1.sacar(100.0);
		System.out.println();
		System.out.println("Saque 3");
		System.out.println();
		conta1.detalhes();
		
		conta1.sacar(100.0);
		System.out.println();
		System.out.println("Saque 4");
		System.out.println();
		conta1.detalhes();
	}

}

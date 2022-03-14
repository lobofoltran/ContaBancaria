package lobofoltran.github.conta.banco;

public class Aplicacao {

	public static void main(String[] args) {
		ContaPJ conta1 = new ContaPJ("Gustavo Lobo", 1000.00, "123456", "PJ");
		ContaPF conta2 = new ContaPF("Gustavo Lobo", 1000.00, "123456", "PF");
		ContaPR conta3 = new ContaPR("Gustavo Lobo", 1000.00, "123456", "PR", "Grande");
				
		System.out.println();
		conta1.verDados();
		System.out.println();
		conta2.verDados();
		System.out.println();
		conta3.verDados();
		System.out.println();

		conta1.sacar(100.0);
		conta1.verSaldo();

		conta1.depositar(100.0);
		conta1.verSaldo();
				
	}

}

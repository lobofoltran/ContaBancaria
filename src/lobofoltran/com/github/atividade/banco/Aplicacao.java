package lobofoltran.com.github.atividade.banco;

public class Aplicacao {

	public static void main(String[] args) {
		Conta conta1 = new Conta("Gustavo Lobo", 500.00, "123456", "PF");
		
		// exemplos 3 funções
		conta1.dados();
		
		conta1.sacar(100.0);
		System.out.println("Novo saldo: " + conta1.saldo);
		
		conta1.depositar(100.0);
		System.out.println("Novo saldo: " + conta1.saldo);
		
	}

}

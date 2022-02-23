package lobofoltran.com.github.atividade.banco;

public class Aplicacao {

	public static void main(String[] args) {
		Conta conta1 = new Conta("João da Silva", 100.00, "123456", "PJ");
		System.out.println(conta1.saldo);
		
		conta1.depositar(100.0);
		System.out.println(conta1.saldo);
		
		conta1.sacar(100.0);
		System.out.println(conta1.saldo);
	}

}

package lobofoltran.github.banco.aplicativo;

import lobofoltran.github.banco.conta.*;

public class Programa3 {

	public static void main(String[] args) {
		
//		ContaBancaria classeMae = new ContaBancaria("João da Silva", 789.99, "123456", "PJ");
//		classeMae.teste();
		
		ContaBancaria conta1 = new ContaPJ("João da Silva", 800.00, "123456", "PJ");
		
		conta1.sacar(80.00);
		conta1.detalhes();
		
	}

}

package lobofoltran.github.conta.banco;

public class ContaBancaria {
		
		protected String nome;
		protected Double saldo;
		protected String numero;
		protected String tipoconta;
		protected String porte;
		protected Double valor;
		protected Integer conta = 0;
				
		public void verDados() {
			System.out.println("Nome: " + nome);
			System.out.println("Saldo: " + saldo);
			System.out.println("Numero: " + numero);
			System.out.println("Tipo conta: " + tipoconta);
			if (porte != null) {
				System.out.println("Porte: " + porte);
			}
		}
		
		public void verSaldo() {
			System.out.println("Saldo de " + nome + ": " + saldo);
		}


}

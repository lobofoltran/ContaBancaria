<p align="center">
    <img alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
    <img alt="Eclipse" src="https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white"/>
</p>

## Exercício Java - Programação I: 

Desenvolva uma classe que represente uma conta de banco, cada objeto criado a partir desta classe deverá ter os seguintes campos:
- Nome do titular
- Saldo da conta
- Número da conta
- Tipo da Conta (PJ ou PF)

Esta classe deverá ter um método que permita depositar valores (receberá como parâmetro um Double) e também um método que poderá sacar valores (receberá como parâmetro um Double).

Depois criar uma classe Programa onde terá o método main, para executar esta classe. 

Crie dois objetos da conta e “brinque” com os métodos de sacar e depositar.

## Exemplos: 

- Conta conta1 = new Conta("João da Silva", 789.99, "123456", "PF");
- conta1.depositar(100.00); // A classe deve ter seu saldo para 889.99
- conta1.sacar(500.00); // A classe deve ter seu saldo para 399.99

// Dica: Para imprimir o valor do saldo utilize System.out.println(conta1.saldo);

## Regras que devem existir dentro da aplicação: 

- Ao depositar um valor em uma conta PJ, deve ser cobrado 2% do valor, isto é se for depositado 100 deve somar 98 no saldo. 
- Ao depositar um valor em uma conta PF, deve ser cobrado 1% do valor, isto é se for depositado 100 deve somar 99 no saldo. 
- A conta do tipo PJ pode sacar um valor maior que o saldo existente e pode ficar com saldo negativo.
- A conta do tipo PF não pode liberar um saque que deixe o saldo negativo, isto é, se o saque zerar a conta pode, só não pode deixar o saldo menor que zero. 
- As contas tem uma limitação de três saques por instancia, ou seja se criar um objeto conta e executar quatro vezes o método sacar, na quarta em diante deve ser cobrado uma taxa, sendo 2% para PJ e 1% para PF. Exemplo conta PF tem um saldo de 100 reais após 3 saques, em um quarto saque no valor de 100 reais o retorno deve ser 99, pois 1 real foi cobrado de taxa. 

## Realização, dificuldades e conclusão:

- Tive dificuldade ao criar a regra de limite de três saques, depois que entendi e comecei a utilizar ela como um objeto, foi fácil.
- Códigos (Aplicacao.java):

```ruby
package lobofoltran.com.github.atividade.banco;

public class Aplicacao {

	public static void main(String[] args) {
		Conta conta1 = new Conta("Gustavo Lobo", 500.00, "123456", "PF");
		conta1.dados();
		
		conta1.sacar(100.0);
		System.out.println("Novo saldo: " + conta1.saldo);
		
		conta1.depositar(100.0);
		System.out.println("Novo saldo: " + conta1.saldo);
		
	}

}
```

- Códigos (Conta.java):


```ruby
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
```

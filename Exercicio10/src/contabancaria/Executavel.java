package contabancaria;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ContaCorrente  cc1 = new ContaCorrente("Lucas", 1235, 0);

		cc1.depositar(100);
		System.out.println("Depositado realizado - Conta Corrente");
		System.out.println("Saldo: " + cc1.getSaldo());
		cc1.sacar(50);
		System.out.println("Saque realizado");
		System.out.println("Saldo: " + cc1.getSaldo());
		System.out.println("------------------------------------");
		
		
		ContaPoupanca cp1 = new ContaPoupanca("Lucas", 1235, 500, 0);
		
		cp1.depositar(100);
		System.out.println("Depositado realizado - Conta Poupança");
		System.out.println("Saldo: " + cp1.getSaldo());
		cp1.sacar(60);
		System.out.println("Saque realizado");
		System.out.println("Saldo: " + cp1.getSaldo());
		System.out.println("------------------------------------");

	}

}

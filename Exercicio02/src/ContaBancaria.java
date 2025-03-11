
public class ContaBancaria {

	private String titular;
	private double saldo;
	private String numeroConta;
	

public ContaBancaria(String titular, double saldo, String numeroConta) {
	this.titular = titular;
	this.saldo = saldo;
	this.numeroConta = numeroConta;
	
}


public String getTitular() {
	return titular;
}


public void setTitular(String titular) {
	this.titular = titular;
}


public double getSaldo() {
	return saldo;
}


public void setSaldo(double saldo) {
	this.saldo = saldo;
}


public String getNumeroConta() {
	return numeroConta;
}


public void setNumeroConta(String numeroConta) {
	this.numeroConta = numeroConta;
}

public void depositar(double deposito) {
	saldo = saldo + deposito;
}

public void sacar(double saque) {
	if(saldo < saque || saldo <= 0) {
		System.out.println("Saldo insuficiente");
	} else {
		saldo = saldo - saque;
	}
}

}

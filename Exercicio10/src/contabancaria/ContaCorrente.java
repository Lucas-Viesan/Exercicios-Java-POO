package contabancaria;

public class ContaCorrente extends ContaBancaria {
	private String titular;
	private int conta;
	private double saldo;
	
public ContaCorrente(String titular, int conta, double saldo) {
	this.titular = titular;
	this.conta = conta;
	this.saldo = saldo;
}

public String getTitular() {
	return titular;
}

public void setTitular(String titular) {
	this.titular = titular;
}

public int getConta() {
	return conta;
}

public void setConta(int conta) {
	this.conta = conta;
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

@Override
public void depositar(double valor) {
	saldo = saldo + valor;
}

@Override
public void sacar(double valor) {
	saldo = saldo - valor;
}

	

}

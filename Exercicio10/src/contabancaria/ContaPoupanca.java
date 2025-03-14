package contabancaria;

public class ContaPoupanca extends ContaBancaria {
	private String titular;
	private int conta;
	private int complemento;
	private double saldo;
	
public ContaPoupanca(String titular, int conta, int complemento , double saldo) {
		this.titular = titular;
		this.conta = conta;
		this.saldo = saldo;
		this.complemento = complemento;
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

public int getComplemento() {
	return complemento;
}

public void setComplemento(int complemento) {
	this.complemento = complemento;
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

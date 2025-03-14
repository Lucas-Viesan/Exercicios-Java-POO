package funcionario;

public class Funcionario {
	protected double salario;
	protected double encargos;
	
public Funcionario (double salario, double encargos) {
	this.salario = salario;
	this.encargos = encargos;
}



public double getSalario() {
	return salario;
}



public void setSalario(double salario) {
	this.salario = salario;
}



public double getEncargos() {
	return encargos;
}



public void setEncargos(double encargos) {
	this.encargos = encargos;
}



public double calcularSalario() {
	double valorBase = this.salario - this.encargos;
	return valorBase;
	
}
	
}

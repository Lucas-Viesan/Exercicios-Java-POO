package funcionario;



public class Gerente extends Funcionario{
	
	private double bonus;
	
	public Gerente(double salario, double encargos, double bonus) {
		super(salario, encargos);
		this.bonus = bonus;
	}
	
    @Override
    public double calcularSalario() {
    	double valorBase = (salario + bonus) - encargos;
    	return valorBase;
    }

}

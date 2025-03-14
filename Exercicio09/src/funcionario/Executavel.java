package funcionario;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario f1 = new Funcionario(2850.87, 320.25);
		Gerente g1 = new Gerente(3520.0, 410.0, 600.50);
		
		System.out.println("Salario do funcionario: ");
		System.out.println(f1.calcularSalario());
		System.out.println("-------------------------");
		System.out.println("Salario do gerente: ");
		System.out.println(g1.calcularSalario()	); 
	}

}

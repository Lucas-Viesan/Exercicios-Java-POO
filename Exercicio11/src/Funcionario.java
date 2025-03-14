
public class Funcionario implements Pagavel {

	 private String nome;
	    private double salario;

	    public Funcionario(String nome, double salario) {
	        this.nome = nome;
	        this.salario = salario;
	    }

	    @Override
	    public void pagar() {
	        System.out.println("Pagamento do funcionário " + nome + " no valor de R$ " + salario);
	    }
	
}

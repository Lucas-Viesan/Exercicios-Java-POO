import java.util.ArrayList;
import java.util.List;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pagavel> pagamentos = new ArrayList<>();
        // A lista List<Pagavel> não é uma lista de interfaces, mas sim uma lista que aceita qualquer objeto que implemente a interface Pagavel.
        
        pagamentos.add(new Funcionario("Lucas", 3500.00));
        pagamentos.add(new Fornecedor("Tech Solutions", 5000.00));
        pagamentos.add(new Funcionario("Ana", 4200.00));
        pagamentos.add(new Fornecedor("Office Supplies", 1200.00));

      
        for (Pagavel pagavel : pagamentos) {
            pagavel.pagar();
        }
	}

}

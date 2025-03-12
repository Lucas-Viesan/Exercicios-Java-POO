import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try(Scanner scan = new Scanner(System.in)) {
		String nome;
		double preco, desconto, percentual;
		int quantidade;
		
		System.out.println("Nome do produto: ");
		nome = scan.next();
		System.out.println("Preço do produto: ");
		preco = scan.nextDouble();
		System.out.println("Quantidade: ");
		quantidade = scan.nextInt();
		System.out.println("Percental de desconto: ");
		desconto = scan.nextDouble();
		
		Produto produto1 = new Produto(nome, preco, quantidade);
		
		percentual = desconto / 100;
		
		produto1.aplicarDesconto(percentual);
		System.out.println("O valor do produto com desconto: " + produto1.getPreco());
		
		if(quantidade > 1) {
			System.out.println("O valor total dos " + quantidade + " produtos: " + produto1.valorTotal());
		} else {
			System.out.print("Finalizada compra");
		}
	}
	
	
		
	}

}

import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner scan =  new Scanner(System.in)) {
		 String titulo, autor;
		 int seletor;
		 boolean disponivel, valido;
		 
		 System.out.println("Nome do Livro: ");
		 titulo = scan.next(); 
		 System.out.println("Nome do Autor: ");
		 autor = scan.next();
		 disponivel = true;
		 System.out.println(titulo + " está disponível: " + disponivel);
		 
		 Livro livro1 = new Livro(titulo, autor, disponivel);
		
		 while(true) {
		 System.out.println("Selecione uma opção");
		 System.out.println("1- Emprestar ");
		 System.out.println("2- Devolver  ");
		 System.out.println("3- Checar disponilidade ");
		 System.out.println("4- sair");
		 seletor = scan.nextInt();
		 
		 switch(seletor) {
		 case 1:
			 valido = livro1.isDisponivel();
			 if(valido == true) {
				 livro1.emprestar(valido);
				 System.out.println("Empréstimo realizado");
			 }else {
				 System.out.println("Empréstimo indisponivel no momento");
			 }
			 break;
		 case 2:
			 valido = livro1.isDisponivel();
			 if(valido == false) {
				 livro1.devolver(valido);
				 System.out.println("Empréstimo devolvido");
			 }else {
				 System.out.println("Você não tem livros para devolução");
			 }
			 break;
			 
		 case 3: 
			 System.out.println(livro1.getTitulo() + " está disponível: " + livro1.isDisponivel());
			 break;
			 
		 case 4: 
			 System.out.println("Saindo...");
			 return;
			 
			 default:
                 System.out.println("Opção inválida! Escolha uma opção entre 1 e 4."); 
		 }
		 
		 }
		 
		 
		}

	}

}

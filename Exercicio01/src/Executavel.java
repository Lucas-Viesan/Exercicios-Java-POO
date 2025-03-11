import java.util.Scanner;


public class Executavel {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {  // O Scanner será fechado automaticamente
            System.out.print("Digite seu nome: ");
            String nome = scan.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = scan.nextInt();

            Pessoa p1 = new Pessoa(nome, idade);
            p1.dizerOla();
        }  // Aqui o Scanner é fechado automaticamente
    }
}


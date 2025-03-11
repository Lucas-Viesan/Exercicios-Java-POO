import java.util.Scanner;

public class Executavel {

    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            String titular, numeroConta;
            int saldo = 0, seletor;
            double valor;
            
            System.out.println("Titular: ");
            titular = scan.next();
            System.out.println("Número da conta: ");
            numeroConta = scan.next();

            ContaBancaria c1 = new ContaBancaria(titular, saldo, numeroConta);
            
            
            while (true) {
                System.out.println("======================================");
                System.out.println(" Selecione a opção desejada");
                System.out.println(" 1- Depositar ");
                System.out.println(" 2- Sacar ");
                System.out.println(" 3- Consultar saldo ");
                System.out.println(" 4- Sair ");

                seletor = scan.nextInt();

                switch (seletor) {
                    case 1:
                        System.out.println("Valor do depósito: ");
                        valor = scan.nextDouble();
                        c1.depositar(valor);
                        break;

                    case 2:
                        System.out.println("Valor do saque: ");
                        valor = scan.nextDouble();
                        c1.sacar(valor);
                        break;

                    case 3:
                        System.out.println("Seu saldo é: " + c1.getSaldo() + " reais");
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


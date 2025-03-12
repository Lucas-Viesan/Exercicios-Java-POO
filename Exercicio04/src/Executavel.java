import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner scan = new Scanner(System.in)) {
	       String marca, modelo;
	       int velocidadeAtual = 0, incremento = 1, decremento = 1, seletor;
	       
	       System.out.println("Marca do carro: ");
	       marca = scan.next();
	       System.out.print("Modelo do carro: ");
	       modelo = scan.next();
	       
	       Carro carro1 = new Carro(marca, modelo, velocidadeAtual);
	       
	       while(true) {
	    	   System.out.println("======================================");
               System.out.println(" Selecione a opção desejada");
               System.out.println(" 1- Acelerar ");
               System.out.println(" 2- Frear ");
               System.out.println(" 3- Sair ");
               
               seletor = scan.nextInt();

               switch (seletor) {
                   case 1:
                       carro1.acelerar(incremento);
                       System.out.println("Velocidade: " + carro1.getVelocidadeAtual() + " km/h");
                       break;

                   case 2:
                       carro1.frear(decremento);
                       System.out.println("Velocidade: " + carro1.getVelocidadeAtual() + " km/h");
                       break;
                   case 3:
                       System.out.println("Saindo...");
                       return; 
                   default:
                       System.out.println("Opção inválida! Escolha uma opção entre 1 e 3.");
               }
	       }
	       
	       
		}

	}
}

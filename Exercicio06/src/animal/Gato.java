package animal;


public class Gato extends Animal{

public Gato(String nome, int idade) {
	super(nome, idade);
}

	@Override
	protected void fazerSom() {
		System.out.println("Miau! Miau!");
	}
	
}

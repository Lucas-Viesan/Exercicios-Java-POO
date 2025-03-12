package animal;

public class Cachorro extends Animal{
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	protected void fazerSom() {
		System.out.println("Au! Au! Au!");
	}
	
}

package veiculo;

public class Carro extends Veiculo{
    private int numeroDePortas;
	
	public Carro (String marca, String modelo, int numeroDePortas) {
		super(marca, modelo);
		this.numeroDePortas = numeroDePortas;
	}

	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}
	
	@Override
	public void visualizar() {
		System.out.println("Dados do Carro");
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Nº de portas: " + numeroDePortas);
		
	}
}

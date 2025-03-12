package veiculo;

public class Veiculo {
	protected String marca;
	protected String modelo;
	
public Veiculo(String marca, String modelo) {
	this.marca = marca;
	this.modelo = modelo;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public void visualizar() {
	System.out.println("Dados do veículo");
	System.out.println("Marca: " + marca);
	System.out.println("Modelo: " + modelo);
}
	
}

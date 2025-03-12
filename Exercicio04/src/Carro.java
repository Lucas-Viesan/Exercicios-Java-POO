
public class Carro {
	private String marca;
	private String modelo;
	private int velocidadeAtual;
	

public Carro (String marca, String modelo, int velocidadeAtual) {
	this.marca = marca;
	this.modelo = modelo;
	this.velocidadeAtual = velocidadeAtual;
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


public int getVelocidadeAtual() {
	return velocidadeAtual;
}


public void setVelocidadeAtual(int velocidadeAtual) {
	this.velocidadeAtual = velocidadeAtual;
}

public void acelerar(int incremento) {
	velocidadeAtual = velocidadeAtual + incremento;
}

public void frear(int decremento) {
	if(!(velocidadeAtual <= 0)) {
		velocidadeAtual = velocidadeAtual - decremento;
	}
	
}


}

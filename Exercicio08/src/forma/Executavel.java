package forma;

import java.util.ArrayList;
import java.util.List;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Forma> formas = new ArrayList<>();


        formas.add(new Quadrado(4));  
        formas.add(new Circulo(3));   
        formas.add(new Quadrado(5)); 
        formas.add(new Circulo(2));   

        
        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
	}

}

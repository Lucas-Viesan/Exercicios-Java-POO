
public class Fornecedor implements Pagavel {
	private String empresa;
    private double valorFatura;

    public Fornecedor(String empresa, double valorFatura) {
        this.empresa = empresa;
        this.valorFatura = valorFatura;
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento ao fornecedor " + empresa + " no valor de R$ " + valorFatura);
}

}

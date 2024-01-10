public class Pedido {

	private int idPedido;
	private Cliente c1;
	private float valor;
	
	//métodos Públicos
	
	public void nota(Cliente cliente) {
		this.c1 = cliente;
		System.out.println("Id: " + this.getIdPedido());
		System.out.println("Cliente: " + this.getC1());
		System.out.println("Valor da compra: " + this.getValor());
	}


	//métodos especiais
	
	public Pedido(int idPedido, float valor) {
		this.idPedido = idPedido;
		this.valor = valor;
	}
	
	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Cliente getC1() {
		return c1;
	}

	public void setC1(Cliente c1) {
		this.c1 = c1;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
}

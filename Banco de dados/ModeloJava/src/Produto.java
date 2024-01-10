
public class Produto {

	protected int idProduto;
	protected String nome;
	protected float valor;
	private boolean garantia;
	
	
	//Métodos Públicos
	
	//garantia apenas para produtos não quebrados
	
	public void checarGarantia() {
		if (this.getGarantia()) {
			System.out.println("Tem garantia");
		} else if (this.getValor() < 50){
			System.out.println("Não tem Garantia para produtos com menos de 50 reais");
		}else {
			System.out.println("Não tem Garantia");
		}
	}
	
	public void status() {
		System.out.println("---------------------");
		System.out.println("Id: " + this.getIdProduto());
		System.out.println("Nome:  " + this.getNome());
		System.out.println("Valor: " + this.getValor());
	}
	public void danificado() {
		this.setGarantia(false);
		System.out.println("Tem algo errado...");
	}
	public void devolver() {
		if(this.getGarantia()) {
			System.out.println("Lamentamos o ocorrido, iremos trocar o seu " + this.getNome());
		} else {
			System.out.println("Infelizmente o produto não pode ser trocado");
		}
	}
	//Métodos especiais
	
	public Produto(int idProduto, String nome, float valor) {
		this.setGarantia(true);
		this.idProduto = idProduto;
		this.nome = nome;
		this.valor = valor;
	}
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public boolean getGarantia() {
		return garantia;
	}
	public void setGarantia(boolean garantia) {
		this.garantia = garantia;
	}
	
	
	
}

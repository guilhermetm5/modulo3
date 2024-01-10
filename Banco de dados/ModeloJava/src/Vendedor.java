
public class Vendedor {

	public int idVendedor;
	public String nome;
	protected String cpf;
	protected boolean situacao;
	
	//métodos públicos
	
	public void verVendedor() {
		System.out.println("-----------------------");
		System.out.println("Nome: " + nome);
		System.out.println("cpf: " + cpf);
		System.out.println("Vendedor se encontra: " + this.getSituacao());
	}
	public void vender() {
		if (this.getSituacao()) {
			System.out.println("Trabalhando...");
		} else {
			System.out.println("Não Trabalhando..");
		}
	}
	public void folga() {
		this.setSituacao(false);
	}
	//construtor
	
	public Vendedor(int idVendedor, String nome, String cpf) {
		this.setSituacao(true);
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//métodos especiais
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public boolean getSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public int getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}
	
}

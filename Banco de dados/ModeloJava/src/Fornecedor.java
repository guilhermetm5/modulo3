
public class Fornecedor {

	private String cnpj;
	private String nome;
	private Boolean alvara;
	
	//métodos públicos
	
	public void info() {
		System.out.println("--------------------------");
		System.out.println("Nome do fornecedor: " + this.getNome());
		System.out.println("cnpj: " + this.getCnpj());
		System.out.println("Fucionando? " + this.getAlvara());
	}
	
	public void pendencia() {
		this.setAlvara(false);
	}
	public void funcionar() {
		if (this.getAlvara()) {
			System.out.println("O horário de trabalho começou");
		} else {
			System.out.println("Não foi possivel");
		}
	}
	//construtor
	
	public Fornecedor(String cnpj, String nome) {
		this.setAlvara(true);
		this.cnpj = cnpj;
		this.nome = nome;
	
	}
	//métodos especiais
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Boolean getAlvara() {
		return alvara;
	}
	public void setAlvara(Boolean alvara) {
		this.alvara = alvara;
	}
	
	
}

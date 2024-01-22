package acao;

public class AgenciaDeViagem {

	public Integer id;
	public String nome;
	public String destino;
	public Double valor;
	
	public AgenciaDeViagem() {
		
	}

	public AgenciaDeViagem(String nome, String destino, Double valor) {
		super();
		this.nome = nome;
		this.destino = destino;
		this.valor = valor;
	}
	
	

	public AgenciaDeViagem(String nome, Integer id, String destino, Double valor) {
		super();
		
		this.nome = nome;
		this.id = id;
		this.destino = destino;
		this.valor = valor;
	}

	public AgenciaDeViagem(Integer id, String nome, String destino, Double valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.destino = destino;
		this.valor = valor;
	}
	
}

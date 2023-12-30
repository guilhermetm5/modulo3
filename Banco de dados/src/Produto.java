
public class Produto {

	//Atributos
	
	String nome;
	String descricao;
	double valor;
	double nota;
	
	//métodos
	
	void lerMais() {
		System.out.println("Veja mais sobre " + nome  + "\nDescrição: " + descricao);
	}
	void verValor() {
		System.out.println(valor);
	}
	void verNota() {
		System.out.println(nota);
	}
}

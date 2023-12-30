
public class testeproduto {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto();
		
		p1.nome = "Calca Moleton";
		p1.descricao = "Confortavel e custo beneficio";
		p1.valor = 59.99;
		p1.nota = 4.2;
		
		p2.nome = "Max Steel";
		p2.descricao = "Vem com vários acessórios!";
		p2.valor = 39.99;
		p2.nota = 5.0;
		
		p3.nome = "Barbie";
		p3.descricao = "A boneca mais famosa do mundo!";
		p3.valor = 79.99;
		p3.nota = 4.9;
		
		p1.lerMais();
		p1.verValor();
		p1.verNota();
		
		p2.lerMais();
		p2.verValor();
		p2.verNota();
		
		p3.lerMais();
		p3.verValor();
		p3.verNota();
		
		System.out.println("Produtos com estoque: " + "\n" + p1.nome +"\n" + p2.nome +"\n" + p3.nome);

	}

}

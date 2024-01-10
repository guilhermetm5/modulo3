
public class novoProduto {

	public static void main(String[] args) {

		Produto p[] = new Produto[3];
		
		p[0] = new Produto(1, "Max Steel", 55.89f);
		p[1]= new Produto(2, "Casa da Barbie", 189.99f);
		p[2] = new Produto(3, "Lego Batman", 78.55f);
		
		p[0].status();
		p[0].danificado();
		p[0].checarGarantia();
		p[0].devolver();
		
		p[1].status();
		p[1].checarGarantia();
		p[1].devolver();
	}

}

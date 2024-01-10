
public class novoFornecedor {

	public static void main(String[] args) {

		Fornecedor f[] = new Fornecedor[3];
		
		f[0] = new Fornecedor("87-43-1231-1", "Importadora FHC");
		f[1] = new Fornecedor("890-65-321-4", "Eletronicos Tio sam");
		f[2] = new Fornecedor("56-74-3556-4", "L&A roupas");
		
		f[0].info();
		f[1].pendencia();
		f[1].info();
		f[2].info();
	}

}

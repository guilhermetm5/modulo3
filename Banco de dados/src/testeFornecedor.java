
public class testeFornecedor {

	public static void main(String[] args) {
		
		Fornecedor f1 = new Fornecedor();
		Fornecedor f2 = new Fornecedor();
		Fornecedor f3 = new Fornecedor();

		f1.cnpj = "923876";
		f1.nome = "Pedro Importações";
		f1.alvara = "Situação: Ativo";
		
		f2.cnpj = "866321";
		f2.nome = "Wonka doces";
		f2.alvara = "Situação: Ativo";
		
		f3.cnpj = "176623";
		f3.nome = "Lisa Lisa Bonecas";
		f3.alvara = "Situação: Desativado";
		
		f1.verFornecedor();
		f2.verFornecedor();
		f3.verFornecedor();
		
	}

}


public class testevendedor {

	public static void main(String[] args) {
		
		vendedor v1 = new vendedor();
		vendedor v2 = new vendedor();
		vendedor v3 = new vendedor();

		v1.idVendedor = 1;
		v1.nome = "Edu dos gamecards";
		v1.cpf = "123654789";
		v1.sexo = 'M';
		
		v2.idVendedor = 2;
		v2.nome = "Antonia berlim";
		v2.cpf = "0986376381";
		v2.sexo = 'F';
		
		v3.idVendedor = 3;
		v3.nome = "Eduarda Amazonas";
		v3.cpf = "87652525211";
		v3.sexo = 'F';
		
		v1.verVendedor();
		v2.verVendedor();
		v3.verVendedor();
	}

}

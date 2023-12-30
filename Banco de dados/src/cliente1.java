
public class cliente1 {

	public static void main(String[] args) {
		
		Clientes c1 = new Clientes();
		Clientes c2 = new Clientes();
		Clientes c3 = new Clientes();
		
		c1.nome = "João Guilherme";
		c1.cpf = "123456789";
		c1.idCliente = 1;
		c1.sexo = 'M';
		
		c2.nome = "Luiz Eduardo";
		c2.cpf = "97371863813";
		c2.idCliente = 2;
		c2.sexo = 'M';
		
		c3.nome = "Rosa maria";
		c3.cpf = "87671863813";
		c3.idCliente = 3;
		c3.sexo = 'F';
		
		c1.dadosDoCliente();
		c2.dadosDoCliente();
		c3.dadosDoCliente();
		
		c1.andar();
		c2.comer();
	}

}

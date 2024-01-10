
public class novoCliente {

	public static void main(String[] args) {
		
		Cliente c[] = new Cliente[3];
		
		c[0] = new Cliente(1, 21, "João Guilherme", "76545673213", 'M');
		c[1] = new Cliente(2, 23, "Luiz Eduardo", "09867845634", 'M');
		c[2] = new Cliente(3, 17, "Rielly Barbosa", "12889787654", 'F');
		
		
		c[0].abrirConta();
		c[0].perfil();
		c[0].depositar(50);
		c[0].fazerPedido();
		
		c[1].abrirConta();
		c[1].dadosCliente();
		c[1].fazerPedido();
		
		c[2].abrirConta();
		c[2].dadosCliente();
		c[2].depositar(10);
		c[2].fazerPedido();
	}

}

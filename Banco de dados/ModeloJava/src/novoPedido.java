
public class novoPedido {

	public static void main(String[] args) {
		
		Cliente c[] = new Cliente[3];
		
		c[0] = new Cliente(1, 21, "João Guilherme", "76545673213", 'M');
		c[1] = new Cliente(2, 23, "Luiz Eduardo", "09867845634", 'M');
		c[2] = new Cliente(3, 17, "Rielly Barbosa", "12889787654", 'F');
		
		Pedido p[] = new Pedido[3];
		
		p[0] = new Pedido(1, 59.99f);
		
		p[0].nota(c[0]);
	}

}

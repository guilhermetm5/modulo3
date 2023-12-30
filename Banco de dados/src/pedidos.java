
public class pedidos {

	public static void main(String[] args) {
		
		Pedido p1 = new Pedido();
		Pedido p2 = new Pedido();
		Pedido p3 = new Pedido();

		p1.idPedido = 1;
		p1.valor = 39.99;
		p1.cpf = "1391738291";
		
		p2.idPedido = 2;
		p2.valor = 79.99;
		p2.cpf = "98731738291";
		
		p3.idPedido = 3;
		p3.valor = 79.99;
		p3.cpf = "5611738291";
		
		System.out.println("Todos os pedidos: ");
		p1.verPedido();
	}

}


public class novoVendedor {

	public static void main(String[] args) {
		
		Vendedor v[]= new Vendedor[3];
		
		v[0] = new Vendedor(1, "Maria Bonecas", "67519292392");
		v[1] = new Vendedor(2, "Joao Briquedos", "7899887652");
		v[2] = new Vendedor(3, "BC Informática", "43567865423");
		
		v[0].verVendedor();
		v[0].vender();
		v[0].verVendedor();
		
		v[1].folga();
		v[1].vender();

	}

}

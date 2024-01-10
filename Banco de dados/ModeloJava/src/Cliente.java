public class Cliente {

	public int idCliente;
	public int idade;
	public String nome;
	private String cpf;
	private char sexo;
	private float saldo;
	private Boolean status;
	
	//Métodos Públicos
	
	public void perfil() {
		if (this.getStatus()) {
			System.out.println("--Perfil do Cliente--");
			System.out.println("Nome: " + this.getNome());
			System.out.println("Idade " + this.getIdade());
			System.out.println("Sexo: " + this.getSexo());
		} else {
			System.out.println("----------------------------");
			System.out.println("Perfil não encontrado, o cliente não possui conta.");
		}
		
	}
	public void dadosCliente() {
		if( this.getStatus()) {
			System.out.println("----Dados do Cliente--");
			System.out.println("Id: " + this.getIdCliente());
			System.out.println("Idade " + this.getIdade());
			System.out.println("Nome: " + this.getNome());
			System.out.println("CPF: " + this.getCpf());
			System.out.println("Sexo: " + this.getSexo());
		}else {
			System.out.println("----------------------------");
			System.out.println("Usuário não encontrado!");
		}
	}
	public void abrirConta() {
		this.setStatus(true);
		System.out.println("----------------------------");
		System.out.println("Conta Aberta Com Sucesso!");
	}
	public void depositar(float d) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + d);
			System.out.println("Depositado " + d + " na conta de " + this.getNome());
		}else {
			System.out.println("----------------------------");
			System.out.println("Não é possível depositar o usuário não possui conta");
		}
	}
	
	public void fazerPedido() {
		if (this.getStatus() && this.getSaldo() > 0 && this.getIdade() > 18) {
			System.out.println("Pedido feito!");
		} else if (this.getSaldo() <= 0) {
			System.out.println("Pedido não foi feito, o cliente não possui saldo na conta!");
		} else if (this.getIdade() <=17) {
			System.out.println("Nossa loja não vende para menores de 18 anos!");
		}else {
			System.out.println("Pedido não pode ser feito o usuário não possui uma conta!");
		}
	}

	
	//Métodos especiais
	
	public Cliente(int idCliente, int idade, String nome, String cpf, char sexo) {
		this.setStatus(false);
		this.setSaldo(0);
		this.idCliente = idCliente;
		this.idade = idade;
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
	}
	
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
}

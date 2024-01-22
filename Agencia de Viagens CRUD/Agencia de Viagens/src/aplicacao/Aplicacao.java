package aplicacao;

import java.util.Scanner;
import acao.AgenciaACAO;
import acao.AgenciaDeViagem;

public class Aplicacao {

	public static void main(String[] args) {

		AgenciaDeViagem cliente = new AgenciaDeViagem("João", 1, "São Paulo", 889.90);
		AgenciaDeViagem cliente1 = new AgenciaDeViagem("Luiz", 2, "Manaus", 599.87);
		AgenciaDeViagem cliente2 = new AgenciaDeViagem("Pedro", 3, "Santos", 489.99);
		
		AgenciaACAO acao = new AgenciaACAO();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha uma opção");
		System.out.println("1 - Consultar tudo | 2 - Cadastrar novo cliente | 3 - Atualizar Valor da passagem | 4 - Apagar cliente ");
		String m = entrada.nextLine();
		int menu = Integer.parseInt(m);
		
		if (menu == 1) {
			acao.consultaTudo();
		}
		else if(menu == 2) {
			System.out.println("Informe o nome do novo cliente ");
			String nome = entrada.nextLine();
			System.out.println("Informe o Destino do Cliente: ");
			String destino = entrada.nextLine();
			System.out.println("Informe o valor da passagem: ");
			String valor = entrada.nextLine();
			
			AgenciaDeViagem novoCliente = new AgenciaDeViagem(nome, destino, Double.parseDouble(valor));
			acao.grava(novoCliente);
;		}
		else if (menu == 3) {
			System.out.print("\nQual o id do cliente?");
			String id = entrada.nextLine();
			System.out.print("\nQual o valor da nova passagem?");
			String valorCurso = entrada.nextLine();
			acao.alteraValor(Integer.parseInt(id), Double.parseDouble(valorCurso));
		}
		else if(menu == 4) {
			System.out.println("Qual o Id de cliente que deseja apagar?(Não pode ser desfeito) ");
			String id = entrada.nextLine();
			acao.apaga(Integer.parseInt(id));
		}
		else {
			System.out.println("Opção Inválida");
		}
		
		//acao.criaTabela();
		//acao.grava(cliente);
		//acao.grava(cliente1);
		//acao.grava(cliente2);
		//acao.consultaTudo();
		//acao.consultaPorNome("João");
		//acao.alteraValor(3, 539.99);
		//acao.apaga(3);

	}

}

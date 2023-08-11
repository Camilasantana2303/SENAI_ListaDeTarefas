package senai_AtvTarefas;

import java.util.Scanner;

import controller.TarefaController;
import view.TarefaView;

public class Principal {

	public static void main(String[] args) {
		TarefaController tarefaController = new TarefaController(); 
		TarefaView tarefaView = new TarefaView();
		
		
		Scanner lerDados = new Scanner (System.in);
		
		int opcao=1;
		while(opcao !=0){
			System.out.println("1-Adicionar");
			System.out.println("2-Listar");
			opcao=lerDados.nextInt();
			
		
		switch(opcao) {
		case 1:
			System.out.println("Digite o nome da Tarefa");
			lerDados.nextLine();
			String nome = lerDados.nextLine();
			System.out.println("Digite o status da tarefa ");
			String status = lerDados.nextLine();
			
			tarefaController.adicionarTarefas(nome, status);
			break;
			
			
		case 2:
			System.out.println("Lista de tarefas");
			tarefaController.exibirListaDeTarefas();
			break;
			
			
		default:
			System.out.println("Opção invalida");
			break;
		}
		
		}
	
		
		

	}

}

package view;

import java.util.List;

import model.Tarefa;

public class TarefaView {

	public void exibirListaDeTarefas (List<Tarefa> listaDeTarefas) {
		System.out.println("====Exibir Tarefas====");
		for (Tarefa tarefa : listaDeTarefas) {
			System.out.println(tarefa.getNome());
			System.out.println(tarefa.getStatus());

		}
		
	}

}

package controller;

import java.util.ArrayList;
import java.util.List;

import model.Tarefa;
import view.TarefaView;


public class TarefaController {

	private List<Tarefa> listaDeTarefas;
	private TarefaView tarefaView;
	
	public TarefaController() {
		listaDeTarefas = new ArrayList<>();
		tarefaView = new TarefaView();
	}

	public void adicionarTarefas(String nome, String status) {
		Tarefa tarefa = new Tarefa(nome, status);
		listaDeTarefas.add(tarefa);
	}
	
	public void exibirListaDeTarefas() {
		tarefaView.exibirListaDeTarefas(listaDeTarefas);
	}

}

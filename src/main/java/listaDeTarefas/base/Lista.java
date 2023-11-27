package listaDeTarefas.base;

import java.util.ArrayList;

//adicionar, remover e marcar tarefas como concluídas.
public class Lista {
    ArrayList<Tarefa> listaTarefa = new ArrayList<>();

    //adicionar
    public void adicionarTarefa(Tarefa tarefa) {
    	listaTarefa.add(tarefa);
    }

    //listar
    public void listarTarefas() {
    	//Organizando as prioridades
    	listaTarefa.sort((t1, t2) -> t1.getPrioridade().compareTo(t2.getPrioridade()));
        
    	for (Tarefa tarefa : listaTarefa) {
            System.out.println(tarefa);
        }
    }

    //remover
    public void removerTarefa(Tarefa tarefa) {
    	for (Tarefa tarefas : listaTarefa) {
            if (tarefas.getNome().contentEquals(tarefa.getNome())) {
            	listaTarefa.remove(tarefas);
            	break;
            }
        }
    }
    
    public void marcarComoConcluida(Tarefa tarefa) {
    	for (Tarefa tarefas : listaTarefa) {
            if (tarefas.getNome().contentEquals(tarefa.getNome())) {
            	 tarefa.setConcluida(true);
                 System.out.println("Tarefa marcada como concluída: " + tarefa);
            	break;
            }
        }
    }

}
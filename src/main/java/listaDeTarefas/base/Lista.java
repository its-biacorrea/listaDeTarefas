package listaDeTarefas.base;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lista {
	private static final Logger logger = LoggerFactory.getLogger(Lista.class);

    public ArrayList<Tarefa> listaTarefa = new ArrayList<>();

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
    	logger.debug("Nome passado: " + tarefa.getNome());
    	 boolean removida = listaTarefa.removeIf(t -> t.getNome().equals(tarefa.getNome()));
    	if (!removida) {
    		logger.error("Erro ao remover a tarefa: " + tarefa.getNome() + ". Tarefa não encontrada na lista.");
    	}
    }
    
    public void marcarComoConcluida(Tarefa tarefa) {

    	listaTarefa.stream()
        .filter(t -> t.getNome().equals(tarefa.getNome()))
        .findFirst()
        .ifPresent(t -> {
            t.setConcluida(true);
            logger.info("Tarefa marcada como concluída: " + t);
        });


        }

    }


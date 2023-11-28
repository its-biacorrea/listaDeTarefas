package listaDeTarefas.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import listaDeTarefas.base.Tarefa;


class TarefaTest {

    @Test
    public void testConstrutor() {
        Tarefa tarefa = new Tarefa("Comprar pão", "Alta");
        assertEquals("Comprar pão", tarefa.getNome());
        assertEquals("Alta", tarefa.getPrioridade());
        assertFalse(tarefa.isConcluida());
    }

    @Test
    public void testSetConcluida() {
        Tarefa tarefa = new Tarefa("Estudar", "Média");
        assertFalse(tarefa.isConcluida());

        tarefa.setConcluida(true);
        assertTrue(tarefa.isConcluida());
    }

    
}

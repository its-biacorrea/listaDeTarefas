package listaDeTarefas.main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import listaDeTarefas.base.Lista;
import listaDeTarefas.base.Tarefa;

import static org.junit.jupiter.api.Assertions.*;

class ListaTest {
    private Lista lista;

    @BeforeEach
    public void setUp() {
        lista = new Lista();
    }

    @Test
    public void testAdicionarTarefa() {
        Tarefa tarefa = new Tarefa("Lavar louça", "Baixa");
        lista.adicionarTarefa(tarefa);
        assertEquals(1, lista.listaTarefa.size());
        assertTrue(lista.listaTarefa.contains(tarefa));
    }

    @Test
    public void testRemoverTarefa() {
        Tarefa tarefa = new Tarefa("Limpar casa", "Alta");
        lista.adicionarTarefa(tarefa);

        lista.removerTarefa(tarefa);
        assertEquals(0, lista.listaTarefa.size());
        assertFalse(lista.listaTarefa.contains(tarefa));
    }
    
    @Test
    public void testConstrutorComNomeNulo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Tarefa(null, "Alta");
        });
    }
    
    @Test
    public void testConstrutorComNomeVazio() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Tarefa("", "Alta");
        });
    }
}

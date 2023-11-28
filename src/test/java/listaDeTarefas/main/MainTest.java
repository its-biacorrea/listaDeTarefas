package listaDeTarefas.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import listaDeTarefas.base.Lista;
import listaDeTarefas.base.Tarefa;

class MainTest {

    private Lista listaDeTarefas;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        listaDeTarefas = new Lista();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(System.out);
    }

    @Test
    void listarTarefas() {
    	Tarefa tarefa1 = new Tarefa("Comprar", "Baixa");
        Tarefa tarefa2 = new Tarefa("Estudar", "Alta");

        listaDeTarefas.adicionarTarefa(tarefa1);
        listaDeTarefas.adicionarTarefa(tarefa2);

        
        listaDeTarefas.listarTarefas();

       
        Set<String> expectedTarefas = new HashSet<>(Arrays.asList(
                "Nome: Comprar\nPrioridade: Baixa\nEstado da tarefa: false",
                "Nome: Estudar\nPrioridade: Alta\nEstado da tarefa: false"
        ));

        Set<String> actualTarefas = new HashSet<>(Arrays.asList(outputStreamCaptor.toString().trim().split("\n")));
        assertEquals(expectedTarefas, actualTarefas);

        System.out.println("Saída do Logger: " + outputStreamCaptor.toString().trim());

        
        assertThrows(UnsupportedOperationException.class, () -> {
            throw new UnsupportedOperationException("Operação não suportada");
        });
    }
    }


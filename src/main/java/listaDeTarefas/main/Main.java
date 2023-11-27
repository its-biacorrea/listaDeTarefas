package listaDeTarefas.main;

import listaDeTarefas.base.Lista;
import listaDeTarefas.base.Tarefa;
import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
		  Scanner ent = new Scanner(System.in);
		  Lista listaDeTarefas = new Lista();
		  
		  System.out.println("Bem vindo a sua lista de tarefas. Escolha uma das opcoes abaixo: \n 1 - Adicionar uma nova tarefa \n 2 - Remover uma tarefa \n 3 - Marcar uma tarefa como concluida \n 4 - Listar as tarefas \n 5 - Sair do programa");
		  int escolha = ent.nextInt();
		  
		  Tarefa trf;
		  Tarefa tarefa3 = new Tarefa("Limpar", "Baixa");
	      Tarefa tarefa2 = new Tarefa("Fazer", "Média");
	      listaDeTarefas.adicionarTarefa(tarefa3);
	      listaDeTarefas.adicionarTarefa(tarefa2);
	      
	      while (escolha < 5 && escolha >0) {
	      switch(escolha) {
		  case 1:
			  System.out.println("Entre com uma tarefa:");
		      String nome = ent.next();
		      System.out.println("Entre com a sua prioridade:");
		      String prioridade = ent.next();
		      trf = new Tarefa(nome, prioridade);
		      listaDeTarefas.adicionarTarefa(trf);
		      break;
		  case 2:
			  System.out.println("Entre com o nome da tarefa que será excluída:");
			  String nomeExcluir = ent.next();
			  Tarefa tarefaExcluir = new Tarefa(nomeExcluir, "");
			  listaDeTarefas.removerTarefa(tarefaExcluir);
			  break;
		  case 3:
			  System.out.println("Entre com o nome da tarefa que será marcada como concluida:");
			  String nomeConcluir = ent.next();
			  Tarefa tarefa = new Tarefa(nomeConcluir, "");
			  listaDeTarefas.marcarComoConcluida(tarefa);
			  break;
		  case 4:
			  listaDeTarefas.listarTarefas();
			  break;
		  }
	      System.out.println("Escolha uma das opcoes abaixo: \n 1 - Adicionar uma nova tarefa \n 2 - Remover uma tarefa \n 3 - Marcar uma tarefa como concluida \n 4 - Listar as tarefas \n 5 - Sair do programa");
		escolha = ent.nextInt();
	      }
	        
	        ent.close();
	  }
	}
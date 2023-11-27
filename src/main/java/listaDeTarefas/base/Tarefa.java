package listaDeTarefas.base;
import lombok.Data;

/**
 * @author User
 *
 */
@Data
public class Tarefa {
	  protected String nome;
	  protected String prioridade;
	  protected boolean concluida = false;

	  public Tarefa(String nome,String prioridade){
	    this.nome = nome;
	    this.prioridade = prioridade;
	    this.concluida = false;
	  }
	  
	  
	  
	  public String getNome() {
		return nome;
	}



	public String getPrioridade() {
		return prioridade;
	}



	public boolean isConcluida() {
	        return concluida;
	    }

	    public void setConcluida(boolean concluida) {
	        this.concluida = concluida;
	    }
	  
	    @Override
	  public String toString() {
	      return "Tarefa [nome = " + nome + ", prioridade = " + prioridade + ", estado da tarefa = " + concluida + "]";
	    }

	
	}

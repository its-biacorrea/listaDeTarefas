package listaDeTarefas.base;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public class Tarefa {
	  protected String nome;
	  protected String prioridade;
	  protected boolean concluida = false;
	  private static final Logger logger = LoggerFactory.getLogger(Tarefa.class);
	  
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
	        if (concluida) {
	            logger.info("Tarefa marcada como concluída: " + this);
	        }
	    }
	  
	    @Override
	  public String toString() {
	      return "Nome: " + nome + "\nPrioridade: " + prioridade + "\nEstado da tarefa: " + concluida;
	    }

	
	}

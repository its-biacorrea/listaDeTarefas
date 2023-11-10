package zoologico.base;
import lombok.Data;

@Data
public abstract class Animal {
	  protected String nome;
	  protected int idade;

	  public Animal(String nome,int idade){
	    this.nome = nome;
	    this.idade = idade;
	  }

	  public void emitirSom(){
	    
	  };
	  
	  @Override
	  public String toString() {
	      return "Animal [nome = " + nome + ", idade = " + idade + "]";
	    }
	}

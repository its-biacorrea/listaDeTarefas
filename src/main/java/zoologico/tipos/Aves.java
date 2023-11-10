package zoologico.tipos;

import zoologico.base.Animal;
import zoologico.base.Comportamento;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Aves extends Animal implements Comportamento{

	   public Aves(String nome, int idade) {
	        super(nome, idade);
	    }

	    @Override

	    public void emitirSom(){
	        System.out.println( nome + " está emitindo seu som"); 
	    }
	    @Override
	  public void mover(){
	    System.out.println("Olha a " + nome + " voando");
	  }
	}

package zoologico.tipos;

import zoologico.base.Animal;
import zoologico.base.Comportamento;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Mamiferos extends Animal implements Comportamento{

    public Mamiferos(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void emitirSom(){
        System.out.println( nome + " está emitindo seu som"); 
    }
    
    @Override
  public void mover(){
    System.out.println("Olha o " + nome + " andando");
  }
}

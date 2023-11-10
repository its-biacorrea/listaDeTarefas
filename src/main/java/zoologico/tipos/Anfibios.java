package zoologico.tipos;

import zoologico.base.Animal;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Anfibios extends Animal{

    public Anfibios(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println( nome + " está emitindo seu som"); 
    }
}
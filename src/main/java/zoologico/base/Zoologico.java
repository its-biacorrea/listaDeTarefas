package zoologico.base;

import java.util.ArrayList;

public class Zoologico {
    ArrayList<Animal> listaAnimais = new ArrayList<>();

    public void adicionarAnimal(Animal animal) {
        listaAnimais.add(animal);
    }

    public void listarAnimais() {
        for (Animal animal : listaAnimais) {
            System.out.println(animal);
        }
    }

    public void moverAnimais() {
        for (Animal animal : listaAnimais) {
            if (animal instanceof Comportamento) {
                ((Comportamento) animal).mover();
            }
        }
    }
}
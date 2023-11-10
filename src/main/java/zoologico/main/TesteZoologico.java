package zoologico.main;

import zoologico.base.Zoologico;
import zoologico.tipos.Anfibios;
import zoologico.tipos.Aves;
import zoologico.tipos.Mamiferos;
import zoologico.tipos.Peixes;
import zoologico.tipos.Repteis;

public class TesteZoologico {
	  public static void main(String[] args) {
	    Anfibios anfibio = new Anfibios("Sapo", 6);
	    Aves ave = new Aves("Arara Azul", 25);
	    Mamiferos mamifero = new Mamiferos("Elefante", 35);
	    Peixes peixe = new Peixes("Peixe palhaço ", 5);
	    Repteis reptil = new Repteis("Jararaca", 5);

	    Zoologico zoologico = new Zoologico();

	    zoologico.adicionarAnimal(anfibio);
	    zoologico.adicionarAnimal(ave);
	    zoologico.adicionarAnimal(mamifero);
	    zoologico.adicionarAnimal(peixe);
	    zoologico.adicionarAnimal(reptil);

	    zoologico.listarAnimais();
	    
	    anfibio.emitirSom();
	    ave.emitirSom();
	    mamifero.emitirSom();
	    peixe.emitirSom();
	    reptil.emitirSom();
	    
	    zoologico.moverAnimais();
	    
	  }
	}
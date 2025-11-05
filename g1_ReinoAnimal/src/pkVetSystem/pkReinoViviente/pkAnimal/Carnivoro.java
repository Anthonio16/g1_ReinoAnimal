package pkVetSystem.pkReinoViviente.pkAnimal;

public abstract class Carnivoro extends Mamifero {
    
    Carnivoro(String nombre, Integer edad, Float peso, String especie) {
        super(nombre, edad, peso, especie);
    }

    public void cazar(String presa){
        System.out.println("El carnívoro " + getNombre() + " está cazando un " + presa + ".");
    }

    
}

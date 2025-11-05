package pkVetSystem.pkReinoViviente.pkAnimal;

public abstract class Hervivoro extends Mamifero {
    
    public Hervivoro(String nombre, Integer edad, Float peso, String especie) {
        super(nombre, edad, peso, especie);
    }

    public void escapar(String depredador){
        System.out.println("El hervívoro " + getNombre() + " está escapando de " + depredador + ".");
    }

}

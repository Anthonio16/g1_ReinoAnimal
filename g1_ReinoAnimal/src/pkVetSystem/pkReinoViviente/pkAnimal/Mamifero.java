package pkVetSystem.pkReinoViviente.pkAnimal;

public abstract class Mamifero extends AnimalVertebrado {

    public Mamifero(String nombre, int edad, Float peso, String especie) {
        super(nombre, edad, peso, especie);
    }

    public void lactar(){
        System.out.println("El mamífero " + getNombre() + " está lactando a sus crías.");
    }

    public void comer(){
        System.out.println("El mamífero " + getNombre() + " está comiendo.");
    }

}

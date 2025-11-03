package pkVetSystem.pkReinoViviente.pkAnimal;

public abstract class Ave extends AnimalVertebrado {

    public Ave(String nombre, Integer edad, Float peso, String especie) {
        especie = "Ave ";
        super(nombre, edad, peso, especie);
    }

    public boolean tieneAla() {
        if (tieneAla()) {
            System.out.println("El ave " + getNombre() + " tiene alas, puede volar.");
        } else {
            System.out.println("El ave " + getNombre() + " no tiene alas, no puede volar.");
        }
        return true;
    }

}

package pkVetSystem.pkReinoViviente.pkAnimal;

import pkVetSystem.pkReinoViviente.pkVegetal.Alga;

public class PezPayaso extends Pez {

    public PezPayaso(String nombre, int edad, Float peso, String especie) {
        super(nombre, edad, peso, especie);
    }

    public void comer(Alga alga) {
        System.out.println("El pez payaso " + getNombre() + " está comiendo algas: " + alga.getTipo());
    }
    
    public void nadar() {
        System.out.println("El pez payaso " + getNombre() + " está nadando alegremente en el acuario.");

    }

    @Override
    public boolean estaVivo() {
        System.out.println("El pez payaso" + getNombre() + "está vivito y coleando.");
        return true;
    }
}
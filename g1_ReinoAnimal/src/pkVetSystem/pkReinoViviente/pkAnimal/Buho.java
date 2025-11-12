package pkVetSystem.pkReinoViviente.pkAnimal;



public class Buho extends Ave {

    public Buho(String nombre, Integer edad, Float peso, String especie) {
        super(nombre, edad, peso, especie);
    }

    // Agregar el método cazar que recibe un PezPayaso como parámetro cuando exista la clase PezPayaso

    public void cazar(PezPayaso pecesillo){
        System.out.println("El buho " + getNombre() + " ha cazado al pez payaso " + pecesillo.getNombre() + ".");
    }

    public void ulular() {
        System.out.println("El buho " + getNombre() + " está ululando: Huuu Huuu Huuu...");
    }

    public void girarCabeza() {
        System.out.println("El buho " + getNombre() + " ha girado su cabeza 270 grados.");
    }
}

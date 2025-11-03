package pkVetSystem.pkReinoViviente.pkAnimal;

public abstract class Pez extends AnimalVertebrado {
    public Pez(String nombre) {
        super();
        setNombre(nombre);
        tragar();
        nadar();
    
    }
    public Pez() {
        super();
        tragar();
        nadar();
    }
    public void tragar() {
        System.out.println("El pez está tragando... Hamrbreee!");
    }

    public void nadar() {
        System.out.println("El pez está nadando en el agua.");
    }

    public boolean estaVivo() {
        return true;
    }

}

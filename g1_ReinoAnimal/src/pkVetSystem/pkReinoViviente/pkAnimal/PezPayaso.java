package pkVetSystem.pkReinoViviente.pkAnimal;

public class PezPayaso extends Pez {
    public PezPayaso(String nombre) {
        super(nombre);
    }

    public String comer(Alga alga) {
        return "El pez payaso está comiendo algas: " + alga.getTipo();
    }
    
    public boolean estaNadando() {
        System.out.println("El pez payaso está nadando alegremente en el acuario.");
        return true;
    }

    @Override
    public boolean estaVivo() {
        System.out.println("El pez payaso está vivito y coleando.");
        return true;
    }

}

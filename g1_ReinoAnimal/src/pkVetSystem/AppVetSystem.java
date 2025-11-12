package pkVetSystem;

import pkVetSystem.pkhumano.Veterinario;
import pkVetSystem.pkReinoViviente.pkAnimal.Camaleon;
import pkVetSystem.pkReinoViviente.pkAnimal.Hiena;
import pkVetSystem.pkReinoViviente.pkAnimal.PezPayaso;
import pkVetSystem.pkReinoViviente.pkAnimal.AnimalVertebrado;


public class AppVetSystem {
    

    public AppVetSystem(){

    }

    public void inicializar(){
        
        //Instanciar animales
        Camaleon camaleon = new Camaleon("Federico", 3, 300.5f, "Reptil", "Verde Oscuro");
        Hiena hiena = new Hiena("Alfonso", 7, 65.0f, "Mamifero");
        PezPayaso pezPayaso = new PezPayaso("Nemo", 2, 0.2f, "Pez");


        //Interaccion del Camaleon
        camaleon.detectarAmenaza(hiena);
        camaleon.cambiarColor("Celeste", hiena);
        camaleon.treparRama(hiena);

        //Instanciar veterinario
        Veterinario vet = new Veterinario("1234567890","Juan","Pérez");
        vet.setClave("JuanVet","clave123");

        vet.entrarCentroConservacion();
        vet.registrarAnimal(camaleon);
        vet.registrarAnimal(hiena);
        vet.registrarAnimal(pezPayaso);
        
        atenderAnimalConReporte(vet, camaleon);
        atenderAnimalConReporte(vet, hiena);
        atenderAnimalConReporte(vet, pezPayaso);

        //Mostrar total de animales atendidos
        System.out.println("Total de animales atendidos por el veterinario " + vet.getNombre() + ": " + vet.getAnimalesAtendidos());
    


    }
    private void atenderAnimalConReporte(Veterinario vet, AnimalVertebrado animal) {
        System.out.println("\n");
        vet.atenderAnimal(animal);
        System.out.println(vet.observarSintomas(animal));
        System.out.println(vet.diagnosticarAnimal(animal));
        System.out.println(vet.darTratamiento(animal));
        System.out.println("\n--- REPORTE FINAL ---");
        System.out.println(vet.generarReporte(animal));
        System.out.println("------------------------------------------------------");
    }
}
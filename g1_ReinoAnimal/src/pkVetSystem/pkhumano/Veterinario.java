package pkVetSystem.pkhumano;

import pkVetSystem.pkReinoViviente.pkAnimal.AnimalVertebrado;
import pkVetSystem.pkReinoViviente.pkAnimal.PezPayaso;

public class Veterinario extends Persona {

    private String login;
    private String password;
    private int animalesAtendidos = 0;
        
    public Veterinario(String nombre, String apellido) {
        super (nombre, apellido);
    }

    public Veterinario(String cedula, String nombre, String apellido) {
      super(cedula, nombre, apellido);
    }

    public boolean setClave(String login, String password) {
        if (login != null && password != null) {
            setLogin(login);
            setPassword(password);
            return true;
        }
        return false;
    }

    public void entrarCentroConservacion() {
        System.out.println("El veterinario " + getNombre() + " ha ingresado al centro de conservación.");
    }

    public boolean registrarAnimal(AnimalVertebrado animal) {
        if (animal != null) {
            System.out.println("Animal registrado: " + animal.getNombre());
            return true;
        }
        return false;
    }

    public boolean atenderAnimal(AnimalVertebrado animal) {
        if (animal == null) {
            return false;
        }
        System.out.println("El veterinario " + getNombre() + " está revisando un " + animal.getEspecie() + ".");
        System.out.println("Atendiendo al animal: " + animal.getNombre());
        animalesAtendidos++; 
        return true;
    }

    public String observarSintomas(AnimalVertebrado animal) {
        if (animal instanceof PezPayaso) {
            return "Observación: el pez payaso nada lentamente y tiene manchas en sus aletas.";
        } else {
            return "Observación: el animal se comporta de manera normal y activa.";
        }
    }   

    public String diagnosticarAnimal(AnimalVertebrado animal) {
        observarSintomas(animal);
        if (animal instanceof PezPayaso) {
            return "Diagnostico: el animal presenta una infección bacteriana.";
        }
        return "Diagnostico: el animal está saludable.";
    }

    public String darTratamiento(AnimalVertebrado animal) {
        if (animal instanceof PezPayaso) {
            return "Tratamiento: administrar antibiótico acuático durante una semana y mejorar calidad del agua.";
        }
        return "Tratamiento: solo necesita mantener una buena alimentación.";
    }

    public int getAnimalesAtendidos() {
        return animalesAtendidos;
    }

    public String generarReporte (AnimalVertebrado animal) {
        return "Reporte del animal: " + animal.getNombre() + "\n" +
               "Especie:" + animal.getEspecie() + "\n" +
                diagnosticarAnimal(animal) + "\n" +
                darTratamiento(animal) + "\n" +
                "Animales atendidos por este veterinario: " + animalesAtendidos;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}


package api_inventario_robotica;

public class Docente extends Persona{

    public Docente(int id, String nombre){
        super(id, nombre); //constructor de la clase padre
    }

    @Override
    public void saludar(String nombre_persona_a_saludar) {
        System.out.println("Docente " + this.nombre + " te saluda, " + nombre_persona_a_saludar);
    }

}

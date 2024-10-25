package api_inventario_robotica;

public class Alumno extends Persona {

    public Alumno(int id, String nombre){
        super(id, nombre); //constructor de la clase padre
    }

    @Override
    public void saludar(String nombre_persona_a_saludar) {
        System.out.println("Alumno " + this.nombre + " te saluda, " + nombre_persona_a_saludar);
    }
}

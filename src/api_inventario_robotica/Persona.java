package api_inventario_robotica;

public abstract class Persona {
    int id;
    String nombre;

    public Persona(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    //define la estructura del metodo/funcion, mas no su funcionalidad
    public abstract void saludar(String nombre_persona_a_saludar);

    public void despedirse(){
        System.out.println("Adios :D!");
    }

}

package api_inventario_robotica;

public class Articulo implements Comparable<Articulo> {

    //ENCAPSULAMIENTO
    //SOLO HACER VISIBLE AL EXTERIOR LO NECESARIO PARA TENER UN "MEJOR CONTROL"

    //MODIFICADORES DE ACCESO: ... SIRVEN PARA EL ENCAPSULAMIENTO..
    //  PROTECTED (DEFAULT)
    //      puede ser accedida por la misma clase y otras clases que esten en el mismo paquete (folder)
    //  PRIVATE
    //  PUBLIC

    //EN JAVA, COMO EN MUCHOS LENGUAJES, CUANDO SE DECLARA UNA VARIABLE, PERO NO DEFINE EL TIPO DE MOD. DE ACCESO
    //POR DEFECTO ES PROTEGIDO ....



    //Propiedades
    private String nombre;
    private int cantidad;
    private String descripcion;
    private String categoria;

    //Funcionalidades
    // -> Obtener informacion
    // -> Cambiar informacion

    public void cambiarNombre(String nombre){ //Parametros!
        this.nombre = nombre; //this es para acceder al contexto (variables/metodos) de la clase

        //se puede acceder a una BD y registrar el cambio !
    }

    // -> construir
    //SOBRECARGA DE METODOS...
    //  cuando dos o mas metodos/funciones tienen el mismo nombre en la misma clase,
    //  pero una diferente cantidad de parametros
    //  o la misma cantidad de parametros pero de distinto tipo
    //  Ademasm, los metodos pueden o no modificar su funcionalidad

    public Articulo(){
        //constructor vacio
    }

    public Articulo(String nombre){
        this.nombre = nombre;
    }

    public Articulo(int cantidad){
        this.cantidad = cantidad;
    }

    public Articulo(String nombre, int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = "SIN DESCRIPCION"; //se puede inicializar propiedades aunque no se hayan recibido valores
    }

    //public Articulo(String descripcion){
    //    this.descripcion = descripcion;
    //}

    // -> Custom (Personalizadas

    //POLIMORFISMO ....-> EN JAVA TODAS LAS CLASES PERTENENCEN A UNA CLASE MAS GRANDE, QUE SE LLAMA OBJECT
    // Y QUE DEFINE EL METODO "TO STRING" POR ESA RAZON, AL DECLARAR Y SOBREESCRIBIR LA FUNCIONALIDAD DE DICHO METODO
    // SE ESTA APLICANDO POLIMORFISMO

    //EL POLIMORFISCO OCURRE CUANDO DE MANERA VERTICAL (UNA CLASE QUE HEREDA DE OTRA) REDEFINE UNO O MAS DE SUS METODOS


    //EL METODO TO STRING ES UN METODO ESPECIAL, QUE NO NECESITA SER LLAMADO DE MANERA EXPLICITA PARA FUNCIONAR
    @Override
    public String toString(){
        String obj = "ARICULO = [" + this.nombre + " - " + this.cantidad + " ]";
        return obj;
    }


    //Depuracion ....
    public static void main(String[] args) {
        Articulo prueba;
        //prueba.
    }

    //ORDENAMIENTO NATURAL...
    @Override
    public int compareTo(Articulo obj_to_comparar) {
        /*
        > 0  Este objeto es "mayor" que el objeto con el que se compara
        == 0 cuando este objeto es "igual" que el objeto con el que se compara
        < 0 Este objeto es "menor" que el objeto con el que se compara
         */
        int v = this.nombre.compareTo(obj_to_comparar.nombre) * -1;
        return v;

    }

    public int obtenerCantidad(){
        return cantidad;
    }
}

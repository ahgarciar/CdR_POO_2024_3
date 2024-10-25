//import api_inventario_robotica.Articulo;
//import api_inventario_robotica.Inventario;

import api_inventario_robotica.*; //importa todas las clases del paquete

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Articulo articulo; //Declaracion
        //informar a la computadora que se hara uso de memoria para un objeto (instancia), sin hacer uso de la memoria

        articulo = new Articulo("Ejemplo"); //instanciacion ...usar la memoria que se declaro seria usada
        //se realiza a traves de alguno de los constructores de la clase

        //cuando no se ha definido un constructor, siempre existira un constructor vacio (no tiene parametros)
        //pero cuando se define un constructor, el vacio deja de funcionar y si se quiere usar, se debe definir

        String descripcion = "";
        Articulo articulo2 = new Articulo(descripcion);

        Scanner sc;
        */

/*
        //PARTE 2

        Inventario inventario_laboratorio;
        inventario_laboratorio = new Inventario();

        //CREACION DE OBJETOS
        Articulo aux;
        Random rnd = new Random(5);
        for (int i = 0; i < 10; i++) {
            aux = new Articulo("Nombre_" + rnd.nextInt(100), rnd.nextInt(100));
            inventario_laboratorio.agregarArticulo(aux);
        }

        //IMPRESION DE TODOS LOS OBJETOS
        for (int i = 0; i < 10; i++) {
            aux = inventario_laboratorio.obtenerArticuloDelIndice(i);
            //System.out.println(aux.toString());
            System.out.println(aux);
        }
        System.out.println();

        //inventario_laboratorio.ordenarInventario();
        inventario_laboratorio.ordenarPorCantidad();

        //impresion de los objetos ordenados
        System.out.println("Ordenados:");
        for (int i = 0; i < 10; i++) {
            aux = inventario_laboratorio.obtenerArticuloDelIndice(i);
            //System.out.println(aux.toString());
            System.out.println(aux);
        }
        System.out.println();

*/

        //PARTE 3
        //no se pueden generar objetos de clases abstractas
        Persona p;
        p = new Alumno(0, "Javier");
        p.saludar("Jasinto");
        p.despedirse();

        p = new Docente(1, "PP");
        p.saludar("Miguel");
        p.despedirse();

    }
}
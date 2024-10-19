package api_inventario_robotica;

import java.util.LinkedList;

public class Inventario {

    //estructuras estaticas (arrays normales)

    //estructuras dinamicas (listas enlazadas, listas doblemente enlazadas, listas circulares, arboles, etc)

    private LinkedList<Articulo> articulos; //LISTA DOBLEMENTE ENLAZADA

    public Inventario(){
        articulos = new LinkedList<>(); //instancia la lista que almacenara a los articulos
    }

    public String agregarArticulo(Articulo articulo){ //TDA = Tipo de Dato Abstracto
        articulos.add(articulo);
        return "Articulo Agregado";
    }

    public Articulo obtenerArticuloDelIndice(int indice){
        Articulo articulo = null;

        if (indice >= 0 && articulos.size()>= indice){
            articulo = articulos.get(indice);
        }

        return articulo;
    }

}

package api_inventario_robotica;

import java.util.Comparator;

public class OrdenamientoArticuloCantidad implements Comparator<Articulo> {
    @Override
    public int compare(Articulo obj1, Articulo obj2) { //cmp
        int v = obj1.obtenerCantidad() - obj2.obtenerCantidad();
        //Double.compare()  --- si fueran double!
        return v;
    }
}

package Acciones_DatosDePrueba;

import static Inicio.Inicio_Random.rproducto_1;
import static Inicio.Inicio_Random.rproducto_2;
import static Inicio.Inicio_Random.rproducto_3;
import static Inicio.Inicio_Random.rproducto_4;
import static Inicio.Inicio_Random.producto_1;
import static Inicio.Inicio_Random.producto_2;
import static Inicio.Inicio_Random.producto_3;
import static Inicio.Inicio_Random.producto_4;

/**
 *
 * @author Rau
 */
public class DatosdePrueba {

    /*En esta sección se debe poder observar una lista de datos
    precargados correspondientes a la cantidad de unidades de artículos disponibles en 
    2 cada bodega. Estos datos se cargarán a la hora de ejecutar el programa, desde consola.
    Vendrá de la siguiente forma: No. De Bodega [espacio] Articulo [espacio] Cantidad*/
    private int bodega;

    public DatosdePrueba() {
        for (int i = 0; i < 9; i++) {
            producto_1[i] = rproducto_1;
            producto_2[i] = rproducto_2;
            producto_3[i] = rproducto_3;
            producto_4[i] = rproducto_4;

        }
        for (int i = 0; i < 9; i++) {
            bodega = i + 1;
            System.out.println("\nLa Bodega No. " + bodega + " Tiene Del Producto 1: " + Inicio.Inicio_Random.producto_1[i]);
            System.out.println("La Bodega No. " + bodega + " Tiene Del Producto 2: " + Inicio.Inicio_Random.producto_2[i]);
            System.out.println("La Bodega No. " + bodega + " Tiene Del Producto 3: " + Inicio.Inicio_Random.producto_3[i]);
            System.out.println("La Bodega No. " + bodega + " Tiene Del Producto 4: " + Inicio.Inicio_Random.producto_4[i]);

        }

    }

}

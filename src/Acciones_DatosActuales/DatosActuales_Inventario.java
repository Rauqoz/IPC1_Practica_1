package Acciones_DatosActuales;

import static Inicio.Inicio_Random.producto_1;
import static Inicio.Inicio_Random.producto_2;
import static Inicio.Inicio_Random.producto_3;
import static Inicio.Inicio_Random.producto_4;

/**
 *
 * @author Rau
 */
public class DatosActuales_Inventario {

    /*Mostrará el inventario de todas las bodegas en forma de
    tabla.*/
    private int bodega;

    public DatosActuales_Inventario() {

        for (int i = 0; i < 9; i++) {
            bodega = i + 1;
            System.out.println("La Bodega No. " + bodega + " Producto 1:    " + producto_1[i] + "   Producto 2:     " + producto_2[i] + "   Producto 3:     " + producto_3[i] + "   Producto 4:     " + producto_4[i]);

        }

    }

}

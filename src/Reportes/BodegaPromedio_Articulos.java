package Reportes;

import static Inicio.Inicio_Random.producto_1;
import static Inicio.Inicio_Random.producto_2;
import static Inicio.Inicio_Random.producto_3;
import static Inicio.Inicio_Random.producto_4;

/**
 *
 * @author Rau
 */
public class BodegaPromedio_Articulos {

    int bodegasuma[] = new int[9];
    int posicion = 0;

    public BodegaPromedio_Articulos() {

        for (int i = 0; i < 9; i++) {
            bodegasuma[i] = producto_1[i] + producto_2[i] + producto_3[i] + producto_4[i];
            posicion = i;
            System.out.println("*La Bodega: " + (posicion + 1) + " Tiene un Promedio de: " + (bodegasuma[i] / 4) + " Articulos");

        }

    }

}

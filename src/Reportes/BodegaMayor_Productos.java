package Reportes;

import static Inicio.Inicio_Random.producto_1;
import static Inicio.Inicio_Random.producto_2;
import static Inicio.Inicio_Random.producto_3;
import static Inicio.Inicio_Random.producto_4;

/**
 *
 * @author Rau
 */
public class BodegaMayor_Productos {

    int bodegasuma[] = new int[9];
    int posicion = 0, nmayor = 0;

    public BodegaMayor_Productos() {

        for (int i = 0; i < 9; i++) {
            bodegasuma[i] = producto_1[i] + producto_2[i] + producto_3[i] + producto_4[i];

        }

        for (int i = 0; i < 9; i++) {

            if (nmayor < bodegasuma[i]) {
                nmayor = bodegasuma[i];
                posicion = i;
            } else {
                nmayor = nmayor;
                posicion = posicion;

            }

        }

        System.out.println("\nLa Bodega No. " + (posicion + 1) + " es la mas Alta y Tiene : " + nmayor + " Productos en Total");

    }

}

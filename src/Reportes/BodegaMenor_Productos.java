package Reportes;

import static Inicio.Inicio_Random.producto_1;
import static Inicio.Inicio_Random.producto_2;
import static Inicio.Inicio_Random.producto_3;
import static Inicio.Inicio_Random.producto_4;

/**
 *
 * @author Rau
 */
public class BodegaMenor_Productos {

    int bodegasuma[] = new int[9];
    int posicion = 0, nmenor = 1000;

    public BodegaMenor_Productos() {

        for (int i = 0; i < 9; i++) {
            bodegasuma[i] = producto_1[i] + producto_2[i] + producto_3[i] + producto_4[i];

        }

        for (int i = 0; i < 9; i++) {

            if (nmenor > bodegasuma[i]) {
                nmenor = bodegasuma[i];
                posicion = i;

            } else {

                nmenor = nmenor;
                posicion = posicion;
            }

        }

        System.out.println("\nLa Bodega No. " + (posicion + 1) + " es la mas Baja y Tiene : " + nmenor + " Productos en Total");

    }

}

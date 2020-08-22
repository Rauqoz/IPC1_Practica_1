package Reportes;

import static Inicio.Inicio_Random.producto_1;
import static Inicio.Inicio_Random.producto_2;
import static Inicio.Inicio_Random.producto_3;
import static Inicio.Inicio_Random.producto_4;

/**
 *
 * @author Rau
 */
public class BodegaMenor_Por_Articulo {

    int posicion1, posicion2, posicion3, posicion4;
    int nmenor1 = 1000, nmenor2 = 1000, nmenor3 = 1000, nmenor4 = 1000;

    public BodegaMenor_Por_Articulo() {

        for (int i = 0; i < 9; i++) {

            if (nmenor1 > producto_1[i]) {
                nmenor1 = producto_1[i];
                posicion1 = i;
            } else {
                nmenor1 = nmenor1;
                posicion1 = posicion1;

            }
        }

        for (int i = 0; i < 9; i++) {

            if (nmenor2 > producto_2[i]) {
                nmenor2 = producto_2[i];
                posicion2 = i;
            } else {
                nmenor2 = nmenor2;
                posicion2 = posicion2;

            }
        }

        for (int i = 0; i < 9; i++) {

            if (nmenor3 > producto_3[i]) {
                nmenor3 = producto_3[i];
                posicion3 = i;
            } else {
                nmenor3 = nmenor3;
                posicion3 = posicion3;

            }
        }
        for (int i = 0; i < 9; i++) {

            if (nmenor4 > producto_4[i]) {
                nmenor4 = producto_4[i];
                posicion4 = i;
            } else {
                nmenor4 = nmenor4;
                posicion4 = posicion4;

            }
        }

        System.out.println("\nLa Bodega No. " + (posicion1 + 1) + " es la mas Baja y Tiene : " + nmenor1 + " del Producto 1 en Total");
        System.out.println("La Bodega No. " + (posicion2 + 1) + " es la mas Baja y Tiene : " + nmenor2 + " del Producto 2 en Total");
        System.out.println("La Bodega No. " + (posicion3 + 1) + " es la mas Baja y Tiene : " + nmenor3 + " del Producto 3 en Total");
        System.out.println("La Bodega No. " + (posicion4 + 1) + " es la mas Baja y Tiene : " + nmenor4 + " del Producto 4 en Total");

    }

}

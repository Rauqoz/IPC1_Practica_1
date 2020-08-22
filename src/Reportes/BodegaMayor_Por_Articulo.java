package Reportes;

import static Inicio.Inicio_Random.producto_1;
import static Inicio.Inicio_Random.producto_2;
import static Inicio.Inicio_Random.producto_3;
import static Inicio.Inicio_Random.producto_4;

/**
 *
 * @author Rau
 */
public class BodegaMayor_Por_Articulo {

    int posicion1, posicion2, posicion3, posicion4;
    int nmayor1 = 0, nmayor2 = 0, nmayor3 = 0, nmayor4 = 0;

    public BodegaMayor_Por_Articulo() {

        for (int i = 0; i < 9; i++) {

            if (nmayor1 < producto_1[i]) {
                nmayor1 = producto_1[i];
                posicion1 = i;
            } else {
                nmayor1 = nmayor1;
                posicion1 = posicion1;

            }
        }

        for (int i = 0; i < 9; i++) {

            if (nmayor2 < producto_2[i]) {
                nmayor2 = producto_2[i];
                posicion2 = i;
            } else {
                nmayor2 = nmayor2;
                posicion2 = posicion2;

            }
        }

        for (int i = 0; i < 9; i++) {

            if (nmayor3 < producto_3[i]) {
                nmayor3 = producto_3[i];
                posicion3 = i;
            } else {
                nmayor3 = nmayor3;
                posicion3 = posicion3;

            }
        }
        for (int i = 0; i < 9; i++) {

            if (nmayor4 < producto_4[i]) {
                nmayor4 = producto_4[i];
                posicion4 = i;
            } else {
                nmayor4 = nmayor4;
                posicion4 = posicion4;

            }
        }

        System.out.println("\nLa Bodega No. " + (posicion1 + 1) + " es la mas Alta y Tiene : " + nmayor1 + " del Producto 1 en Total");
        System.out.println("La Bodega No. " + (posicion2 + 1) + " es la mas Alta y Tiene : " + nmayor2 + " del Producto 2 en Total");
        System.out.println("La Bodega No. " + (posicion3 + 1) + " es la mas Alta y Tiene : " + nmayor3 + " del Producto 3 en Total");
        System.out.println("La Bodega No. " + (posicion4 + 1) + " es la mas Alta y Tiene : " + nmayor4 + " del Producto 4 en Total");

    }

}

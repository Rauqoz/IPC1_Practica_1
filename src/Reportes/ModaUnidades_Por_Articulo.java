package Reportes;

import static Inicio.Inicio_Random.producto_1;
import static Inicio.Inicio_Random.producto_2;
import static Inicio.Inicio_Random.producto_3;
import static Inicio.Inicio_Random.producto_4;

/**
 *
 * @author Rau
 */
public class ModaUnidades_Por_Articulo {

    int sa1 = producto_1[0] + producto_1[1] + producto_1[2] + producto_1[3] + producto_1[4] + producto_1[5] + producto_1[6] + producto_1[7] + producto_1[8];
    int sa2 = producto_2[0] + producto_2[1] + producto_2[2] + producto_2[3] + producto_2[4] + producto_2[5] + producto_2[6] + producto_2[7] + producto_2[8];
    int sa3 = producto_3[0] + producto_3[1] + producto_3[2] + producto_3[3] + producto_3[4] + producto_3[5] + producto_3[6] + producto_3[7] + producto_3[8];
    int sa4 = producto_4[0] + producto_4[1] + producto_4[2] + producto_4[3] + producto_4[4] + producto_4[5] + producto_4[6] + producto_4[7] + producto_4[8];
    int sarticulos[] = new int[4];
    int nmayor = 0, posicion;

    public ModaUnidades_Por_Articulo() {

        sarticulos[0] = sa1;
        sarticulos[1] = sa2;
        sarticulos[2] = sa3;
        sarticulos[3] = sa4;

        for (int i = 0; i < 4; i++) {

            if (nmayor < sarticulos[i]) {
                nmayor = sarticulos[i];
                posicion = i;
            } else {
                nmayor = nmayor;
                posicion = posicion;

            }

        }

        System.out.println("\nEl Articulo No. " + (posicion + 1) + " es la Moda y Tiene : " + nmayor + " Cantidades de Articulo");

    }

}

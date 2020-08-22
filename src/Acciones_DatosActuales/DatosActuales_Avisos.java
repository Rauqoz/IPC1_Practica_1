package Acciones_DatosActuales;

import static Inicio.Inicio_Random.producto_1;
import static Inicio.Inicio_Random.producto_2;
import static Inicio.Inicio_Random.producto_3;
import static Inicio.Inicio_Random.producto_4;
import static Inicio.Inicio_Random.rproducto_1;
import static Inicio.Inicio_Random.rproducto_2;
import static Inicio.Inicio_Random.rproducto_3;
import static Inicio.Inicio_Random.rproducto_4;


/*
 *
 * @author Rau
 */
public class DatosActuales_Avisos {

    /*Mostrar un mensaje correspondiente de cómo se encuentra la situación
de las bodegas, si ningún artículo de la bodega se encuentra por debajo del 50%
se debe mostrar “La bodega numero X, se encuentra bien”, de lo contrario si está
por debajo del 50% y por encima del 20% mostrara “El producto X en la Bodega Y
se está agotando”, si está por debajo del 20% pero aún queda al menos 1 se
mostrara “Estado crítico el producto X en la Bodega Y está a punto de acabarse”
y si ya no quedan existencias mostrara “El producto X en la Bodega Y esta
agotado”.*/
    private int bodega, p1, p2, p3, p4;
    

    public DatosActuales_Avisos() {

       

        for (int i = 0; i < 9; i++) {
            bodega = i + 1;
            p1 = 1;
            p2 = 2;
            p3 = 3;
            p4 = 4;

            if (producto_1[i] < (rproducto_1 * 0.5) && producto_1[i] > (rproducto_1 * 0.2)) {
                System.out.println(" - El Producto: " + p1 + " en la Bodega No. " + bodega + " Se esta Agotando");

            } else if (producto_2[i] < (rproducto_2 * 0.5) && producto_2[i] > (rproducto_2 * 0.2)) {
                System.out.println(" -El Producto: " + p2 + " en la Bodega No. " + bodega + " Se esta Agotando");

            } else if (producto_3[i] < (rproducto_3* 0.5) && producto_3[i] > (rproducto_3 * 0.2)) {
                System.out.println(" -El Producto: " + p3 + " en la Bodega No. " + bodega + " Se esta Agotando");

            } else if (producto_4[i] < (rproducto_4 * 0.5) && producto_4[i] > (rproducto_4 * 0.2)) {
                System.out.println(" -El Producto: " + p4 + " en la Bodega No. " + bodega + " Se esta Agotando");

            } else if (producto_1[i] < (rproducto_1 * 0.2) && producto_1[i] > 1) {
                System.out.println(" -El Producto: " + p1 + " en la Bodega No. " + bodega + " Esta a Punto de acabarse");

            } else if (producto_2[i] < (rproducto_2 * 0.2) && producto_2[i] > 1) {
                System.out.println(" -El Producto: " + p2 + " en la Bodega No. " + bodega + " Esta a Punto de acabarse");

            } else if (producto_3[i] < (rproducto_3 * 0.2) && producto_3[i] > 1) {
                System.out.println(" -El Producto: " + p3 + " en la Bodega No. " + bodega + " Esta a Punto de acabarse");

            } else if (producto_4[i] < (rproducto_4 * 0.2) && producto_4[i] > 1) {
                System.out.println(" -El Producto: " + p4 + " en la Bodega No. " + bodega + " Esta a Punto de acabarse");

            } else if (producto_1[i] == 0) {
                System.out.println(" -El Producto: " + p1 + " en la Bodega No. " + bodega + " Ya No esta en Existencia");

            } else if (producto_2[i] == 0) {
                System.out.println(" -El Producto: " + p2 + " en la Bodega No. " + bodega + " Ya No esta en Existencia");

            } else if (producto_3[i] == 0) {
                System.out.println(" -El Producto: " + p3 + " en la Bodega No. " + bodega + " Ya No esta en Existencia");

            } else if (producto_4[i] == 0) {
                System.out.println(" -El Producto: " + p4 + " en la Bodega No. " + bodega + " Ya No esta en Existencia");

            } else if (producto_1[i] >= (producto_1[i] * 0.5) && producto_2[i] >= (producto_2[i] * 0.5) && producto_3[i] >= (producto_3[i] * 0.5) && producto_4[i] >= (producto_4[i] * 0.5)) {
                System.out.println(" -La Bodega No. " + bodega + " Se encuentra Bien");

            }

        }

    }

}

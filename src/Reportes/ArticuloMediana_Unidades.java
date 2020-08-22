package Reportes;

import static Inicio.Inicio_Random.producto_1;
import static Inicio.Inicio_Random.producto_2;
import static Inicio.Inicio_Random.producto_3;
import static Inicio.Inicio_Random.producto_4;

/**
 *
 * @author Rau
 */
public class ArticuloMediana_Unidades {

    int aux1,aux2,aux3,aux4,p;
    int producto_1o[] = new int[9];
    int producto_2o[] = new int[9];
    int producto_3o[] = new int[9];
    int producto_4o[] = new int[9];

    public ArticuloMediana_Unidades() {

        for (int i = 0; i < 9; i++) {

            producto_1o[i] = producto_1[i];
            producto_2o[i] = producto_2[i];
            producto_3o[i] = producto_3[i];
            producto_4o[i] = producto_4[i];

        }
        
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (producto_1o[j] > producto_1o[j+1]) {
                    aux1 = producto_1o[j];
                    producto_1o[j] = producto_1o[j+1];
                    producto_1o[j+1] = aux1;
                }
                
                if (producto_2o[j] > producto_2o[j+1]) {
                    aux2 = producto_2o[j];
                    producto_2o[j] = producto_2o[j+1];
                    producto_2o[j+1] = aux2;
                }
                if (producto_3o[j] > producto_3o[j+1]) {
                    aux3 = producto_3o[j];
                    producto_3o[j] = producto_3o[j+1];
                    producto_3o[j+1] = aux3;
                }
                if (producto_4o[j] > producto_4o[j+1]) {
                    aux4 = producto_4o[j];
                    producto_4o[j] = producto_4o[j+1];
                    producto_4o[j+1] = aux4;
                }
            }
        }
        
        System.out.print("Articulos Ordenados del Producto 1: ");//producto 1
        for (int i = 0; i < 9; i++) {
            System.out.print(producto_1o[i] + " - ");
        }
        System.out.print("\n *La Mediana del Producto 1 es: " + producto_1o[4]);
        System.out.print("\n ------------------------------------");
        
        
        System.out.print("\nArticulos Ordenados del Producto 2: ");//producto 2
        for (int i = 0; i < 9; i++) {
            System.out.print(producto_2o[i] + " - ");   
        }
        System.out.print("\n *La Mediana del Producto 2 es: " + producto_2o[4]);
        System.out.print("\n ------------------------------------");
        
        System.out.print("\nArticulos Ordenados del Producto 3: ");//producto 3
        for (int i = 0; i < 9; i++) {
            System.out.print(producto_3o[i] + " - ");
        }
        System.out.print("\n *La Mediana del Producto 3 es: " + producto_3o[4]);
        System.out.print("\n ------------------------------------");
        
        System.out.print("\nArticulos Ordenados del Producto 4: ");//producto 4
        for (int i = 0; i < 9; i++) {
            System.out.print(producto_4o[i] + " - ");   
        }
        System.out.print("\n *La Mediana del Producto 4 es: " + producto_4o[4]);
        System.out.print("\n ------------------------------------");
        

    }
}

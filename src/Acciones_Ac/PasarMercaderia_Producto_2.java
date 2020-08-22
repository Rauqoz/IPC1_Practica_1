package Acciones_Ac;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rau
 */
public class PasarMercaderia_Producto_2 {

    /*Permite pasar mercadería de una bodega a otra, se tiene que
hacer las validaciones que las bodegas existan, y que la cantidad de la bodega
origen tenga la cantidad a pasar y que la bodega destino tiene la capacidad
necesaria, primero viene la bodega origen, luego la bodega destino, el producto y
por último la cantidad.*/
    Scanner sn = new Scanner(System.in);
    public static int nbodega0;
    //variable para poder salir del ciclo ya inicializada
    private boolean salir;
    int producto_1o[] = new int[9];

    public PasarMercaderia_Producto_2() {
        do {
            //try para cuando el usuario ingresa algun caracter que no es numero entero
            try {
                //pedir el numero de opcion

                salir = true;
                System.out.println("\nProducto 2");
                System.out.println("0 - Regresar");
                System.out.println("Bodegas del 1 - 9");
                System.out.print("De que Bodega Deseas Pasar Mercaderia: ");
                nbodega0 = sn.nextInt();
                switch (nbodega0) {
                    case 1:
                        PasarMercaderia_2_A_Otra pasarMercaderia_2_A_Otra1 = new PasarMercaderia_2_A_Otra();
                        salir = false;
                        break;

                    case 2:
                        PasarMercaderia_2_A_Otra pasarMercaderia_2_A_Otra2 = new PasarMercaderia_2_A_Otra();
                        salir = false;
                        break;

                    case 3:
                        PasarMercaderia_2_A_Otra pasarMercaderia_2_A_Otra3 = new PasarMercaderia_2_A_Otra();
                        salir = false;
                        break;

                    case 4:
                        PasarMercaderia_2_A_Otra pasarMercaderia_2_A_Otra4 = new PasarMercaderia_2_A_Otra();
                        salir = false;
                        break;

                    case 5:
                        PasarMercaderia_2_A_Otra pasarMercaderia_2_A_Otra5 = new PasarMercaderia_2_A_Otra();
                        salir = false;
                        break;

                    case 6:
                        PasarMercaderia_2_A_Otra pasarMercaderia_2_A_Otra6 = new PasarMercaderia_2_A_Otra();
                        salir = false;
                        break;

                    case 7:
                        PasarMercaderia_2_A_Otra pasarMercaderia_2_A_Otra7 = new PasarMercaderia_2_A_Otra();
                        salir = false;
                        break;

                    case 8:
                        PasarMercaderia_2_A_Otra pasarMercaderia_2_A_Otra8 = new PasarMercaderia_2_A_Otra();
                        salir = false;
                        break;

                    case 9:
                        PasarMercaderia_2_A_Otra pasarMercaderia_2_A_Otra9 = new PasarMercaderia_2_A_Otra();
                        salir = false;
                        break;

                    case 0:
                        //si selecciona la opcion "0" el valor salir cambia para sellar el ciclo
                        System.out.println("\n Regresamos ");
                        salir = false;
                        break;
                    default:
                        //default para cuando el usuario ingresa un numero que no esta dentro de las opciones
                        System.out.println("\n -- Debes Colocar un Numero del Menu --");
                        break;
                }
                //catch para cuando el usuario ingresa algun caracter que no es un numero, ejemplo "asd"
            } catch (InputMismatchException e) {
                //mensaje al ingresar algo que no es numero
                System.out.println("\n -- No se Admiten Letras --");
                //esto sirve para retomar el ingreso de datos y el flujo normal del ciclo do
                sn.next();
            }
        } while (salir != false); //si la variable es igual a true, la inicializada en false, se cierra el ciclo y finaliza el programa

    }

}

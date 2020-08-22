package Acciones_Ac;

import static Inicio.Inicio_Random.producto_1;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rau
 */
public class SacarMercaderia_Producto_1 {

    /*permite sacar productos de una bodega, la forma será la
siguiente, se ingresa el número de bodega (se tiene que verificar que exista),
luego se ingresa el producto (se verifica igual su existencia) y luego la cantidad,
se tiene que verificar que la cantidad no exceda el inventario actual de esa
bodega. De ser correcto nos mostrara un mensaje de éxito, luego nos regresara
al menú de acciones.*/
    Scanner sn = new Scanner(System.in);
    private int opcion, nbodega, cantidad, quedan;
    //variable para poder salir del ciclo ya inicializada
    private boolean salir;

    public SacarMercaderia_Producto_1() {

        do {
            //try para cuando el usuario ingresa algun caracter que no es numero entero
            try {

                //pedir el numero de opcion
                salir = true;
                System.out.println("\n* Producto 1");
                System.out.println("0 - Regresar");
                System.out.println("Bodegas del 1 - 9");
                System.out.print("Selecciona la Bodega a la Cual Sacar Mercaderia: ");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.print("\n * Cuanto deseas Sacar del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega = opcion - 1;
                        if (cantidad > producto_1[nbodega]) {
                            quedan = producto_1[nbodega];
                            System.out.println(" - No hay Suficiente Producto, Pero Quedan: " + quedan);
                            salir = false;
                            break;
                        } else {
                            producto_1[nbodega] -= cantidad;
                            System.out.println(" - Exito al Sacar Mercaderia");
                            salir = false;
                            break;
                        }
                    case 2:

                        System.out.print("\n * Cuanto deseas Sacar del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega = opcion - 1;
                        if (cantidad > producto_1[nbodega]) {
                            quedan = producto_1[nbodega];
                            System.out.println(" - No hay Suficiente Producto, Pero Quedan: " + quedan);
                            salir = false;
                            break;
                        } else {
                            producto_1[nbodega] -= cantidad;
                            System.out.println(" - Exito al Sacar Mercaderia");
                            salir = false;
                            break;
                        }
                    case 3:

                        System.out.print("\n * Cuanto deseas Sacar del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega = opcion - 1;
                        if (cantidad > producto_1[nbodega]) {
                            quedan = producto_1[nbodega];
                            System.out.println(" - No hay Suficiente Producto, Pero Quedan: " + quedan);
                            salir = false;
                            break;
                        } else {
                            producto_1[nbodega] -= cantidad;
                            System.out.println(" - Exito al Sacar Mercaderia");
                            salir = false;
                            break;
                        }
                    case 4:

                        System.out.print("\n * Cuanto deseas Sacar del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega = opcion - 1;
                        if (cantidad > producto_1[nbodega]) {
                            quedan = producto_1[nbodega];
                            System.out.println(" - No hay Suficiente Producto, Pero Quedan: " + quedan);
                            salir = false;
                            break;
                        } else {
                            producto_1[nbodega] -= cantidad;
                            System.out.println(" - Exito al Sacar Mercaderia");
                            salir = false;
                            break;
                        }
                    case 5:

                        System.out.print("\n * Cuanto deseas Sacar del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega = opcion - 1;
                        if (cantidad > producto_1[nbodega]) {
                            quedan = producto_1[nbodega];
                            System.out.println(" - No hay Suficiente Producto, Pero Quedan: " + quedan);
                            salir = false;
                            break;
                        } else {
                            producto_1[nbodega] -= cantidad;
                            System.out.println(" - Exito al Sacar Mercaderia");
                            salir = false;
                            break;
                        }
                    case 6:

                        System.out.print("\n * Cuanto deseas Sacar del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega = opcion - 1;
                        if (cantidad > producto_1[nbodega]) {
                            quedan = producto_1[nbodega];
                            System.out.println(" - No hay Suficiente Producto, Pero Quedan: " + quedan);
                            salir = false;
                            break;
                        } else {
                            producto_1[nbodega] -= cantidad;
                            System.out.println(" - Exito al Sacar Mercaderia");
                            salir = false;
                            break;
                        }
                    case 7:

                        System.out.print("\n * Cuanto deseas Sacar del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega = opcion - 1;
                        if (cantidad > producto_1[nbodega]) {
                            quedan = producto_1[nbodega];
                            System.out.println(" - No hay Suficiente Producto, Pero Quedan: " + quedan);
                            salir = false;
                            break;
                        } else {
                            producto_1[nbodega] -= cantidad;
                            System.out.println(" - Exito al Sacar Mercaderia");
                            salir = false;
                            break;
                        }
                    case 8:

                        System.out.print("\n * Cuanto deseas Sacar del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega = opcion - 1;
                        if (cantidad > producto_1[nbodega]) {
                            quedan = producto_1[nbodega];
                            System.out.println(" - No hay Suficiente Producto, Pero Quedan: " + quedan);
                            salir = false;
                            break;
                        } else {
                            producto_1[nbodega] -= cantidad;
                            System.out.println(" - Exito al Sacar Mercaderia");
                            salir = false;
                            break;
                        }
                    case 9:

                        System.out.print("\n * Cuanto deseas Sacar del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega = opcion - 1;
                        if (cantidad > producto_1[nbodega]) {
                            quedan = producto_1[nbodega];
                            System.out.println(" - No hay Suficiente Producto, Pero Quedan: " + quedan);
                            salir = false;
                            break;
                        } else {
                            producto_1[nbodega] -= cantidad;
                            System.out.println(" - Exito al Sacar Mercaderia");
                            salir = false;
                            break;
                        }

                    case 0:
                        //si selecciona la opcion "0" el valor salir cambia para sellar el ciclo
                        System.out.println("\n - Regresamos ");
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

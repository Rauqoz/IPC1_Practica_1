package Acciones_Ac;

import static Acciones_Ac.PasarMercaderia_Producto_4.nbodega0;
import static Inicio.Inicio_Random.producto_4;
import static Inicio.Inicio_Random.z;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rau
 */
public class PasarMercaderia_4_A_Otra {

    /*Permite pasar mercadería de una bodega a otra, se tiene que
hacer las validaciones que las bodegas existan, y que la cantidad de la bodega
origen tenga la cantidad a pasar y que la bodega destino tiene la capacidad
necesaria, primero viene la bodega origen, luego la bodega destino, el producto y
por último la cantidad.*/
    Scanner sn = new Scanner(System.in);
    private int opcion, nbodega1, nbodega2, cantidad;
    //variable para poder salir del ciclo ya inicializada
    private boolean salir;
    int producto_4o[] = new int[9];

    public PasarMercaderia_4_A_Otra() {

        do {
            //try para cuando el usuario ingresa algun caracter que no es numero entero
            try {
                //pedir el numero de opcion

                salir = true;
                System.out.println("\nA que Bodega Deseas Moverla: ");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        for (int i = 0; i < 9; i++) {

                            producto_4o[i] = producto_4[i];

                        }
                        if (nbodega0 == opcion) {
                            System.out.print("- No se Puede Pasar Mercaderia a la Misma Bodega");
                            salir = false;
                            break;
                        }

                        System.out.print("\nCuanto deseas Mover del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega1 = nbodega0 - 1;
                        nbodega2 = opcion - 1;
                        if (producto_4[nbodega1] > cantidad && (producto_4[nbodega2] + cantidad) < z + 1) {
                            producto_4[nbodega2] = producto_4o[nbodega2] + cantidad;
                            producto_4[nbodega1] = producto_4o[nbodega1] - cantidad;
                            System.out.println("- Exito al Pasar Mercaderia");
                            salir = false;
                            break;
                        } else if (producto_4[nbodega1] < cantidad) {
                            System.out.println("- No se Puede Mover Hay Poco Producto");
                            salir = false;
                            break;

                        } else if ((producto_4[nbodega2] + cantidad) > z + 1) {
                            System.out.println("- No se Puede Mover No Hay Espacio");
                            salir = false;
                            break;
                        }

                    case 2:
                        for (int i = 0; i < 9; i++) {

                            producto_4o[i] = producto_4[i];

                        }
                        if (nbodega0 == opcion) {
                            System.out.print("- No se Puede Pasar Mercaderia a la Misma Bodega");
                            salir = false;
                            break;
                        }

                        System.out.print("\nCuanto deseas Mover del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega1 = nbodega0 - 1;
                        nbodega2 = opcion - 1;
                        if (producto_4[nbodega1] > cantidad && (producto_4[nbodega2] + cantidad) < z + 1) {
                            producto_4[nbodega2] = producto_4o[nbodega2] + cantidad;
                            producto_4[nbodega1] = producto_4o[nbodega1] - cantidad;
                            System.out.println("- Exito al Pasar Mercaderia");
                            salir = false;
                            break;
                        } else if (producto_4[nbodega1] < cantidad) {
                            System.out.println("- No se Puede Mover Hay Poco Producto");
                            salir = false;
                            break;

                        } else if ((producto_4[nbodega2] + cantidad) > z + 1) {
                            System.out.println("- No se Puede Mover No Hay Espacio");
                            salir = false;
                            break;
                        }
                    case 3:
                        for (int i = 0; i < 9; i++) {

                            producto_4o[i] = producto_4[i];

                        }
                        if (nbodega0 == opcion) {
                            System.out.print("- No se Puede Pasar Mercaderia a la Misma Bodega");
                            salir = false;
                            break;
                        }

                        System.out.print("\nCuanto deseas Mover del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega1 = nbodega0 - 1;
                        nbodega2 = opcion - 1;
                        if (producto_4[nbodega1] > cantidad && (producto_4[nbodega2] + cantidad) < z + 1) {
                            producto_4[nbodega2] = producto_4o[nbodega2] + cantidad;
                            producto_4[nbodega1] = producto_4o[nbodega1] - cantidad;
                            System.out.println("- Exito al Pasar Mercaderia");
                            salir = false;
                            break;
                        } else if (producto_4[nbodega1] < cantidad) {
                            System.out.println("- No se Puede Mover Hay Poco Producto");
                            salir = false;
                            break;

                        } else if ((producto_4[nbodega2] + cantidad) > z + 1) {
                            System.out.println("- No se Puede Mover No Hay Espacio");
                            salir = false;
                            break;
                        }
                    case 4:
                        for (int i = 0; i < 9; i++) {

                            producto_4o[i] = producto_4[i];

                        }
                        if (nbodega0 == opcion) {
                            System.out.print("- No se Puede Pasar Mercaderia a la Misma Bodega");
                            salir = false;
                            break;
                        }

                        System.out.print("\nCuanto deseas Mover del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega1 = nbodega0 - 1;
                        nbodega2 = opcion - 1;
                        if (producto_4[nbodega1] > cantidad && (producto_4[nbodega2] + cantidad) < z + 1) {
                            producto_4[nbodega2] = producto_4o[nbodega2] + cantidad;
                            producto_4[nbodega1] = producto_4o[nbodega1] - cantidad;
                            System.out.println("- Exito al Pasar Mercaderia");
                            salir = false;
                            break;
                        } else if (producto_4[nbodega1] < cantidad) {
                            System.out.println("- No se Puede Mover Hay Poco Producto");
                            salir = false;
                            break;

                        } else if ((producto_4[nbodega2] + cantidad) > z + 1) {
                            System.out.println("- No se Puede Mover No Hay Espacio");
                            salir = false;
                            break;
                        }
                    case 5:
                        for (int i = 0; i < 9; i++) {

                            producto_4o[i] = producto_4[i];

                        }
                        if (nbodega0 == opcion) {
                            System.out.print("- No se Puede Pasar Mercaderia a la Misma Bodega");
                            salir = false;
                            break;
                        }

                        System.out.print("\nCuanto deseas Mover del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega1 = nbodega0 - 1;
                        nbodega2 = opcion - 1;
                        if (producto_4[nbodega1] > cantidad && (producto_4[nbodega2] + cantidad) < z + 1) {
                            producto_4[nbodega2] = producto_4o[nbodega2] + cantidad;
                            producto_4[nbodega1] = producto_4o[nbodega1] - cantidad;
                            System.out.println("- Exito al Pasar Mercaderia");
                            salir = false;
                            break;
                        } else if (producto_4[nbodega1] < cantidad) {
                            System.out.println("- No se Puede Mover Hay Poco Producto");
                            salir = false;
                            break;

                        } else if ((producto_4[nbodega2] + cantidad) > z + 1) {
                            System.out.println("- No se Puede Mover No Hay Espacio");
                            salir = false;
                            break;
                        }
                    case 6:
                        for (int i = 0; i < 9; i++) {

                            producto_4o[i] = producto_4[i];

                        }
                        if (nbodega0 == opcion) {
                            System.out.print("- No se Puede Pasar Mercaderia a la Misma Bodega");
                            salir = false;
                            break;
                        }

                        System.out.print("\nCuanto deseas Mover del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega1 = nbodega0 - 1;
                        nbodega2 = opcion - 1;
                        if (producto_4[nbodega1] > cantidad && (producto_4[nbodega2] + cantidad) < z + 1) {
                            producto_4[nbodega2] = producto_4o[nbodega2] + cantidad;
                            producto_4[nbodega1] = producto_4o[nbodega1] - cantidad;
                            System.out.println("- Exito al Pasar Mercaderia");
                            salir = false;
                            break;
                        } else if (producto_4[nbodega1] < cantidad) {
                            System.out.println("- No se Puede Mover Hay Poco Producto");
                            salir = false;
                            break;

                        } else if ((producto_4[nbodega2] + cantidad) > z + 1) {
                            System.out.println("- No se Puede Mover No Hay Espacio");
                            salir = false;
                            break;
                        }
                    case 7:
                        for (int i = 0; i < 9; i++) {

                            producto_4o[i] = producto_4[i];

                        }
                        if (nbodega0 == opcion) {
                            System.out.print("- No se Puede Pasar Mercaderia a la Misma Bodega");
                            salir = false;
                            break;
                        }

                        System.out.print("\nCuanto deseas Mover del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega1 = nbodega0 - 1;
                        nbodega2 = opcion - 1;
                        if (producto_4[nbodega1] > cantidad && (producto_4[nbodega2] + cantidad) < z + 1) {
                            producto_4[nbodega2] = producto_4o[nbodega2] + cantidad;
                            producto_4[nbodega1] = producto_4o[nbodega1] - cantidad;
                            System.out.println("- Exito al Pasar Mercaderia");
                            salir = false;
                            break;
                        } else if (producto_4[nbodega1] < cantidad) {
                            System.out.println("- No se Puede Mover Hay Poco Producto");
                            salir = false;
                            break;

                        } else if ((producto_4[nbodega2] + cantidad) > z + 1) {
                            System.out.println("- No se Puede Mover No Hay Espacio");
                            salir = false;
                            break;
                        }
                    case 8:
                        for (int i = 0; i < 9; i++) {

                            producto_4o[i] = producto_4[i];

                        }
                        if (nbodega0 == opcion) {
                            System.out.print("- No se Puede Pasar Mercaderia a la Misma Bodega");
                            salir = false;
                            break;
                        }

                        System.out.print("\nCuanto deseas Mover del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega1 = nbodega0 - 1;
                        nbodega2 = opcion - 1;
                        if (producto_4[nbodega1] > cantidad && (producto_4[nbodega2] + cantidad) < z + 1) {
                            producto_4[nbodega2] = producto_4o[nbodega2] + cantidad;
                            producto_4[nbodega1] = producto_4o[nbodega1] - cantidad;
                            System.out.println("- Exito al Pasar Mercaderia");
                            salir = false;
                            break;
                        } else if (producto_4[nbodega1] < cantidad) {
                            System.out.println("- No se Puede Mover Hay Poco Producto");
                            salir = false;
                            break;

                        } else if ((producto_4[nbodega2] + cantidad) > z + 1) {
                            System.out.println("- No se Puede Mover No Hay Espacio");
                            salir = false;
                            break;
                        }
                    case 9:
                        for (int i = 0; i < 9; i++) {

                            producto_4o[i] = producto_4[i];

                        }
                        if (nbodega0 == opcion) {
                            System.out.print("- No se Puede Pasar Mercaderia a la Misma Bodega");
                            salir = false;
                            break;
                        }

                        System.out.print("\nCuanto deseas Mover del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega1 = nbodega0 - 1;
                        nbodega2 = opcion - 1;
                        if (producto_4[nbodega1] > cantidad && (producto_4[nbodega2] + cantidad) < z + 1) {
                            producto_4[nbodega2] = producto_4o[nbodega2] + cantidad;
                            producto_4[nbodega1] = producto_4o[nbodega1] - cantidad;
                            System.out.println("- Exito al Pasar Mercaderia");
                            salir = false;
                            break;
                        } else if (producto_4[nbodega1] < cantidad) {
                            System.out.println("- No se Puede Mover Hay Poco Producto");
                            salir = false;
                            break;

                        } else if ((producto_4[nbodega2] + cantidad) > z + 1) {
                            System.out.println("- No se Puede Mover No Hay Espacio");
                            salir = false;
                            break;
                        }
                    case 0:
                        //si selecciona la opcion "0" el valor salir cambia para sellar el ciclo
                        System.out.println("\n  - Regresamos ");
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

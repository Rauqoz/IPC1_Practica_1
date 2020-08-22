package Acciones_Ac;

import static Inicio.Inicio_Random.producto_4;
import static Inicio.Inicio_Random.z;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rau
 */
public class IngresarMercaderia_Producto_4 {

    /*permite ingresar mercadería a una bodega, siguiendo la
misma lógica que sacar mercadería, con la diferencia que se tiene que verificar
que la cantidad a ingresar no exceda el límite de la mercadería.*/
    Scanner sn = new Scanner(System.in);
    private int opcion, nbodega, cantidad, aun;
    //variable para poder salir del ciclo ya inicializada
    private boolean salir;

    public IngresarMercaderia_Producto_4() {

        do {
            //try para cuando el usuario ingresa algun caracter que no es numero entero
            try {
                //pedir el numero de opcion

                salir = true;
                System.out.println("\n* Producto 4");
                System.out.println("0 - Regresar");
                System.out.println("Bodegas del 1 - 9");
                System.out.print("Selecciona la Bodega a la Cual Agregar Mercaderia: ");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:

                        System.out.print("\n * Cuanto deseas Agregar del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega = opcion - 1;
                        if ((cantidad + producto_4[nbodega]) < z + 1) {
                            System.out.println("- Exito al Agregar Mercaderia");
                            producto_4[nbodega] += cantidad;
                            salir = false;
                            break;
                        } else {
                            aun = z - producto_4[nbodega];
                            System.out.println("- No hay Suficiente Espacio, Solo para: " + aun);
                            salir = false;
                            break;
                        }
                    case 2:

                        System.out.print("\n * Cuanto deseas Agregar del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega = opcion - 1;
                        if ((cantidad + producto_4[nbodega]) < z + 1) {
                            System.out.println("- Exito al Agregar Mercaderia");
                            producto_4[nbodega] += cantidad;
                            salir = false;
                            break;
                        } else {
                            aun = z - producto_4[nbodega];
                            System.out.println("- No hay Suficiente Espacio, Solo para: " + aun);
                            salir = false;
                            break;
                        }
                    case 3:

                        System.out.print("\n * Cuanto deseas Agregar del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega = opcion - 1;
                        if ((cantidad + producto_4[nbodega]) < z + 1) {
                            System.out.println("- Exito al Agregar Mercaderia");
                            producto_4[nbodega] += cantidad;
                            salir = false;
                            break;
                        } else {
                            aun = z - producto_4[nbodega];
                            System.out.println("- No hay Suficiente Espacio, Solo para: " + aun);
                            salir = false;
                            break;
                        }
                    case 4:

                        System.out.print("\n * Cuanto deseas Agregar del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega = opcion - 1;
                        if ((cantidad + producto_4[nbodega]) < z + 1) {
                            System.out.println("- Exito al Agregar Mercaderia");
                            producto_4[nbodega] += cantidad;
                            salir = false;
                            break;
                        } else {
                            aun = z - producto_4[nbodega];
                            System.out.println("- No hay Suficiente Espacio, Solo para: " + aun);
                            salir = false;
                            break;
                        }
                    case 5:

                        System.out.print("\n * Cuanto deseas Agregar del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega = opcion - 1;
                        if ((cantidad + producto_4[nbodega]) < z + 1) {
                            System.out.println("- Exito al Agregar Mercaderia");
                            producto_4[nbodega] += cantidad;
                            salir = false;
                            break;
                        } else {
                            aun = z - producto_4[nbodega];
                            System.out.println("- No hay Suficiente Espacio, Solo para: " + aun);
                            salir = false;
                            break;
                        }
                    case 6:

                        System.out.print("\n * Cuanto deseas Agregar del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega = opcion - 1;
                        if ((cantidad + producto_4[nbodega]) < z + 1) {
                            System.out.println("- Exito al Agregar Mercaderia");
                            producto_4[nbodega] += cantidad;
                            salir = false;
                            break;
                        } else {
                            aun = z - producto_4[nbodega];
                            System.out.println("- No hay Suficiente Espacio, Solo para: " + aun);
                            salir = false;
                            break;
                        }
                    case 7:

                        System.out.print("\n * Cuanto deseas Agregar del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega = opcion - 1;
                        if ((cantidad + producto_4[nbodega]) < z + 1) {
                            System.out.println("- Exito al Agregar Mercaderia");
                            producto_4[nbodega] += cantidad;
                            salir = false;
                            break;
                        } else {
                            aun = z - producto_4[nbodega];
                            System.out.println("- No hay Suficiente Espacio, Solo para: " + aun);
                            salir = false;
                            break;
                        }
                    case 8:

                        System.out.print("\n * Cuanto deseas Agregar del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega = opcion - 1;
                        if ((cantidad + producto_4[nbodega]) < z + 1) {
                            System.out.println("- Exito al Agregar Mercaderia");
                            producto_4[nbodega] += cantidad;
                            salir = false;
                            break;
                        } else {
                            aun = z - producto_4[nbodega];
                            System.out.println("- No hay Suficiente Espacio, Solo para: " + aun);
                            salir = false;
                            break;
                        }
                    case 9:

                        System.out.print("\n * Cuanto deseas Agregar del Producto: ");
                        cantidad = sn.nextInt();
                        nbodega = opcion - 1;
                        if ((cantidad + producto_4[nbodega]) < z + 1) {
                            System.out.println("- Exito al Agregar Mercaderia");
                            producto_4[nbodega] += cantidad;
                            salir = false;
                            break;
                        } else {
                            aun = z - producto_4[nbodega];
                            System.out.println("- No hay Suficiente Espacio, Solo para: " + aun);
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

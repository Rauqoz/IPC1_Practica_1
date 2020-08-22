package Acciones_Ac;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rau
 */
public class Acciones_SacarMercaderia {

    /*permite sacar productos de una bodega, la forma será la
siguiente, se ingresa el número de bodega (se tiene que verificar que exista),
luego se ingresa el producto (se verifica igual su existencia) y luego la cantidad,
se tiene que verificar que la cantidad no exceda el inventario actual de esa
bodega. De ser correcto nos mostrara un mensaje de éxito, luego nos regresara
al menú de acciones.*/
    Scanner sn = new Scanner(System.in);
    private int opcion;
    //variable para poder salir del ciclo ya inicializada
    private boolean salir;

    public Acciones_SacarMercaderia() {

        do {
            //try para cuando el usuario ingresa algun caracter que no es numero entero
            try {
                //pedir el numero de opcion

                salir = true;
                System.out.println("\nProductos Existentes del 1 - 4");
                System.out.println("0 - Regresar");
                System.out.print("Ingresa el Numero de Producto: ");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("\n * Usaremos el Producto 1");
                        SacarMercaderia_Producto_1 sacarMercaderia_Producto_1 = new SacarMercaderia_Producto_1();
                        salir = false;
                        break;
                    case 2:
                        System.out.println("\n * Usaremos el Producto 2");
                        SacarMercaderia_Producto_2 sacarMercaderia_Producto_2 = new SacarMercaderia_Producto_2();
                        salir = false;
                        break;
                    case 3:
                        System.out.println("\n * Usaremos el Producto 3");
                        SacarMercaderia_Producto_3 sacarMercaderia_Producto_3 = new SacarMercaderia_Producto_3();
                        salir = false;
                        break;
                    case 4:
                        System.out.println("\n * Usaremos el Producto 4");
                        SacarMercaderia_Producto_4 sacarMercaderia_Producto_4 = new SacarMercaderia_Producto_4();
                        salir = false;
                        break;

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

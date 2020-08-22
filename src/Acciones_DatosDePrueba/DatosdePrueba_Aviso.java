package Acciones_DatosDePrueba;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rau
 */
public class DatosdePrueba_Aviso {

    Scanner in = new Scanner(System.in);
    //variable para la seleccion de opciones
    private char opcion;
    //variable para poder salir del ciclo ya inicializada
    private boolean salir;

    public DatosdePrueba_Aviso() {

        do {
            //try para cuando el usuario ingresa algun caracter que no es numero entero
            try {
                //pedir el numero de opcion

                salir = true;
                System.out.println("\n* El Inventario Tomara los Datos Prederimados Nuevamente");
                System.out.println("Deseas Continuar? (y/n)");
                opcion = in.next().charAt(0);
                //switch para manejar la opcion que escoja
                switch (opcion) {

                    case 'y':
                    case 'Y':
                        DatosdePrueba datosdePrueba = new DatosdePrueba();
                        salir = false;
                        break;
                    case 'n':

                    case 'N':
                        System.out.println("\n* No se Restaurara la Prueba");
                        salir = false;
                        break;

                    default:
                        //default para cuando el usuario ingresa un numero que no esta dentro de las opciones
                        System.out.println("\n -- Y para Seguir, N para Regresar --");
                        break;
                }
                //catch para cuando el usuario ingresa algun caracter que no es un numero, ejemplo "asd"
            } catch (InputMismatchException e) {
                //mensaje al ingresar algo que no es numero
                System.out.println("\n -- No se Admiten Numeros --");
                //esto sirve para retomar el ingreso de datos y el flujo normal del ciclo do
                in.next();
            }
        } while (salir != false); //si la variable es igual a true, la inicializada en false, se cierra el ciclo y finaliza el programa

    }

}

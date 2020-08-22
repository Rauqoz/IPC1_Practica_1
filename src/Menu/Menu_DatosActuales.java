package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rau
 */
public class Menu_DatosActuales {

    private Scanner in = new Scanner(System.in);
    //variable para la seleccion de opciones
    private int opcion;
    //variable para poder salir del ciclo ya inicializada
    private boolean salir;

    public Menu_DatosActuales() {
        do {
            //try para cuando el usuario ingresa algun caracter que no es numero entero
            try {
                //pedir el numero de opcion
                salir = true;
                System.out.println("\n1 - Ver Inventario");
                System.out.println("2 - Avisos");
                System.out.println("0 - Regresar");
                System.out.print("Selecciona una Opcion: ");
                opcion = in.nextInt();
                //switch para manejar la opcion que escoja
                switch (opcion) {

                    case 1://Ver Inventario
                        System.out.println("\n * Ver Inventario");
                        Acciones_DatosActuales.DatosActuales_Inventario datosActuales_Inventario = new Acciones_DatosActuales.DatosActuales_Inventario();

                        break;
                    case 2://Ver Avisos
                        System.out.println("\n * Avisos");
                        Acciones_DatosActuales.DatosActuales_Avisos datosActuales_Avisos = new Acciones_DatosActuales.DatosActuales_Avisos();

                        break;

                    case 0:
                        //si selecciona la opcion "0" el valor salir cambia para sellar el ciclo
                        System.out.println("\n * Regresaras al Menu");
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
                in.next();
            }
        } while (salir != false); //si la variable es igual a true, la inicializada en false, se cierra el ciclo y finaliza el programa
    }

}

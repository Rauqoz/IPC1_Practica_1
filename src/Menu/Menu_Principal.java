package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rau
 */
public class Menu_Principal {

    private Scanner in = new Scanner(System.in);
    //variable para la seleccion de opciones
    private int opcion;
    //variable para poder salir del ciclo ya inicializada
    private boolean salir;

    public Menu_Principal() {
         do {
            //try para cuando el usuario ingresa algun caracter que no es numero entero
            try {
                //pedir el numero de opcion

                salir = true;
                System.out.println("\nBienvenido al Menu");
                System.out.println("1 - Datos de Prueba (Estos Datos Reinician la Prueba)");
                System.out.println("2 - Datos Actuales");
                System.out.println("3 - Acciones");
                System.out.println("4 - Reportes");
                System.out.println("0 - Salir");
                //pedir el numero de opcion
                System.out.print("Selecciona la Opcion que Deseas: ");
                opcion = in.nextInt();
                //switch para manejar la opcion que escoja
                switch (opcion) {

                    case 1:
                        System.out.println("\n* Datos de Prueba (Estos Datos Reinician la Prueba) ");
                        Acciones_DatosDePrueba.DatosdePrueba_Aviso datosdePrueba_Aviso = new Acciones_DatosDePrueba.DatosdePrueba_Aviso();
                        break;
                    case 2://Datos Actuales
                        System.out.println("\n* Datos Actuales ");
                        Menu_DatosActuales menu_DatosActuales = new Menu_DatosActuales();

                        break;
                    case 3://Ver Acciones
                        System.out.println("\n* Acciones ");
                        Menu_Acciones menu_Acciones = new Menu_Acciones();
                        
                        break;
                    case 4://Ver Reportes
                        System.out.println("\n* Reportes ");
                        Menu_Reportes menu_Reportes = new Menu_Reportes();
                        
                        break;
                    case 0:
                        //si selecciona la opcion "0" el valor salir cambia para sellar el ciclo
                        System.out.println("\n* - Gracias por Participar en la Beta - *");
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

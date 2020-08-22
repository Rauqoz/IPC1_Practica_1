package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rau
 */
public class Menu_Reportes {

    private Scanner in = new Scanner(System.in);
    //variable para la seleccion de opciones
    private int opcion;
    //variable para poder salir del ciclo ya inicializada
    private boolean salir;

    public Menu_Reportes() {
        do {
            //try para cuando el usuario ingresa algun caracter que no es numero entero
            try {
                //pedir el numero de opcion
                salir = true;
                System.out.println("\n1 - Bodega con Menor Cantidad de Productos");
                System.out.println("2 - Bodega con Mayor Cantidad de Productos");
                System.out.println("3 - Bodega con Menor Cantidad de Productos (Separado por Articulos)");
                System.out.println("4 - Bodega con Mayor Cantidad de Productos (Separado por Articulos)");
                System.out.println("5 - Promedio de Articulos");
                System.out.println("6 - Mediana de Unidades por Articulos");
                System.out.println("7 - Moda de Unidades por Articulos");
                System.out.println("0 - Regresar");
                System.out.print("Selecciona la Opcion: ");
                opcion = in.nextInt();
                //switch para manejar la opcion que escoja
                switch (opcion) {

                    case 1://Bodega con Menor Cantidad de Productos
                        System.out.println("\n * Bodega con Menor Cantidad de Productos");
                        Reportes.BodegaMenor_Productos bodegaMenor_Productos = new Reportes.BodegaMenor_Productos();
                        break;
                    case 2://Bodega con Mayor Cantidad de Productos
                        System.out.println("\n * Bodega con Mayor Cantidad de Productos");
                        Reportes.BodegaMayor_Productos bodegaMayor_Productos = new Reportes.BodegaMayor_Productos();
                        break;
                    case 3://Bodega con Menor Cantidad de Productos (Separado por Articulos)
                        System.out.println("\n * Bodega con Menor Cantidad de Productos (Separado por Articulos)");
                        Reportes.BodegaMenor_Por_Articulo bodegaMenor_Por_Articulo = new Reportes.BodegaMenor_Por_Articulo();
                        break;
                    case 4://Bodega con Mayor Cantidad de Productos (Separado por Articulos)
                        System.out.println("\n * Bodega con Mayor Cantidad de Productos (Separado por Articulos)");
                        Reportes.BodegaMayor_Por_Articulo bodegaMayor_Por_Articulo = new Reportes.BodegaMayor_Por_Articulo();
                        break;
                    case 5://Promedio de Articulos
                        System.out.println("\n * Promedio de Articulos");
                        Reportes.BodegaPromedio_Articulos bodegaPromedio_Articulos = new Reportes.BodegaPromedio_Articulos();
                        break;
                    case 6://Mediana de Unidades por Articulos
                        System.out.println("\n * Mediana de Unidades por Articulos");
                        Reportes.ArticuloMediana_Unidades bodegaMediana_Articulo = new Reportes.ArticuloMediana_Unidades();
                        break;
                    case 7://Moda de Unidades por Articulos
                        System.out.println("\n * Moda de Unidades por Articulos");
                        Reportes.ModaUnidades_Por_Articulo modaUnidades_Por_Articulo = new Reportes.ModaUnidades_Por_Articulo();
                        break;

                    case 0:
                        //si selecciona la opcion "0" el valor salir cambia para sellar el ciclo
                        System.out.println("\n - Regresaras al Menu");
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

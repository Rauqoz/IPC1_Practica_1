package practica_1;

/**
 *
 * @author Rau
 */
public class Practica_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Inicio.Inicio_Random inicio_Random = new Inicio.Inicio_Random();

        Parametros(args);
        
        Menu.Menu_Principal menu_Principal = new Menu.Menu_Principal();
        
        String prueba = "prueba1";
                if(prueba.endsWith("1")){
                    
                }
    }

    static void Parametros(String [] args){
        
        String argumentos[]= new String[args.length];
        System.out.print("Los Argumentos son: ");
        for (int i = 0; i < args.length; i++) {
            argumentos[i] = args[i];
            System.out.print( argumentos[i] + " - ");
            
        }
        System.out.print("\nLa Bodega: ");
        for (int i = 0; i < argumentos.length; i+=3) {
            System.out.print(argumentos[i] + " - ");
        }
        System.out.print("\nEl Producto: ");
        for (int i = 1; i < argumentos.length; i+=3) {
            System.out.print(argumentos[i] + " - ");
        }
        System.out.print("\nLa Cantidad: ");
        for (int i = 2; i < argumentos.length; i+=3) {
            System.out.print( argumentos[i] + " - ");
        }
        
    }
    

}

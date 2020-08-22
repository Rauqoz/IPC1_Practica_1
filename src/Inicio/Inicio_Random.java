package Inicio;

/**
 *
 * @author Rau
 */
public class Inicio_Random {

    public static int x = 120, y = 95, z = 90, w = 80;

    public static int rproducto_1 = (int) (Math.random() * (x - y + 1) + y);
    public static int rproducto_2 = (int) (Math.random() * (z - w + 1) + w);
    public static int rproducto_3 = (int) (Math.random() * (x - y + 1) + y);
    public static int rproducto_4 = (int) (Math.random() * (z - w + 1) + w);

    public static int producto_1[] = new int[9];
    public static int producto_2[] = new int[9];
    public static int producto_3[] = new int[9];
    public static int producto_4[] = new int[9];

    public Inicio_Random() {
        for (int i = 0; i < 9; i++) {
            producto_1[i] = rproducto_1;
            producto_2[i] = rproducto_2;
            producto_3[i] = rproducto_3;
            producto_4[i] = rproducto_4;

        }

        

    }

}

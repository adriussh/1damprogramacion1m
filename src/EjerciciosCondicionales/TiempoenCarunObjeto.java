package EjerciciosCondicionales;

import java.util.Scanner;

public class TiempoenCarunObjeto {
    public static void main(String[] args) {
        System.out.println("Dime la altura y lo que pesa el objeto que se lanza");
        float h = 0;
        float g = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la altura");
        h= sc.nextFloat();
        int gravedad=0;
        double t=0;
        t=Math.sqrt(2*h/g);
        final double a = 9.81; // las constantes se declaran con final
        double s = Math.sqrt(2*h/g);

        System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);


    }
}

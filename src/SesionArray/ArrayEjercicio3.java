package SesionArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEjercicio3 {
    public static void main(String[] args) {
        int [] arrayorigen = {1,2};
        int [] arraydestino1 = new int[3];
        System.out.println("el array es"+ Arrays.toString(arrayorigen));
        System.arraycopy(arrayorigen, 0,arraydestino1, 0,arrayorigen.length);
        System.out.println("El array es"+Arrays.toString(arraydestino1));
        System.out.println("¿Quieres insertar nuevos elementos?");
        Scanner sc =new Scanner(System.in);
        char opcion = sc.next().toLowerCase().charAt(0);

        if (opcion == 's'){
            System.out.println("¿Dime un numero? ");
            int valornuevo = sc.nextInt();
            arraydestino1[arraydestino1.length-1]=valornuevo;
            System.out.println("El array es"+Arrays.toString(arraydestino1));
        }
        else
        {
            System.out.println("Pues nada");
        }
    }
}

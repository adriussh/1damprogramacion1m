package SesionArray;

import java.util.Scanner;

public class Sesion1611 {
    public static void main(String[] args) {


        int[] array1 = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Introduzca un numero");
            array1[i] = sc.nextInt();
        }
    }
}

package Estructura;

import java.util.Scanner;

public class Estructural {
    public static void main(String[] args) {

        int a,b,mayor,menor=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca el valor de a");
        a =sc.nextInt();

        System.out.println("Introduzca el valor de b");
        b = sc.nextInt();

        mayor =a;
        menor =b;
        if (a<b){
            mayor=b;
            menor =a;


            System.out.println("El mayor es"+mayor+ " y el menor es "+menor);
        }
    }
}

package EjerciciosCondicionales;

import java.util.Scanner;

public class EcuacionPrimerGrado {
        class Ecuacion {
            public static void main(String[] args) {
                System.out.println("Introduce una ecuación de primer grado ");
                float a = 0;
                float b = 0;
                Scanner sc=new Scanner(System.in);
                System.out.println("Introduzca el valor a");
                a= sc.nextFloat();
                Scanner sc2=new Scanner(System.in);
                System.out.println("Introduzca el valor b");
                b= sc2.nextFloat();
                float ecuacion=0;
                ecuacion=-b/a;
                System.out.println("El resultado de la ecuacion es " +ecuacion);
            }
        }

    }


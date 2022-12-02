package EjerciciosExamen;

import java.util.Scanner;

public class Examenejercicios {
    private static double base;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double radio = 0;
        double base = 0;
        double altura = 0;
        double perimetro, area;

      System.out.println("Menu de areas");
        System.out.println("Area de un circulo");
        System.out.println("Area de un triangulo");
        System.out.println("Area de un cuadrado");
        System.out.println("introduzcame el area que quieres calcular");
        Scanner sc = new Scanner(System.in);
        String opcion= sc.next().toLowerCase();
        if (opcion.equals("circulo")){

            System.out.println("Introduzcame el radio");
            radio =sc.nextDouble();
            calcular_circulo(radio);

        }
        if (opcion.equals("triangulo"));

        System.out.println("Introduzca la altura");
        System.out.println("Introduzca la base");
        altura = sc.nextDouble();
        base = sc.nextDouble();
        calcular_triangulo(altura);

    }

    private static void calcular_triangulo(double altura) {
        System.out.println("El area del triangulo es"+Math.sqrt(base*altura)/2);
    }

    private static void calcular_circulo(double radio) {
        System.out.println("el area del circulo es"+Math.sqrt(radio)*Math.PI);
    }
}

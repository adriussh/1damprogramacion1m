package EjerciciosExamen;

import java.util.Scanner;

public class Examenejercicios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int radio = 0;
        int base = 0;
        int altura = 0;
        int triangulo;
        double perimetro, area;
        double pi = 3.1416;
        do {
            System.out.println("Ingrese el radio del circulo a calcular: ");
            radio = entrada.nextInt();
            if (radio < 0) {
                System.out.println("El numero no puede ser negativo");
            }
        } while (radio < 0);
        perimetro = (int) (radio ^ 2) * pi;
        do {
        System.out.println("ingrese la base del triangulo");
        base = entrada.nextInt();
        if (base < 0) {
            System.out.println("El numero no puede ser negativo");
        }
            System.out.println("Ingrese la altura");
        altura = entrada.nextInt();
        if (altura < 0) {
            System.out.println("El numero no puede ser negativo");
        }
        } while (base < 0);
        triangulo = (int) (base*altura)/2;

    }
}

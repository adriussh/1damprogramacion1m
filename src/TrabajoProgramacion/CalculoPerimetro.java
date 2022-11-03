package TrabajoProgramacion;

import java.util.Scanner;

public class CalculoPerimetro {
        public static void main (String[] args) {

            Scanner entrada = new Scanner(System.in);
            int radio;
            double perimetro, area, volumen;
            double pi = 3.1416;
            do {
                System.out.println("Ingrese el radio del circulo a calcular: ");
                radio = entrada.nextInt();
                if (radio<0){
                    System.out.println("El numero no puede ser negativo");
                }
            } while (radio <0);
                perimetro = (int) (2 * pi * radio);
                area = (int) (pi * radio * radio);
                volumen = (int) (4 / 3 * pi * radio * radio * radio);
                System.out.println("El perimetro es: " + perimetro + ".");
                System.out.println("El area es: " + area + ".");
                System.out.println("El volumen es: " + volumen + ".");



        }
    }


package EjerciciosCondicionales;

import java.util.Scanner;

public class DiadelasemanayAsignatura {
    public static void main(String[] args) {

        System.out.println("Dime un dia de la semana correspondiente del 1 al 5 (el 1 es lunes, 2 martes...) y te dire la asignatura que tienes a primera hora. ");
        int diadelasemana = 0;
        Scanner sc = new Scanner(System.in);
        diadelasemana = sc.nextInt();
        if (diadelasemana == 1) {
            System.out.println("toca Base de datos ");
        }
        if (diadelasemana == 2) {
            System.out.println("toca Sistemas");
        }
        if (diadelasemana == 3) {
            System.out.println("toca Programación");
        }
        if (diadelasemana == 4) {
            System.out.println("toca Base de datos");
        }

        if (diadelasemana == 5) System.out.println("toca Fol");
    }
}
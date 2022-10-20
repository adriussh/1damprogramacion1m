package EjerciciosCondicionales;

import java.util.Scanner;

public class Salariomensual {
    public static void main(String[] args) {
        System.out.println("Dime las horas semanales que trabajas y te dire cuanto cobras");
        int horas = 0;
        Scanner sc = new Scanner(System.in);
        horas = sc.nextInt();
        if (horas <= 40) {
            int multiplicacion1=0;
            multiplicacion1=horas*12;
            System.out.println(+multiplicacion1);
        }
        if (horas >= 41) {
            int multiplicacion2=0;
            multiplicacion2=horas*16;
            System.out.println(+multiplicacion2);
        }return;
    }
}
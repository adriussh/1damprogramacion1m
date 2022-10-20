package EjerciciosCondicionales;

import java.util.Scanner;

public class HoraDiasTardes {
    public static void main(String[] args) {
        System.out.println("Dime una hora del día");
        int hora = 0;
        Scanner sc = new Scanner(System.in);
        hora = sc.nextInt();
        if ((hora >= 6) && (hora <= 12)) {
            System.out.println("Buenos días");
        }
        if ((hora >= 13 ) && (hora <= 20)) {
            System.out.println("Buenas tardes");
        }
        if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
            System.out.println("Buenas noches");
        }
    }
}

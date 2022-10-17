package EjerciciosCondicionales;

import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {
        System.out.println("Dime el numero de un mes");
        int mes=0;
        Scanner sc = new Scanner(System.in);
        mes = sc.nextInt();

        switch (mes) {
                case 1:
                    if (mes == 1) {
                        System.out.println("es Enero");
                        }
                case 2:
                     if (mes == 2) {
                        System.out.println("es Febrero");
                        }
                case 3:
                     if (mes ==3) {
                         System.out.println("es Marzo");
                     }
                 case 4:
                    if (mes == 4) {
                        System.out.println("es Abril");
                         }
                 case 5:
                     if (mes == 5) {
                        System.out.println("es Mayo");
                     }
                 case 6:
                     if (mes == 6) {
                         System.out.println("es Junio");
                     }
                  case 7:
                    if (mes == 7) {
                        System.out.println("es Julio");
                    }
                 case 8:
                     if (mes == 8) {
                        System.out.println("es Agosto");
                     }
                  case 9:
                    if (mes == 9) {
                        System.out.println("es Septiembre");
                    }
                    case 10:
                     if (mes == 10) {
                         System.out.println("es Octubre");
                     }
                     case 11:
                       if (mes == 11) {
                         System.out.println("es Noviembre");
                     }
                    case 12:
                        if (mes == 12) {
                         System.out.println("es Diciembre");
                }
        }
        }
}



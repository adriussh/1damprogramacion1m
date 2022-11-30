package Estructura;

import java.util.Random;
import java.util.Scanner;

public class Diasdelasemana {

    public String DOMINGO;
    public String SABADO;
    public String VIERNES;
    public String JUEVES;
    public String MIERCOLES;
    public String MARTES;
    public Diasdelasemana LUNES;

    public static void main(String[] args) {
        int dia=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un valor entre 1 y 7");
        dia = sc.nextInt();

        switch (dia){
            case 1: System.out.println("es lunes");
            case 2: System.out.println("es martes");
            case 3: System.out.println("es miercoles");
            case 4: System.out.println("es jueves");
            case 5: System.out.println("es viernes");
            case 6: System.out.println("es sabado");
            case 7: System.out.println("es domingo");
            default: System.out.println("has introducido un valor invalido");
        }

    }
}

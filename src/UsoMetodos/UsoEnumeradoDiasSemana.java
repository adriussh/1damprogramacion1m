package UsoMetodos;

import Estructura.Diasdelasemana;

import java.util.Scanner;

public class UsoEnumeradoDiasSemana {
    private static Estructura.Diasdelasemana Diasdelasemana;

    public static void main(String[] args) {

        int valor =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un valor de 1 a 7");
        valor =sc.nextInt();
        Diasdelasemana dia= Diasdelasemana;
        switch (valor){
            case 1: System.out.println("es"+dia.LUNES); break;
            case 2: System.out.println("es"+dia.MARTES); break;
            case 3: System.out.println("es"+dia.MIERCOLES); break;
            case 4: System.out.println("es"+dia.JUEVES); break;
            case 5: System.out.println("es"+dia.VIERNES); break;
            case 6: System.out.println("es"+dia.SABADO); break;
            case 7: System.out.println("es"+dia.DOMINGO); break;
        }


    }
}

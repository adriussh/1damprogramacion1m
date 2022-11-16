package SesionArray;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //1era forma de declarar e iniciliazar un array
        int[] notas_1trimestre = new int[5];
        notas_1trimestre[0] = 5;
        notas_1trimestre[1] = 6;
        notas_1trimestre[2] = 7;
        notas_1trimestre[3] = 8;
        notas_1trimestre[4] = 9;

        //2era declarar e inicializar en la misma frase
        int[] notas_2trimestre = {7, 8, 9, 7, 4};

        //er forma declar el array y que sea el usuario que me diga los numeros a meter en el array
        int[] notas_3ertrimestre = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas_3ertrimestre.length; i++) {
            System.out.println("Introduzcame su nota por favor");
            notas_3ertrimestre[i] = sc.nextInt();
        }
    }

    public static boolean equals(int[] numero1, int[] numero2) {
        return false;
    }}
package SesionArray;

import java.util.Scanner;

public class Sesion1011 {
    public static void main(String[] args) {
        int[][] array_1 = new int [2][2];
        array_1[0][0]=6;
        array_1[0][1]=8;
        array_1[1][0]=1;
        array_1[1][1]=5;

        int[][] array_2 = {{1,2},{3,4}};

        int[][] array_3 = new int[2][2];
        for (int i=0;i< array_3.length;i++){
            for (int j=0;j< array_3.length;j++){
                System.out.println("Escribe un numero");
                Scanner sc= new Scanner(System.in);
                array_3[i][j]= sc.nextInt();
            }
        }
        int[][] array_4= new int[2][3];
        for (int i=0;i<array_4.length;i++){
            for (int j=0; j< array_4[i].length;j++) {
                System.out.println("Escribe un numero");
                Scanner sc= new Scanner(System.in);
                array_4[i][j] = sc.nextInt();
            }
        }

    }
}

package OperadoresAritmeticos;

import java.util.Scanner;

public class Espar {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num =sc.nextByte();
        if (num % 2 == 0){
            System.out.println("Es par");
        }
        else
        {
            System.out.println("Es impar");
        }
    }
}

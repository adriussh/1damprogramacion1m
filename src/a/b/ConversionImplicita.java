package a.b;

import java.util.Scanner;

public class ConversionImplicita {

    public static void main(string[] args) {
        float nota;
        System.out.println("Introduzca un numero");

        Scanner sc = new Scanner(System.in);
        nota = sc.nextFloat();
        System.out.println("el usuario ha introducido este valor" + nota);


    }
}
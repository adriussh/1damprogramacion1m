package EjerciciosExamen;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PosibleExam {
    private static int num;

    public static void main(String[] args) {

        int numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero");
        num = sc.nextInt();
        boolean resultado = esprimo(num);


    }

    private static boolean esprimo(int numero) {
    boolean result;
    if (numero%2==0){
        result = false;

    }
    else {
        result = true;
    }
    return result;
    }
}

package SesionArray;

public class ArrayEjercicio {
    public static void main(String[] args) {
        int[] numeros ={121,14,55,1};
        java.util.Arrays.sort(numeros);
        System.out.println("Array de numeros ordenados"+ java.util.Arrays.toString(numeros));
        String[] nombres= {"Pepe","Alfredo","Adrián"};
        java.util.Arrays.sort(nombres);
        System.out.println("Array de strings ordenados"+ java.util.Arrays.toString(nombres));
    }
}

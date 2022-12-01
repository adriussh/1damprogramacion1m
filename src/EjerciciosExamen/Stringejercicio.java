package EjerciciosExamen;

import java.util.Scanner;

public class Stringejercicio {
    public static void main(String[] args) {
        String palabra=null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la palabra con la uqe quiere trabajar");
        palabra= sc.next();

        System.out.println("Menu de funcionalidades");
        System.out.println("1. Calcular la longitud de la palabra");
        System.out.println("2. Mostrar la inicial de la palabra");
        System.out.println("3. Mostrar la ultima letra de la palabra");
        System.out.println("4. Quitar espacios si hubiese en la palabra");
        System.out.println("5. Mostrar la palabra en mayusculas");
        System.out.println("6. Mostrar la palabra en minusculas");
        System.out.println("7. Remplazar una letra por otra");
        System.out.println("8. Indicar si el string esta vacio");
        System.out.println("9. Pasarñp a un array de char");

        System.out.println("Por favor introduzca la accion que desea realizar");
        int opcion = sc.nextInt();

        switch (opcion){
            case 1: System.out.println("La longitud de"+palabra+"es"+longitud_string(palabra));
            break;
            case 2: System.out.println("La inicial de"+palabra+"es"+inicial_string(palabra));
            break;
            case 3: System.out.println("la inicia de"+palabra+"es"+quitar_espacios(palabra));
            break;
            case 4: System.out.println("La palabra quitando espacios es"+quitar_espacios(palabra));
            break;
            case 5: System.out.println("La palabra en mayusculas es"+mayuscula(palabra));
            break;
            case 6:minusculas(palabra);
            break;
            case 7: System.out.println("Dime la letra a reemplazar");
            char letra_arremplazar= sc.next().charAt(0);
                System.out.println("Dime la letra");
                char letra_nueva= sc.next().charAt(0);
                System.out.println("La palabra tras reemplzar"+letra_arremplazar+"por "+letra_nueva+"es"+remplazo(palabra,letra_arremplazar,letra_nueva));
            case 8:
        }


    }


    public static int longitud_string(String palabra){
        int resultado = 0;
        resultado=palabra.length();
        return resultado;

    }

    public static void longitud_string_2(String palabra){

        System.out.println("La longitud de "+palabra+" es de "+palabra.length());

    }

    public static char inicial_string(String palabra){
        char inicial;
        inicial=palabra.charAt(0);
        return inicial;


    }

    public static void inicial_string2(String palabra){

        System.out.println("la inicial de la palabra"+palabra+"es "+palabra.charAt(0));


    }

    public static char inicial_string3(String palabra){
        char ultima;
        ultima=palabra.charAt(palabra.length()-1);
                return ultima;

    }
    public static String quitar_espacios(String palabra){
        String pal="";
        pal=palabra.trim();
        return pal;

    }
    public static void quitar_espacios2(String palabra){

        System.out.println("la palabra libre de espacios es"+palabra.trim());

    }

    public static String mayuscula(String palabra){
        String resultado;
        resultado=palabra.toUpperCase();
        return resultado;

    }

    public static void minusculas(String palabra){
        System.out.println("la palabra en minusculas es"+palabra.toLowerCase());
    }

    public static String remplazo(String palabra,char letra_arremplazar,char letra_nueva){
        String palabra_resultante = null;
        palabra_resultante = palabra.replace(letra_arremplazar,letra_nueva);
        return palabra_resultante;
    }

    public static boolean esvacio(String palabra){
        boolean resultado=false;
        resultado=palabra.isEmpty();
        return resultado;
    }

    public static char[] pasaarraychar(String palabra){
        char[] array;
        array=palabra.toCharArray();
        return array;
    }

}

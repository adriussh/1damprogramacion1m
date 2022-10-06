package a.b;

public class Main {
    public static void main(String[] args) {
        //declaración de una constante
        final String SALUDO="Hola";
        //declaración de la variable que contendrá el nombre del usuario
        String nombre="Adrián";
        System.out.println(nombre);
        char c ='a';
        char caracter='b';
        int num=88;
        c=caracter ;
        System.out.println(c);
        c= (char) num;
        c='z';
    }
}
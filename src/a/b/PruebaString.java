package a.b;

import java.util.Locale;

public class PruebaString {
    public static void main(String[] args) {
        String nombre="Adrián";
        String apellido="ESCRIBANO";

        System.out.println("voy a pasar a mayusculas el nombre"+nombre.toUpperCase());
        System.out.println("voy a pasar a minusculas el apellido"+apellido.toLowerCase());
        System.out.println("concatenar caracteres"+nombre.concat(" "+apellido));
        System.out.println("mostrar la inicial de mi apellido"+apellido.charAt(0));
        System.out.println("el numero de characterises de"+nombre+"es "+nombre.length());
        System.out.println("el numero de caracteres de "+apellido+"es "+apellido.length());
    }


}



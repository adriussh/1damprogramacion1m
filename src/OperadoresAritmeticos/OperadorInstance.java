package OperadoresAritmeticos;

public class OperadorInstance {
    private static Object nombre;

    public static void main(String[] args) {
        Integer i=5;
        System.out.println("La variable i es instancia de clase envoltorio(Wrapper) Integer");
        System.out.println(i instanceof Integer);
        System.out.println(i.getClass());
        System.out.println("La variable nombre es intancia de clase String");
        System.out.println(nombre instanceof String);
        // nombre.getClass();

    }
}

package a.b;

public class ConversionPrimitoWrapper {
    public static void main(String[]args ) {
        //declaración de variable
        Integer a = 6;
        int b = 7;
        int c = 8;

        System.out.println("el valor de la variable Wrapper a es: " + a);
        System.out.println("el valor de la variable tipo primitivo int b "+b);
        System.out.println("el valor de la vaiable tipo primitivo int c es: "+c);

        System.out.println("Autoboxing:");
        a=b;
        System.out.println("la variable wrapper a vale ahora:"+b);

        System.out.println("Unboxing:");
        c=a;
        System.out.println("la variable tipo primitivo int c vale ahora:" +c);

        System.out.println("este metodo permite pasar na variable de tipo nteger a string"+a.toString());
        System.out.println("¿es a igual a b=>"+b +a.equals(b));
        System.out.println("¿es a igual a b=> "+a.equals(b));
        Byte d = null;
        System.out.println("convertir la variable b en float=> "+d.floatValue());
    }
}

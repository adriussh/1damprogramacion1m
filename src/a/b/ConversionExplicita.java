package a.b;

public class ConversionExplicita  {
    public static void main(String[]args) {
        byte b;
        int i =257;
        double d = 323.142;

        System.out.println("Convertir un integer a byte de manera explcita");
        b = (byte)  i;
        System.out.println("La  i " +i+"b"+"");

        System.out.println("Convertir un double a byte de manera explicita");
        b = (byte) d;
        System.out.println("d= "+d+" b="+b);
     }
}

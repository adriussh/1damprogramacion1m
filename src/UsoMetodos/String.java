package UsoMetodos;

public class String {
    public static void main(String[] args) {
        java.lang.String pais="Francia";
        java.lang.String pais2="Ecuador";
        java.lang.String pais3="Marruecos";
        java.lang.String pais22="ecuador";
        java.lang.String pais4="ESPAÑA";
        java.lang.String pais8="";

        //char

        System.out.println("La inicial de este pais es"+pais.charAt(0));
        System.out.println("La letra del pais"+pais.charAt(pais.length()));
        System.out.println("Numero de letras"+pais.length());
        System.out.println("El pais en mayuscula es"+pais.toUpperCase());
        System.out.println("El pais en minusculas es"+pais.toLowerCase());
        System.out.println("¿Es igual"+pais2.toLowerCase()+" y "+pais22+"?="+pais2.toLowerCase().equals(pais22.toLowerCase()));
        System.out.println("Es igual"+pais2+" y "+pais22+ pais2.compareTo(pais22));

        if (pais2.compareToIgnoreCase(pais22)== 0) {
            System.out.println("Son iguales");
                      }
        else {
            System.out.println("no son iguales");
        }
        System.out.println("es subcadena "+pais3.contains("ruu"));
        System.out.println("el sufijo de"+pais4+"es"+pais4.endsWith("eña"));
        System.out.println("Esta vacio el pais"+pais4+" "+pais4.isEmpty());
        System.out.println("Esta vacio el pais"+pais8+" "+pais8.isEmpty());
        System.out.println(pais4.indexOf("a"));
        System.out.println(pais4.lastIndexOf("a"));
        java.lang.String animal="perro";
        System.out.println(animal.replace('o', 'a'));
        System.out.println(animal.substring(0,2));
        System.out.println(animal.startsWith("pa"));
        java.lang.String pais20= " Qatar ";
        System.out.println(pais20.length());
        System.out.println(pais20);
        System.out.println(pais20.trim());
    }
}

package OperadoresAritmeticos;

public class OperadorAritmetico {

    public static void main(String[] args) {

        //declaración e iniciazión de varianbles
        int a=25,b =5,c=2;
        int suma,resta, multiplicación,división,resto=0;
        suma =a+b+c;
        resta=c-b;
        división=a/b;
        resto=a%b;
        multiplicación=a+b;
        System.out.println("La suma es " +suma);
        System.out.println("La resta es "+resta);
        System.out.println("la multiplicación es "+multiplicación);
        System.out.println("La conciente es "+división);
        System.out.println("La cociente es "+resto);

        a++;
        System.out.println("El numero valor de a es "+a);
        b++;
        System.out.println("El numero valor de a es "+b);
    }
}

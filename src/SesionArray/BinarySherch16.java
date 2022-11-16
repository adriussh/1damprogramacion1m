package SesionArray;

import java.util.Arrays;
import java.util.Scanner;

import static OperadoresAritmeticos.OperadorInstance.nombre;

public class BinarySherch16 {
    public static void main(String[] args) {

        String [] lista= {"Adrian","Pepe","Alfredo","Antonio"};
        int posicion=-1;
        String busca;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que nombre quieres encontrar?");
        busca = sc.next();
        posicion =buscar(lista,busca);
        imprimir(posicion,busca,lista);


    }


    private static void imprimir(int posicion,String nombre,String [] lista ) {
        System.out.println(Arrays.toString(lista));
        if(posicion == -1){
            System.out.println("El elemento que buscabas"+nombre+"está");
        }
        else {
            System.out.println("El elemento"+nombre+"el elemento que buscabas estaba en la posicion"+posicion);
        }
    }

    private static int buscar(String[] lista, String busca) {
       int posicion=-1;
       for (int i=0;i<lista.length;i++)
       {
           if (busca.equals(lista[i]))
           {
               posicion=i;
           }
       }



        return posicion;
    }
}





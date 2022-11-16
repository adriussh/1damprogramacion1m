package SesionArray;

public class BusquedaArray {
    public static void main(String[] args) {
        String[] alumnos ={"Adrián","Alfredo","Pepe","Andres"};

        int posicion =java.util.Arrays.binarySearch(alumnos, "Alfredo");
        if (posicion>=0){
            System.out.println("No esta en la lista");
        }
        else {
            System.out.println("EL alumno"+alumnos[posicion]+"sta en la posicion"+posicion);
        }
    }
}

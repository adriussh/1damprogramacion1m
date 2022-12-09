package TrabajoProgramacion;

import java.util.Scanner;

public class temperatura {
    public float[] inicializar_array(float[] temperaturas) {
        Scanner sc = new Scanner(System.in);
        for (var i = 0; i < 12; i++) {
            System.out.println("Cual es la temperatura del mes " + (i + 1));
            temperaturas[i] = sc.nextFloat();
        }
        return temperaturas;

    }

    public static Meses mayor_temperatura(float[] temperaturas) {
        float mayor = 0;
        Meses resultado = null;
        int indice=0;
        for (var i = 0; i < 12; i++) {
            if (temperaturas[i] > mayor) {
                mayor = temperaturas[i];
                indice=i;
            }

        }
        resultado=Sacar_Mes_Enumerado(indice);
        return resultado;
    }

    public static Meses menor_temperatura(float[] temperaturas) {
        float menor = 0;
        Meses resultado = null;
        int indice=0;
        for (var i = 0; i < 12; i++) {
            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
                indice=i;
            }

        }
        resultado=Sacar_Mes_Enumerado(indice);
        return resultado;
    }

    private static float sacar_temperatura(int mes, float[] temperaturas) {
       return temperaturas [mes - 1];
    }
    public static float sacar_tem_verano(float [] temperaturaS){
        float media=(temperaturaS[5]+temperaturaS[6]+temperaturaS[7]+temperaturaS[8])/4;
        return media;
    }
    public static float sacar_tem_invierno(float [] temperaturaS){
        float media=(temperaturaS[0]+temperaturaS[1]+temperaturaS[2]+temperaturaS[11])/4;
        return media;
    }
    public static int Sacar_Mes_Indice(String mes) {
        Meses m= Meses.valueOf(mes.toUpperCase());
        return m.ordinal()+1;

    }
    public static Meses Sacar_Mes_Enumerado(int indice){
        Meses a= null;
        switch (indice){
            case 0: a=Meses.ENERO;
            break;
            case 1: a=Meses.FEBRERO;
            break;
            case 2: a=Meses.MARZO;
            break;
            case 3: a=Meses.ABRIL;
            break;
            case 4: a=Meses.MAYO;
            break;
            case 5: a=Meses.JUNIO;
            break;
            case 6: a=Meses.JULIO;
            break;
            case 7: a=Meses.AGOSTO;
            break;
            case 8: a=Meses.SEPTIEMBRE;
            break;
            case 9: a=Meses.OCTUBRE;
            break;
            case 10: a=Meses.NOVIEMBRE;
            break;
            case 11: a=Meses.DICIEMBRE;
            break;
        }
        return a;
    }

    private static boolean comparar(Meses valor1, Meses valor2, float[] temperaturas_madrid) {
        int Mes1= Sacar_Mes_Indice(valor1.toString());
        int Mes2= Sacar_Mes_Indice(valor2.toString());
     return temperaturas_madrid [Mes1] == temperaturas_madrid [Mes2];
    }

    public static void main(String[] args) {
        temperatura temperaturas= new temperatura();
        float[] temperaturas2 = new float[12];

        Scanner sc = new Scanner(System.in);
        int opcion=-1;
        while (opcion!=0) {

        System.out.println("0. Salir.");
        System.out.println("1. Saber la temperatura media de cada mes del año. ");
        System.out.println("2. Mes más caluroso.");
        System.out.println("3. Mes más frio.");
        System.out.println("4. Introduce el numero del mes que quieras saber su temperatura.");
        System.out.println("5. Saber la temperatura media de los meses de verano.");
        System.out.println("6. Saber la temperatura media de los meses de invierno.");
        System.out.println("7. Comparación de la tempertura de dos meses que usted escriba(Enumerado cada mes).");

        System.out.println("Eligue la opción que quieras saber(Si usted quiere realizar el 2 hasta el 7 debera realizar el 1 antes):");
        opcion = sc.nextInt();


        switch (opcion) {
            case 0:
                System.out.println("Gracias por usar esta aplicación.");
                break;
            case 1:
                temperaturas.inicializar_array(temperaturas2);
                break;
            case 2:
                Meses mes_mayor_temp=temperaturas.mayor_temperatura(temperaturas2);
                System.out.println("El mes con mayor temperatura "+ mes_mayor_temp.toString());
                break;
            case 3:
                Meses mes_menor_temp=temperaturas.menor_temperatura(temperaturas2);
                System.out.println("El mes con menor temperatura "+ mes_menor_temp.toString());
                break;
            case 4:
                System.out.println("Introduce el mes del que quieras saber la temperatura");
                int mes = sc.nextInt();
                System.out.println(sacar_temperatura(mes, temperaturas2));
                break;
            case 5:
                System.out.println("Esta es la media de los mese de verano"+ sacar_tem_verano(temperaturas2));
                break;
            case 6:
                System.out.println("esta es la media de los meses de invierno"+ sacar_tem_invierno(temperaturas2));
                break;
            case 7:
                System.out.println("Dime el primer mes");
                String Mes1 = sc.nextLine();
                System.out.println("Dime el segundo mes");
                String Mes2 = sc.nextLine();
                Meses m1 = Sacar_Mes_Enumerado(Sacar_Mes_Indice(Mes1));
                Meses m2 = Sacar_Mes_Enumerado(Sacar_Mes_Indice(Mes2));
                if (comparar(m1,m2,temperaturas2)){
                    System.out.println("Son iguales");
                }
                else{
                    System.out.println("No son iguales");
                }
                break;
        }
        }
    }

}

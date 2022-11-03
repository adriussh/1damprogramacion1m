package TrabajoProgramacion;

import java.util.Scanner;

    public class Hipoteca {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("¿Tienes trabajo? pulsa 1 si es si o pulsa 2 si es no");
            int trabajo = 0;
            do {
                Scanner hipoteca = new Scanner(System.in);
                trabajo = hipoteca.nextInt();

                switch (trabajo) {
                    case 1:
                        float vivienda =0;
                        float division =0;
                        float dinero_necesitado =0;
                        Scanner vi = new Scanner(System.in);
                        System.out.println("Introduce el dinero que necesita como ayuda");
                        dinero_necesitado = vi.nextFloat();
                        Scanner pr = new Scanner(System.in);
                        System.out.println("Introduzca el valor de la vivienda");
                        vivienda = pr.nextFloat();
                        division = dinero_necesitado/vivienda;
                        if (division<= 0.8){
                            System.out.println("Introduzca el dinero que tiene ahorrado para la casa");
                            Scanner ahorro = new Scanner(System.in);
                            double dinero_que_tiene_ahorrado = 0;
                            dinero_que_tiene_ahorrado= ahorro.nextDouble();

                            double division1 = 0;
                            division1 = dinero_que_tiene_ahorrado/vivienda;
                            if (division1>=0.2){
                                System.out.println("Perfecto, tiene concedida la hipoteca de la casa :)");
                            } else if (division1< 0.2) {
                                System.out.println("La hipoteca no se le puede conceder");
                            }
                        }


                }
            if (trabajo!=1){
                System.out.println("No podemos concederle la hipoteca,lo sentimos.");
            }
            } while(trabajo !=1);
        }
    }

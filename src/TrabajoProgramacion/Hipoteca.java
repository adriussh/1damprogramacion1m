package TrabajoProgramacion;

import java.util.Scanner;

    public class Hipoteca {
        public static void main(String[] args) {
            System.out.println("Vamos ha pedirte unos requisitos para saber si te podemos conceder o no una hipoteca, pulse 1 para comenzar");
            int trabajo = 0;
            Scanner teclado = new Scanner(System.in);
            trabajo=teclado.nextInt();
            switch (trabajo) {
                //Usamos case para introducir los requisitos ya que pueden haber dos casos, correctos y no correectos.
                case 1: {
                    float dinero_que_se_necesita = 0;
                    float vivienda = 0;
                    float division = 0;
                    Scanner ds = new Scanner(System.in);
                    System.out.println("Pon el dinero que deseas recibir como ayuda para la hipoteca");
                    dinero_que_se_necesita = ds.nextFloat();
                    //el Scanner ds lo hemos creado para que el dinero que la persona inserte se quede guardado como el dinero que se necesita para despues calcular la división.

                    Scanner vi = new Scanner(System.in);
                    System.out.println("Introduzce ahora el precio que tiene la vivienda que ha elegido");
                    vivienda = vi.nextFloat();
                    //Este Scanner es igual que el anterior pero en este caso para que guarde el precio de la vivienda.
                    division = dinero_que_se_necesita / vivienda;
                    //El calculo del precio.
                    System.out.println(division);
                    if (division <= 0.8) {
                        int dinero_ahorrado = 0;
                        System.out.println("Introduce el dinero ahorrado que poseas");
                        float division1 = 0;
                        Scanner id = new Scanner(System.in);


                        division1 = dinero_ahorrado / vivienda;
                        //si esta operación es correcta le saldra que si se le puede conceder ya que la división es mayor al 20%.

                        System.out.println(+division1);
                        if (division1 >= 0.2) {
                            System.out.println("Se le puede conceder la hipoteca de la casa");
                        } else if (division1 < 0.2) {
                            //si la operación a  es menor del 20% nos saltara este mensaje diciendo que la hipoteca no sera concedida por la flata de dinero.

                            System.out.println("No podemos concederte la hipoteca,lo sentimos");
                            return;
                            //el return finaliza con la ejecucion para que esta no siga hasta que alcanze el final y finalice.
                        }
                    }
                }
                case 2: {
                    System.out.println("No podemos concederte la hipoteca,lo sientimos");
                    //Este case lo ponemos para que cuando la division no sea la correcta salte este mensaje y termine el programa.
                }

            }

        }
    }

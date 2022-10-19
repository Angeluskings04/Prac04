import java.util.Scanner;
import java.util.Random;

/**
 * Practrica 04
 * Actividad 1
 * 
 * @author Castro Reyes Angel
 * @version 1.0
 **/

public class UsoRobot {
    public static void main(String[] args) {

        // Instanciamos los objetos necesarios.
        Scanner sc = new Scanner(System.in);
        Random decision = new Random();
        Random numero1 = new Random();
        Random numero2 = new Random();
        int calif = 0;
        // Clase robot creada por nosotros.
        Robot r1 = new Robot();

        boolean centinela = true;

        System.out.println("Hola! te saluda roboto!");

        /*
         * System.out.println("Tengo para ti estas opciones: " + "\n"
         * + "1) Operaciones basicas" + "\n"
         * + "2) Operaciones intermedias" + "\n"
         * + "3) Operaciones avanzadas" + "\n"
         * + "4) Apagarme" + "\n"
         * + "5) Encenderme" + "\n"
         * + "6) Salir" + "\n");
         */

        System.out.println("⚠ADVERTENCIA⚠" + "\n" +
                "Si me apagas no podras acceder a ninguna de las operaciones." + "\n");

        while (centinela) {
            System.out.println("Tengo para ti estas opciones: " + "\n"
                    + "1) Operaciones basicas" + "\n"
                    + "2) Operaciones intermedias" + "\n"
                    + "3) Operaciones avanzadas" + "\n"
                    + "4) Apagarme" + "\n"
                    + "5) Encenderme" + "\n"
                    + "6) Salir" + "\n");
            int opcion = sc.nextInt();
            System.out.println("\n");

            switch (opcion) {

                case 1:
                    if (r1.getEstado() == true) {
                        System.out.println("Bienvenido a operaciones basicas." + "\n"
                                + "Tu reto seran estas operaciones. Suerte!" + "\n");
                        for (int i = 1; i <= 10; i++) {
                            int op = decision.nextInt(2) + 1;
                            int num1 = numero1.nextInt(10);
                            int num2 = numero2.nextInt(10);
                            int resultado = r1.operacionesBasicas(op, num1, num2);
                            System.out.println("Cual es el resultado de esa operacion?");
                            int respuesta = sc.nextInt();
                            if (respuesta == resultado) {
                                System.out.println("Respuesta correcta");
                                calif++;
                            } else {
                                System.out.println("Respuesta incorrecta" + "\n");
                                System.out.println("La respuesta correcta es: " + resultado);
                            }
                        }
                        System.out.println("Tu calificacion es:" + calif);
                        if (calif < 5) {
                            System.out.println("\n" + "Reprobado");
                        } else if (calif >= 6) {
                            System.out.println("\n" + "Aprobado");
                        }
                        break;
                    } else {
                        System.out.println("No se puede acceder." + "\n"
                                + "El robot esta apagado, se recomienda encenderlo" + "\n");
                    }

                case 2:
                    if (r1.getEstado() == true) {
                        System.out.println("Bienvenido a operaciones basicas." + "\n"
                                + "Tu reto seran estas operaciones. Suerte!" + "\n");
                        for (int i = 1; i <= 10; i++) {
                            int op = decision.nextInt(3) + 1;
                            int num1 = numero1.nextInt(90) + 10;
                            int num2 = numero2.nextInt(90) + 10;
                            int num3 = numero2.nextInt(90) + 10;
                            int resultado = r1.operacionesIntermedias(op, num1, num2, num3);
                            System.out.println("Cual es el resultado de esa operacion?");
                            int respuesta = sc.nextInt();

                            if (respuesta == resultado) {
                                System.out.println("Respuesta correcta");
                                calif++;
                            } else {
                                System.out.println("Respuesta incorrecta" + "\n");
                                System.out.println("La respuesta correcta es: " + resultado);
                            }
                        }
                        System.out.println("Tu calificacion es:" + calif);
                        if (calif < 5) {
                            System.out.println("\n" + "Reprobado");
                        } else if (calif >= 6) {
                            System.out.println("\n" + "Aprobado");
                        }
                        break;
                    } else {
                        System.out.println("No se puede acceder." + "\n"
                                + "El robot esta apagado, se recomienda encenderlo" + "\n");
                    }

                case 3:
                    if (r1.getEstado() == true) {
                        System.out.println("Bienvenido a operaciones basicas." + "\n"
                                + "Tu reto seran estas operaciones. Suerte!" + "\n");
                        for (int i = 1; i <= 10; i++) {
                            int op = decision.nextInt(4) + 1;
                            int num1 = numero1.nextInt(800) + 100;
                            int num2 = numero2.nextInt(800) + 100;
                            int num3 = numero2.nextInt(10) + 1;
                            int resultado = r1.operacionesAvanzadas(op, num1, num2, num3);
                            System.out.println("Cual es el resultado de esa operacion?");
                            int respuesta = sc.nextInt();

                            if (respuesta == resultado) {
                                System.out.println("Respuesta correcta");
                                calif++;
                            } else {
                                System.out.println("Respuesta incorrecta");
                                System.out.println("La respuesta correcta es: " + resultado + "\n");
                            }
                        }
                        System.out.println("Tu calificacion es:" + calif);
                        if (calif < 5) {
                            System.out.println("\n" + "Reprobado");
                        } else if (calif >= 6) {
                            System.out.println("\n" + "Aprobado");
                        }
                        break;
                    } else {
                        System.out.println("No se puede acceder." + "\n"
                                + "El robot esta apagado, se recomienda encenderlo" + "\n");
                    }
                    break;

                case 4:
                    System.out.println("Adios!");
                    r1.apagarRobot();
                    break;

                case 5:
                    System.out.println("Hey! Hola otra vez!");
                    r1.encencerRobot();
                    break;

                case 6:
                    System.out.println("Hasta luego! Sigue estudiando!");
                    centinela = false;
                    break;

                default:
                    System.out.println("Esa opcion no esta disponible");

            }
        }
    }
}
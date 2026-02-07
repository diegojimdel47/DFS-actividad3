import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ngrad = 0;

        while(true) {
            try {

                System.out.print("Escribe cuantas calificaciones quieres capturar (Máximo 10): ");
                ngrad = sc.nextInt();

                if (ngrad < 1 || ngrad > 10) {
                    System.out.println("El número de calificaciones debe esta entre 1 y 10, por favor intenta de nuevo\n");
                    continue;
                } 
                break;

            } catch (InputMismatchException e) {
                System.out.println("Ese no es un valor válido, por favor intenta de nuevo\n");
                sc.nextLine();
            }
        }

            int[] grades = new int[ngrad];
            int addition = 0;

            for(int i = 0; i < ngrad; i++) {
                while(true) {
                    try {
                        System.out.print("Ingresa la calificacion " + (i + 1) + ": ");
                        int grad = sc.nextInt();

                        if (grad < 0 || grad > 100) {
                            System.out.println("La calificación debe esta entre 1 y 100\n");
                            continue;
                        }

                        grades[i] = grad;
                        addition += grad;
                        break;


                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido, por favor igresa un número entero\n");
                        sc.nextLine();
                    }
                }
            }

            double average = (double) addition/ngrad;

            System.out.println("\nPromedio: " + average);
            
            System.out.println("Aprobadas: ");
            for (int grad : grades) {
                if (grad >= 70) {
                    System.out.print(grad + " ");
                }
            }
            System.out.println();

            System.out.println("Reprobadas: ");
            for (int grad :grades) {
                if (grad < 70) {
                    System.out.print(grad + " ");
                }
            }
            System.out.println();
    }
}
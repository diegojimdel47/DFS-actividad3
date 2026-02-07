
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = 0;
        int n2 = 0;

        while(true) {

            try {
                System.out.print("Por favor ingresa un número entero: ");
                n1 = sc.nextInt();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Ese no es un número valido, por favor intenta otra vez\n");
                sc.nextLine();
            }
        }

        while(true) {

            try {
                System.out.print("Ahora ingresa un segundo número entero: ");
                n2 = sc.nextInt();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Ese no es un número valido, por favor intenta otra vez\n");
                sc.nextLine();
            }
        }

        int result = n1 + n2;
        System.out.println("La suma de " + n1 + " y " + n2 + " da: " + result);
    }
}
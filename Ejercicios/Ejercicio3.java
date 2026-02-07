import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {

            try {
                System.out.print("Ingresa un número entero del 1 al 10: ");
                int n = sc.nextInt();

                if (n < 1 || n > 10) {
                    System.out.println("El número debe de estar entre 1 y 10, por favor intenta de nuevo\n");
                    continue;
                }

                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = " + (n*i));
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("Ese no es un número entero válido, por favor intenta de nuevo\n");
                sc.nextLine();
            }
        }
    }
}
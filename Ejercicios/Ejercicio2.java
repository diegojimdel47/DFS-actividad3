import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            
            try {
                System.out.print("Por favor ingresa tu edad: ");
                int age = sc.nextInt();

                if (age < 13) {
                    System.out.println("Eres un niño");
                } else if (age < 18) {
                    System.out.println("Eres un adolescente");
                } else if (age < 65) {
                    System.out.println("Eres un adulto");
                } else {
                    System.out.println("Eres un adulto mayor");
                }

                break;
                
            } catch (InputMismatchException e) {
                System.out.println("Lo que ingresaste no entra dentro de lo que se te solicito, por favor intenta de nuevo\n");
                sc.nextLine();
            }
        }
    }
}

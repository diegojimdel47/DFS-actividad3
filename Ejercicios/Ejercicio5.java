import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word;
  
        while(true) {

            System.out.print("Escribe una palabra: ");
            word = sc.nextLine();

            if(word.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println("Debes ingresar solo letras, por favor intenta de nuevo");
            }
        }

        word = word.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        
        System.out.println("Vocales: " + vowels);
        System.out.println("Consonantes: " + consonants);
    }
}
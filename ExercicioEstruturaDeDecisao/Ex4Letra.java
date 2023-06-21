import java.util.Scanner;

public class Ex4Letra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva uma letra: ");
        String letra = scanner.next();
        scanner.close();

        if(letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u") {
            System.out.println("Sua letra é uma vogal");
        } else {
            System.out.println("Sua letra é uma consoante");
        }
    }
}

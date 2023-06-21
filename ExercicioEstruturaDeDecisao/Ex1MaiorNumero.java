import java.util.Scanner;

public class Ex1MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva um número: ");
        int numero1 = scanner.nextInt();
        System.out.println();
        System.out.print("Escreva o segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.println();

        scanner.close();

        if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é maior que o número " + numero2 );
        } else {
            System.out.println("O número " + numero2 + " é maior que o número " + numero1 );
        }
    }
}
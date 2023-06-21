import java.util.Scanner;

public class Ex2Valor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----PROGRAMA DE INDENTIDICAÇÃO DE NÚMEROS POSITIVOS E NEGATIVOS----");
        System.out.println();

        System.out.print("Escreva um número: ");
        int numero = scanner.nextInt();
        System.out.println();

        scanner.close();

        if (numero >= 1) {
            System.out.println("O número " + numero + " é positivo");
        } else if( numero == 0) {
            System.out.println("O número " + numero + " é neutro");
        } else {
            System.out.println("O número " + numero + " é negativo");
        }
    }
}

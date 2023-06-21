import java.util.Scanner;
public class Ex6MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Faça um Programa que leia três números e mostre o maior deles.

        System.out.print("Escreva o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println();
        System.out.print("Escreva o segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.println();
        System.out.print("Escreva o terceiro número: ");
        int numero3 = scanner.nextInt();
        System.out.println();

        scanner.close();
        if (numero1 > numero2 && numero1 >numero3) {
            System.out.println("O número " + numero1 + " é maior");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O número " + numero2 + " é maior");
        } else {
            System.out.println("O número " + numero3 + " é maior");
        }
        

    }
}

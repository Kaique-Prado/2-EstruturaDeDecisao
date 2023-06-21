import java.util.Scanner;

public class Ex7MaiorMenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Faça um Programa que leia três números e mostre o maior e o menor deles.

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
            System.out.println("O número " + numero1 + " é o maior");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O número " + numero2 + " é o maior");
        } else {
            System.out.println("O número " + numero3 + " é o maior");
        }

        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println("O número " + numero1 + " é o menor");
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println("O número " + numero2 + " é o menor");
        } else {
            System.out.println("O número " + numero3 + " é menor");
        }
        
    }
}

import java.util.Arrays;
import java.util.Scanner;
public class Ex9OrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Faça um Programa que leia três números e mostre-os em ordem decrescente.

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

         int[] numeros = {numero1, numero2, numero3};
        Arrays.sort(numeros);

        System.out.println("Os números em ordem decrescente são:");
        for (int comprimento = numeros.length - 1; comprimento >= 0; comprimento--) {
            System.out.println(numeros[comprimento]);
        }
        

    }
}

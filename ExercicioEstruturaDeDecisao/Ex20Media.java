import java.util.Scanner;

public class Ex20Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva a primeira nota do aluno: ");
        float nota1 = scanner.nextFloat();
        System.out.println();
        System.out.print("Escreva a segunda nota do aluno: ");
        float nota2 = scanner.nextFloat();
        System.out.println();
        System.out.print("Escreva a terceira nota do aluno: ");
        float nota3 = scanner.nextFloat();
        System.out.println(); 
        scanner.close();

        float media = (nota1 +nota2 + nota3) /3;

        if (media == 10) {
            System.out.println("Aprovado com distinção!");
        } else if (media >=7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}

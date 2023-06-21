import java.util.Scanner;
public class Ex5Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAMA PARA CALCULO DA MEDIA DE DUAS NOTAS");
        
        System.out.print("Escreva a primeira nota: ");
        float nota1 = scanner.nextFloat();
        System.out.println();
        System.out.print("Escreva a segunda nota: ");
        float nota2 = scanner.nextFloat();
        System.out.println();

        scanner.close();

        float media = (nota1 + nota2) /2;

        if (media == 10) {
            System.out.println("Aluno aprovado com distinção!");
        } else if (media >=7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}

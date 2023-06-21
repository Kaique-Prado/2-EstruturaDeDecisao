import java.util.Scanner;
public class Ex17AnoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o ano: ");
        int ano = scanner.nextInt();
        System.out.println();
        scanner.close();

        if (ano % 4 ==0 && ano % 100 !=0 || ano % 400==0) {
            System.out.println("O ano " + ano + " é bissexto");
        } else {
            System.out.println("O ano " + ano + " não é bissexto");
        }
    }
}

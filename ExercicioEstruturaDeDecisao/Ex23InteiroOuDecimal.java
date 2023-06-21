import java.util.Scanner;

public class Ex23InteiroOuDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--O programa irá identificar se o número é inteiro ou decimal--");
        System.out.print("Escreva algum número inteiro ou decimal: ");
        double numero = scanner.nextDouble();
        scanner.close();

        if (numero == Math.round(numero)) {
            System.out.println("Seu número é inteiro");
        } else {
            System.out.println("Seu número é decimal");
        }
    }
}

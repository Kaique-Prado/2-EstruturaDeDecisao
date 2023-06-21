import java.util.Scanner;

public class Ex22ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque um número inteiro: ");
        int numero = scanner.nextInt();
        scanner.close();

        if(numero % 2 == 0) {
            System.out.println("O número "+ numero +" é par");
        } else{
            System.out.println("O número "+ numero +" é impar");
        }

    }
}

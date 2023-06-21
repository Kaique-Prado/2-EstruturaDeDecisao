import java.util.Scanner;

public class Ex21SaqueCaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o valor do seu saque: ");
        int valor = scanner.nextInt();
        System.out.println();
        scanner.close();

        int notas100 = (valor / 100);
        int notas50 = (valor % 100) /50;
        int notas10 = (valor % 50) /10;
        int notas5 = (valor % 10) /5;
        int notas1 = (valor % 5) /1;

        int[] notas = {notas100, notas50,notas10, notas5, notas1 };

        if (valor < 10) {
            System.out.println("Valor mínimo para saque de 10 reais");
        } else if( valor > 600) {
            System.out.println("O valor máximo permitido para saque é de 600 reais");
        }

        System.out.println("valor do saque: R$ "+ valor +"");

        if (notas100 > 0) {
            System.out.print(notas100 +" de 100");
            if (notas.length >0) {
                System.out.print(", ");
            }
        }
        if (notas50 > 0) {
            System.out.print(notas50 +" de 50");
            if (notas.length > 0) {
                System.out.print(", ");
            }
        }
        if (notas10 > 0) {
            System.out.print(notas10 +" de 10");
            if (notas.length > 0) {
                System.out.print(", ");
            }
        }
        if (notas5 > 0) {
            System.out.print(notas5 +" de 5");
            if (notas.length >0) {
                System.out.print(", ");
            }
        }
        if (notas1 > 0) {
            System.out.print(notas1 +" de 1.");
        }
        //System.out.println("Notas: "+ notas100 +" de 100, "+ notas50 +" de 50, "+ notas10 +" de 10, "+ notas5 +" de 5, "+ notas1 + "de 1");
    }
}

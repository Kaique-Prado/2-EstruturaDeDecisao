import java.util.Scanner;

public class Ex19CasasDecimais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque um número menor 1000: ");
        int numero = scanner.nextInt();
        System.out.println();
        scanner.close();

        if(numero>=0 && numero < 1000) {
            int centena = numero / 100;
            int dezena = (numero % 100) / 10;
            int unidade = (numero % 100) % 10;
            
            if (centena > 0) {
                System.out.print(centena + " centena");
                if (centena > 1) {
                    System.out.print("s");
                }
                if (dezena > 0 || unidade > 0) {
                    System.out.print(", ");
                }
            }
            
            if (dezena > 0) {
                System.out.print(dezena + " dezena");
                if (dezena > 1) {
                    System.out.print("s");
                }
                if(unidade > 0) {
                    System.out.print(" e ");
                }
            }

            if (unidade > 0) {
                System.out.print(unidade + " unidade");
                if (unidade > 1) {
                    System.out.print("s");
                }
            }
            System.out.println();
        } else {
            System.out.println(" Número inválido");
        }
        
    }
}

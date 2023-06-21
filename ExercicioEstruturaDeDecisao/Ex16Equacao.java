import java.util.Scanner;

public class Ex16Equacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raiz1, raiz2;

         System.out.print("Coloque o valor de a: ");
         float a  = scanner.nextFloat();
         System.out.println();
         System.out.print("Coloque o valor de b: ");
         float b  = scanner.nextFloat();
         System.out.println();
         System.out.print("Coloque o valor de c: ");
         float c  = scanner.nextFloat();
         System.out.println();
         scanner.close();

         double delta = Math.pow(b,2) - (4 * a * c);
         System.out.println("O valor de delta é " + delta);


        if(a == 0) {
            System.out.println("a naõ pode ser igual a zero, a equação não é de segundo grau");
            System.out.println("Programa encerrrado!");
            System.exit(0);   
        } else if (delta < 0) {
            System.out.println("Delta deu valor negativo " + delta + ", a equação não possui raiz real!");
            System.out.println("Programa encerrado!");
            System.exit(0);
        } else if (delta ==0) {
            System.out.println("Essa equação possui raizes reais iguais");
            raiz1 = (-b + Math.sqrt(delta)) / (2*a);
            raiz2 = (-b + Math.sqrt(delta)) / (2*a);
            System.out.printf("A raiz 1 vale:" + raiz1, "%.2f" + "/n");
            System.out.printf("\n"+ "A raiz 2 vale:" + raiz2, "%.2f");
        } else {
            System.out.println("Essa equação possui raizes reais diferentes");
            raiz1 = (-b + Math.sqrt(delta) ) / (2*a);
            raiz2 = (-b - Math.sqrt(delta) ) / (2*a);
            System.out.printf("A raiz 1 vale:" + raiz1, "%.2f");
            System.out.printf("\n" + "A raiz 2 vale:" + raiz2, "%.2f");
        }


    }
}

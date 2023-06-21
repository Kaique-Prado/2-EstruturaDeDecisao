import java.util.Scanner;
public class Ex15Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o primeiro lado do triangulo: ");
        float lado1 = scanner.nextFloat();
        System.out.println();
        System.out.print("Escreva o segundo lado do triangulo: ");
        float lado2 = scanner.nextFloat();
        System.out.println();
        System.out.print("Escreva o terceiro lado do triangulo: ");
        float lado3 = scanner.nextFloat();
        System.out.println();

        

        if (lado1 +lado2 > lado3) {
            System.out.println("Os valores formam um triangulo");
        } else {
            while(lado1 +lado2 < lado3) {
                System.out.println("Os valores estão incorretos, escreva novamente");
                System.out.print("Escreva o primeiro lado do triangulo: ");
                lado1 = scanner.nextFloat();
                System.out.println();
                System.out.print("Escreva o segundo lado do triangulo: ");
                lado2 = scanner.nextFloat();
                System.out.println();
                System.out.print("Escreva o terceiro lado do triangulo: ");
                lado3 = scanner.nextFloat();
                System.out.println();
            }
        }

        scanner.close();

        if( lado1 == lado2 && lado1 ==lado3) {
            System.out.println("Esse é um triangulo Equilátero");
        } else if( lado1 ==lado2 && lado1 != lado3) {
            System.out.println("Esse é um triangulo Isósceles");
        } else if (lado1 != lado2 && lado1 !=lado3) {
            System.out.println("Esse é um triangulo Escaleno");
        }

    }
}

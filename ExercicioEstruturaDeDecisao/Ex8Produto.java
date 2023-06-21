import java.util.Scanner;
public class Ex8Produto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

        System.out.print("Escreva o preço do primeiro produto: ");
        float preco1 = scanner.nextFloat();
        System.out.println();
        System.out.print("Escreva o preço do segundo produto: ");
        float preco2 = scanner.nextFloat();
        System.out.println();
        System.out.print("Escreva o preço do terceiro produto: ");
        float preco3 = scanner.nextFloat();
        System.out.println();

        scanner.close();

        if( preco1 < preco2 && preco1 < preco3 ) {
            System.out.println("Vale a pena comprar o primero produto");
        } else if(preco2 < preco1 && preco2 < preco3) {
            System.out.println("Vale a pena comprar o segundo produto");
        } else {
            System.out.println("Vale a pena comprar o terceiro produto");
        }

    }
}

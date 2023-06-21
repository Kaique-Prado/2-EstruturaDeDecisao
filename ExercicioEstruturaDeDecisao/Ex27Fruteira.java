import java.util.Scanner;

public class Ex27Fruteira {
    public static void main(String[] args) {
        double precoMorango = 2.50, precoMaca = 1.80, precoTotal=0;
        double precoAntesDoDescontoMaca, precoAntesDoDescontoMorango;
        float kilos;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Qual fruta quer compra maça ou Morango? ");
    String fruta = scanner.next();
    System.out.println("                  Até 5 Kg               Acima de 5 Kg");
    System.out.println("Morango         R$ 2,50 por Kg          R$ 2,20 por Kg"); 
    System.out.println("Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg ");
    System.out.println("------------------------------------------------------");
    System.out.print("Quantos quilos quer levar? ");
    kilos = scanner.nextFloat();
    scanner.close();
    
    precoAntesDoDescontoMaca = kilos * precoMaca;
    precoAntesDoDescontoMorango = kilos * precoMorango;
    
    if (fruta == "maça" || fruta == "Maça") {
        if(kilos <= 5) {
            precoTotal = precoMaca * kilos;
        } else if(kilos > 5) {
            precoTotal = kilos * (12/100);
        } else if (kilos >=8 || precoAntesDoDescontoMaca == 25.00 ) {
            precoTotal = (kilos * (12/100)) * (10/100);
        }

        System.out.println("A quantidade de Maças compradas foi "+ kilos);
        System.out.println("O preço a pagar é: "+ precoTotal);
    }

    if (fruta == "morango" || fruta == "Morango") {
        if(kilos <= 5) {
            precoTotal = precoMorango * kilos;
        } else if(kilos > 5) {
            precoTotal = kilos * (16.6/100);
        } else if (kilos >=8 || precoAntesDoDescontoMorango == 25.00 ) {
            precoTotal = (kilos * (16.6/100)) * (10/100);
        }

        System.out.println("A quantidade de Maças compradas foi "+ kilos);
        System.out.println("O preço a pagar é: "+ precoTotal);
    }
  }
}

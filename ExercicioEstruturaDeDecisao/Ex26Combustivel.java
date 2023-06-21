import java.util.Scanner;

public class Ex26Combustivel {
    public static void main(String[] args) {
        double precoGasolina = 2.50, precoAlcool = 1.90, precoTotal=0;
        double litros;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o combustível: A-Alcool, G-Gasolina");
        String escolha= scanner.next();
        System.out.print("Quantos Litros? ");
        litros = scanner.nextDouble();
        scanner.close();

        switch(escolha) {
            case "A":
                if(litros> 20) {
                precoTotal = litros *(precoAlcool - precoAlcool * (5/100));
                } else {
                precoTotal = litros *(precoAlcool - precoAlcool * (3/100));
                }
            
            case "G":
                if(litros> 20) {
                    precoTotal = litros *(precoGasolina - precoGasolina * (6/100));
                } else {
                    precoTotal = litros *(precoGasolina - precoGasolina * (4/100));
                }
        }
        System.out.println("Valor a ser pago: R$" + precoTotal );
    }
}

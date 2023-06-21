import java.util.Scanner;

public class Ex28Hipermercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoFileDuploAte5Kg = 4.90;
        double precoFileDuploAcima5Kg = 5.80;
        double precoAlcatraAte5Kg = 5.90;
        double precoAlcatraAcima5Kg = 6.80;
        double precoPicanhaAte5Kg = 6.90;
        double precoPicanhaAcima5Kg = 7.80;
        double descontoCartaoTabajara = 0.05;

        System.out.println("Promoção de Carnes - Hipermercado Tabajara");
        System.out.println("=========================================");

        System.out.println("Opções de carne:");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.print("Escolha o tipo de carne (1, 2 ou 3): ");
        int tipoCarne = scanner.nextInt();

        System.out.print("Digite a quantidade em quilogramas: ");
        double quantidade = scanner.nextDouble();

        double precoTotal = 0;
        String tipoCarneStr = "";
        double precoKg = 0;

        switch (tipoCarne) {
            case 1:
                tipoCarneStr = "File Duplo";
                if (quantidade <= 5) {
                    precoKg = precoFileDuploAte5Kg;
                } else {
                    precoKg = precoFileDuploAcima5Kg;
                }
                break;
            case 2:
                tipoCarneStr = "Alcatra";
                if (quantidade <= 5) {
                    precoKg = precoAlcatraAte5Kg;
                } else {
                    precoKg = precoAlcatraAcima5Kg;
                }
                break;
            case 3:
                tipoCarneStr = "Picanha";
                if (quantidade <= 5) {
                    precoKg = precoPicanhaAte5Kg;
                } else {
                    precoKg = precoPicanhaAcima5Kg;
                }
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        precoTotal = quantidade * precoKg;

        System.out.print("Pagamento com cartão Tabajara? (S/N): ");
        char opcaoCartao = scanner.next().charAt(0);
        boolean cartaoTabajara = (opcaoCartao == 'S' || opcaoCartao == 's');
        scanner.close();

        double desconto = 0;
        if (cartaoTabajara) {
            desconto = precoTotal * descontoCartaoTabajara;
        }

        double valorAPagar = precoTotal - desconto;

        System.out.println();
        System.out.println("Cupom Fiscal");
        System.out.println("=============");
        System.out.println("Tipo de carne: " + tipoCarneStr);
        System.out.println("Quantidade: " + quantidade + " Kg");
        System.out.printf("Preço total: R$ %.2f\n", precoTotal);
        System.out.println("Tipo de pagamento: " + (cartaoTabajara ? "Cartão Tabajara" : "Outro"));
        System.out.println("Valor do desconto: R$" + desconto);
        System.out.println("Valor a pagar: R$ " + valorAPagar);
    }
}
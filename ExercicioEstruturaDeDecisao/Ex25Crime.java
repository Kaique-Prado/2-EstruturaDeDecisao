import java.util.Scanner;

public class Ex25Crime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorRespostasPositivas = 0;

        System.out.println("Responda às seguintes perguntas com 'Sim' ou 'Não'.");

        System.out.print("Telefonou para a vítima? ");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("Sim")) {
            contadorRespostasPositivas++;
        }

        System.out.print("Esteve no local do crime? ");
        resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("Sim")) {
            contadorRespostasPositivas++;
        }

        System.out.print("Mora perto da vítima? ");
        resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("Sim")) {
            contadorRespostasPositivas++;
        }

        System.out.print("Devia para a vítima? ");
        resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("Sim")) {
            contadorRespostasPositivas++;
        }

        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("Sim")) {
            contadorRespostasPositivas++;
        }

        System.out.println();

        if (contadorRespostasPositivas == 5) {
            System.out.println("Classificação: Assassino");
        } else if (contadorRespostasPositivas >= 3 && contadorRespostasPositivas <= 4) {
            System.out.println("Classificação: Cúmplice");
        } else if (contadorRespostasPositivas == 2) {
            System.out.println("Classificação: Suspeita");
        } else {
            System.out.println("Classificação: Inocente");
        }

        scanner.close();
    }
}
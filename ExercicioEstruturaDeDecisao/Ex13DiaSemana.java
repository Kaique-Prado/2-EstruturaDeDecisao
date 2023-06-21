import java.util.Scanner;

public class Ex13DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque número do dia da semana, EX: 1-Domingo, 2-Segunda ");
        int dia = scanner.nextInt();

        scanner.close();

        switch(dia) {
            case 1:
                System.out.println("Hoje é Domingo");
                break;
            case 2:
                System.out.println("Hoje é Segunda");
                break;
            case 3:
                System.out.println("Hoje é Terça");
                break;
            case 4:
                System.out.println("Hoje é Quarta");
                break;
            case 5:
                System.out.println("Hoje é Quinta");
                break;
            case 6:
                System.out.println("Hoje é Sexta");
                break;
            case 7:
                System.out.println("Hoje é Sabado");
                break;
        }

    }
}

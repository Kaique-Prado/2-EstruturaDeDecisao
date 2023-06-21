import java.util.Scanner;
public class Ex18Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String dataString = scanner.nextLine();
        scanner.close();

        if (verificarData(dataString)) {
            System.out.println("A data é válida.");
        } else {
            System.out.println("A data é inválida.");
        }
    }

    public static boolean verificarData(String dataString) {
       
        if (!dataString.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return false;
        }

        String[] partes = dataString.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;

        if (dia < 1 || dia > 31) {
            return false;
        }

        if (mes < 1 || mes > 12) {
            return false;
        }

        if (mes == 2) {
            if (bissexto) {
                return dia <= 29;
            } else {
                return dia <= 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        }
        return true;
    }

    
}

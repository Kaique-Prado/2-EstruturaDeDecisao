import java.util.Scanner;
public class Ex10Turno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual turno você estuda, M-matutino ou V-Vespertino ou N- Noturno: ");
        String turno = scanner.next();

        scanner.close();

        if(turno == "M") {
            System.out.println("Bom Dia!");
        } else if(turno =="V") {
            System.out.println("Boa Tarde!");
        } else {
            System.out.println("Boa Noite!");
        }
    }
}

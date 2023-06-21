import java.util.Scanner;

public class Ex14Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAMA PARA CALCULO DA MEDIA DE DUAS NOTAS");
        
        System.out.print("Escreva a primeira nota: ");
        float nota1 = scanner.nextFloat();
        System.out.println();
        System.out.print("Escreva a segunda nota: ");
        float nota2 = scanner.nextFloat();
        System.out.println();

        scanner.close();

        float media = (nota1 + nota2) /2;

        if (media >= 9.0 && media ==10.0) {
            System.out.println("Nota: A");

        } else if (media >=7.5 && media < 9.0) {
            System.out.println("Nota: B");

        } else if(media>=6.0 && media < 7.5){
            System.out.println("Nota: C");

        } else if(media>=4.0 && media < 6.0) {
            System.out.println("Nota: D");
            
        } else {
            System.out.println("Nota: E");
        }
    }
}

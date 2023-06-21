import java.util.Scanner;
public class Ex11ReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float percentual=0;
        
        System.out.print("Coloque o salário da pessoa: ");
        float salario = scanner.nextFloat();

        scanner.close();

        if(salario <=280.00) {
            percentual = 20;
        } else if(salario > 280.00 && salario < 700.00) {
            percentual = 15;
        } else if (salario > 700.00 && salario < 1500.00) {
            percentual = 10;
        } else if (salario >= 1500.00) {
            percentual = 5;
        }

        float reajuste = salario * (percentual /100);
        float novoSalario = salario + reajuste;


        System.out.println("O salário antes do reajuste era: " + salario );
        System.out.println("O percentual de aumento é " + percentual +"%");
        System.out.println("O valor do aumento é: " + reajuste);
        System.out.println("O novo sálario é: " + novoSalario);
    }
}

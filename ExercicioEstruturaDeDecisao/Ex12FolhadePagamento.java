import java.util.Scanner;
public class Ex12FolhadePagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto quanha por hora: ");
        float salarioHora = scanner.nextFloat();
        System.out.println();

        System.out.print("Quantas horas você trabalha no mês: ");
        int horasMes = scanner.nextInt();
        System.out.println();
        scanner.close();
        
        float salarioBruto = salarioHora * horasMes;
        float inss = salarioBruto - salarioBruto +( salarioBruto * 10/100);
        float impostoRenda = salarioBruto - salarioBruto +( salarioBruto * 5/100);
        float sindicato = salarioBruto - salarioBruto +( salarioBruto * 5/100);
        float fgts = salarioBruto - salarioBruto + (salarioBruto * 11/100);
        float salarioLiquido = salarioBruto - (inss + impostoRenda);

        
        System.out.println("Seu salário bruto é: " + "R$ "+ salarioBruto);
        System.out.println("(-) IR (5%) : "+ "R$ "+ impostoRenda);
        System.out.println("(-) INSS (10%): "+ inss);
        System.out.println("FGTS (11%): "+ "R$ "+ fgts);
        System.out.println("Total de descontos:  " + "R$ "+(inss + impostoRenda));
        System.out.println("Seu salario liquído é: " + "R$ "+ salarioLiquido);
}
}
import java.util.Scanner;

public class Ex24Operacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.println();
        System.out.print("Escreva o segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.println();
        System.out.println("Qual operação você quer realizar: 1-mais, 2-menos, 3-vezes 4- divisão");
        int operacao = scanner.nextInt();
        scanner.close();

        double resultado;
        switch(operacao) {
            case 1:
                resultado = numero1 + numero2;
                //verifica se é par
                if(resultado % 2 == 0) {
                    System.out.println("O número "+ resultado +" é par");
                } else{
                    System.out.println("O número "+ resultado +" é impar");
                }
                //verifica se é positivo ou negativo
                if(resultado >0) {
                    System.out.println("O número "+ resultado +" é positivo");
                } else {
                    System.out.println("O número "+ resultado +" é negativo");
                }
                //verifica se é inteiro ou decimal
                if(resultado == Math.round(resultado)) {
                    System.out.println("O número"+ resultado +" é inteiro");
                } else {
                    System.out.println("O número"+ resultado +" é decimal");
                }
            
            case 2: 
                resultado = numero1 - numero2;

                if(resultado % 2 == 0) {
                    System.out.println("O número "+ resultado +" é par");
                } else{
                    System.out.println("O número "+ resultado +" é impar");
                }

                if(resultado >0) {
                    System.out.println("O número "+ resultado +" é positivo");
                } else {
                    System.out.println("O número "+ resultado +" é negativo");
                }

                if(resultado == Math.round(resultado)) {
                    System.out.println("O número"+ resultado +" é inteiro");
                } else {
                    System.out.println("O número"+ resultado +" é decimal");
                }
            
            case 3:
                resultado = numero1 * numero2;

                if(resultado % 2 == 0) {
                    System.out.println("O número "+ resultado +" é par");
                } else{
                    System.out.println("O número "+ resultado +" é impar");
                }

                if(resultado >0) {
                    System.out.println("O número "+ resultado +" é positivo");
                } else {
                    System.out.println("O número "+ resultado +" é negativo");
                }

                if(resultado == Math.round(resultado)) {
                    System.out.println("O número"+ resultado +" é inteiro");
                } else {
                    System.out.println("O número"+ resultado +" é decimal");
                }

            case 4: 
                resultado = numero1 / numero2;

                if(resultado % 2 == 0) {
                    System.out.println("O número "+ resultado +" é par");
                } else{
                    System.out.println("O número "+ resultado +" é impar");
                }

                if(resultado >0) {
                    System.out.println("O número "+ resultado +" é positivo");
                } else {
                    System.out.println("O número "+ resultado +" é negativo");
                }

                if(resultado == Math.round(resultado)) {
                    System.out.println("O número"+ resultado +" é inteiro");
                } else {
                    System.out.println("O número"+ resultado +" é decimal");
                }
        }

        
    }
}

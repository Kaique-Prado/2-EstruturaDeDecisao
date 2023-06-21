import java.util.Scanner;

public class Ex3ValidacaoSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-PROGRAMA VALIDAÇÃO SEXO-");

        System.out.print("Escreva seu sexo com F ou M: ");
        String sexo = scanner.next();

    
        if (sexo == "F") {
            System.out.println("Seu sexo é Feminino" );
        } else if (sexo == "M") {
            System.out.println("Seu sexo é Maculino" );
        } else {
           System.out.println("Sexo inválido ou com letra minuscula, escreva corretamente ");
        }
        
        scanner.close();

    }
}

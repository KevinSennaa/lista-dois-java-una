import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o indicador de operação (1-Perímetro do círculo, 2-Área do círculo, 3-Volume da esfera): ");
        int operacao = scanner.nextInt();

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        double resultado = 0.0;

        switch (operacao) {
            case 1:
                resultado = 2 * Math.PI * raio;
                System.out.printf("O perímetro do círculo é: %.2f", resultado);
                break;
            case 2:
                resultado = Math.PI * Math.pow(raio, 2);
                System.out.printf("A área do círculo é: %.2f", resultado);
                break;
            case 3:
                resultado = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
                System.out.printf("O volume da esfera é: %.2f", resultado);
                break;
            default:
                System.out.println("Código de operação inválido!");
                break;
        }

        scanner.close();
    }
}

    

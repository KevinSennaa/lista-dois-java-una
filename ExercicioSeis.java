import java.util.Scanner;
import java.util.Random;

public class Exercicio26 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite um número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int num2 = scanner.nextInt();

        
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        int sorteio = random.nextInt(maior - menor + 1) + menor;

        System.out.println("O número sorteado foi: " + sorteio);
        
        if (sorteio % 2 == 0) {
            System.out.println("O número sorteado é par.");
        } else {
            System.out.println("O número sorteado é ímpar.");
        }

        scanner.close();
    }
    
}

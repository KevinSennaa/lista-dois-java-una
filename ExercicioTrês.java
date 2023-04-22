import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número a: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o número b: ");
        double b = scanner.nextDouble();
    
        System.out.println("Digite o número c: ");
        double c = scanner.nextDouble();

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau.");
            double x = -c / b;
            System.out.printf("Raiz real: %.2f\n", x);
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais.");
                System.out.printf("Valor das raízes: %.2f\n", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.printf("Valor das raízes: %.2f e %.2f\n", x1, x2);
            }
        }
    
        scanner.close();

    }
}

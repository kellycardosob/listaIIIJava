import java.util.Scanner;

public class montante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Vamos calcular os juros compostos de uma aplicacao");
        System.out.println("Digite o valor do capital a ser aplicado: ");
        int c = scanner.nextInt();    

        System.out.println("Digite a taxa de juros: ");
        double i = scanner.nextDouble();

        System.out.println("Digite o prazo de aplicacao em meses: ");
        int n = scanner.nextInt();

        int m = c * (int) Math.pow(1 + i/100, n);
        System.out.println("O montante dessa aplicacao é de: " + m);

        scanner.close();
    }
}
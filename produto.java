import java.util.Scanner;

public class produto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva o valor de um produto em R$: ");
        int valor = scanner.nextInt();

        int juros = (valor + (valor * 10 / 100));
        System.out.println("O valor desse produto com aumento de 10% vai ficar R$ : " + juros);

        scanner.close();
    }
}

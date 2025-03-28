import java.util.Scanner;

public class atividade3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total de veículos: ");
        int totalVeiculos = scanner.nextInt();

        System.out.print("Digite o total de rodas: ");
        int totalRodas = scanner.nextInt();

        int motos = (totalRodas - (totalVeiculos * 4)) / -2;
        int carros = totalVeiculos - motos;

        if (carros >= 0 && motos >= 0) {
            System.out.println("Número de carros: " + carros);
            System.out.println("Número de motos: " + motos);
        } else {
            System.out.println("Os valores inseridos são inválidos.");
        }

        scanner.close();
    }
}

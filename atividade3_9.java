import java.util.Scanner;

public class atividade3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de segundos: ");
        int totalSegundos = scanner.nextInt();

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.println("Resultado: " + horas + "h " + minutos + "m " + segundos + "s");

        scanner.close();
    }
}

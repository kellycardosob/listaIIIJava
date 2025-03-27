import java.util.Scanner;

public class graus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva a temperatura em Fahrenheit para ser convertida em graus centigrados: ");
        int fahrenheit = scanner.nextInt();

        int centigrados = (fahrenheit - 32) * 5 / 9;
        System.out.println("A temperatura em Fahrenheit eh de " + fahrenheit + " e a temperatura em centigrados eh de " + centigrados);
    }
}
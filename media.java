
import java.util.Scanner;

public class media {

    public static void main(String[] args) {
        System.out.println("Escreva dois numeros para a media aritmetica deles");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Segundo numero: ");
        int num2 = scanner.nextInt();

        int media = (num1 + num2) / 2;
        System.out.println("Media aritmetica: " + media);

        scanner.close();
    }
}

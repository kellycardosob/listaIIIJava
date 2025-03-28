import java.util.Scanner;

public class atividade3_6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero1,numero2, resultado;
        
        System.out.println("Digite o primeiro numero: ");
        numero1 = sc.nextDouble();
        System.out.println("Digite o segundo numero (Base): ");
        numero2 = sc.nextDouble();

        if (numero1 > 0 && numero2 > 0 && numero2!= 1) {
            resultado = Math.log(numero1) / Math.log(numero2);
            System.out.printf("O logaritmo de %.2f na base %.2f é: %.2f\n", numero1, numero2, resultado);
        } else {
            System.out.println("Erro: O número e a base devem ser positivo e  diferente de 1.");
        }
        sc.close();
    }
    
}

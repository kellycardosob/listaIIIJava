import java.util.Scanner;

public class Atividade3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horaTrabalhada, valorHora, salarioPorFilho, salarioBase, salarioFamilia, salarioBruto;

        System.out.println("Digite o valor da  hora de trabalho: ");
        valorHora = sc.nextDouble();

        System.out.println("Digite o numero de horas trabalhadas no mes: ");
        horaTrabalhada = sc.nextDouble();

        System.out.println("Digite o valor do salario familia por filio: ");
        salarioPorFilho = sc.nextDouble();

        System.out.println("Digite o numero de filhos: ");
        int numeroFilhos = sc.nextInt();

        salarioBase = horaTrabalhada * valorHora;
        salarioFamilia= salarioPorFilho * numeroFilhos;
        salarioBruto = salarioBase + salarioFamilia;

        System.out.printf("O salário bruto a ser recebido é: R$ %.2f\n", salarioBruto);

        sc.close();
    }
    
}

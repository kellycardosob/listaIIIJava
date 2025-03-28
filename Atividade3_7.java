import java.util.Scanner;

public class Atividade3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salariFixo, totalVendas, percentual, salarioTotal,comissao;

        System.out.println("Digite o salrio fixo do funcionario: ");
        salariFixo = sc.nextDouble();
        System.out.println("Digite o total de vendas do funcionario no mes: ");
        totalVendas = sc.nextDouble();
        System.out.println("digite o percentual de comissao: ");
        percentual = sc.nextDouble();

        comissao = (percentual/100) * totalVendas;
        System.out.printf("O valor da comissao foi:R%.2f\n", comissao);
        salarioTotal = salariFixo + comissao;
        
        System.out.printf("O salario total acrescido da comissao e:R$%.2f\n ", salarioTotal);

        sc.close();
    }
    
}

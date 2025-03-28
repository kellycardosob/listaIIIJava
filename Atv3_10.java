import java.util.*;
import java.math.*;

public class Atv3_10 {

    public static void main(String[] args) {
        
        double numero1, numero2, numero3;
        double mediaArt, mediaHar, mediaGeo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        numero1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        numero2 = sc.nextInt();
        System.out.println("Digite o terceiro número");
        numero3 = sc.nextInt();

        mediaArt = (numero1 + numero2 + numero3) / 3;
        mediaHar = 3 / ((1/numero1) + (1/numero2) + (1/numero3));
        mediaGeo = Math.cbrt(numero1 * numero2 * numero3);

        System.out.println(mediaArt);
        System.out.println(mediaHar);
        System.out.println(mediaGeo);
        

    }
}

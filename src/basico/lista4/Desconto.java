package basico.lista4;
import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual o produto desejado? ");
        String produto = leitor.nextLine();
        System.out.print("Qual o valor do produto desejado? ");
        double valor = Double.parseDouble(leitor.nextLine());

        if (valor > 300) {
            System.out.printf("\nValor final " + produto + " = R$%.2f ", (valor - (valor * 0.3)));
            System.out.printf("e o desconto foi de = R$%.2f %n", (valor * 0.3));
        } else if (valor > 200) {
            System.out.printf("\nValor final " + produto + " = R$%.2f ", (valor - (valor * 0.2)));
            System.out.printf("e o desconto foi de = R$%.2f %n", (valor * 0.2));
        } else if (valor > 100) {
            System.out.printf("\nValor final " + produto + " = R$%.2f ", (valor - (valor * 0.1)));
            System.out.printf("e o desconto foi de = R$%.2f %n", (valor * 0.1));
        } else if (valor <= 100) {
            System.out.println("\nDescontos somente em produtos a partir de R$100");
        }
    }
}

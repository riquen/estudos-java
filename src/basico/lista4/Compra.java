package basico.lista4;
import java.util.Scanner;

public class Compra {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Quanto você possui de dinheiro? ");
        double qtdeDinheiro = Double.parseDouble(leitor.nextLine());
        System.out.print("Qual o valor do produto? ");
        double valorProd = Double.parseDouble(leitor.nextLine());
        System.out.print("Quantos você vai comprar? ");
        double qtdeProd = Double.parseDouble(leitor.nextLine());

        if (qtdeDinheiro > (valorProd * qtdeProd)) {
            System.out.println("\nVocê possui dinheiro suficiente para comprar.");
        } else {
            System.out.println("\nVocê não possui dinheiro suficiente para comprar.");
        }
    }
}

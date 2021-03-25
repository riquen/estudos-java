package basico.lista5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TotalCompra {
    public static void main(String[] args) {
        List<String> produtos = new ArrayList<>();
        List<Double> total = new ArrayList<>();
        String resp = "S";
        Scanner leitor = new Scanner(System.in);

        while (resp.equalsIgnoreCase("S")) {
            System.out.print("Informe o " + (produtos.size() + 1) + "º produto: ");
            produtos.add(leitor.nextLine());
            System.out.print("Qual é o preço do produto? ");
            double preco = Double.parseDouble(leitor.nextLine());
            System.out.print("Quantos você vai comprar? ");
            int qtde = Integer.parseInt(leitor.nextLine());
            total.add(preco * qtde);
            System.out.print("Deseja adicionar outro produto(S/N)? ");
            resp = leitor.nextLine();
        }

        double soma = 0;
        for (Double lista : total) {
            soma += lista;
        }
        System.out.println("\nLista de compras" + produtos);
        System.out.printf("Total = R$%.2f %n", soma);
    }
}

package basico.lista4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        List<Double> numeros = new ArrayList<>();
        String resp = "S";

        while (resp.equalsIgnoreCase("S")) {
            Scanner leitor = new Scanner(System.in);
            System.out.print("Digite o número: ");
            numeros.add(Double.parseDouble(leitor.nextLine()));
            System.out.print("Deseja adicionar outro número(S/N)? ");
            resp = leitor.nextLine();
        }
        double maior = 0;
        for (Double numero : numeros) {
            if (maior < numero) {
             maior = numero;
            }
        }
        System.out.printf("\nO maior valor digitado foi: %.2f %n", maior);
    }
}

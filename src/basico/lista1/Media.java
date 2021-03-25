package basico.lista1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Media {
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

        double soma = 0;
        for (Double i : numeros) {
            soma += i;
        }
        System.out.printf("\nA média entre os números digitados é = %.2f %n", (soma / numeros.size()));
    }
}

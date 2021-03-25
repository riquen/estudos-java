package basico.lista5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaIdades {
    public static void main(String[] args) {
        List<Integer> idade = new ArrayList<>();
        String resp = "S";
        Scanner leitor = new Scanner(System.in);

        while (resp.equalsIgnoreCase("S")) {
            System.out.print("Informe a idade da " + (idade.size() + 1) + "ª pessoa: ");
            idade.add(Integer.parseInt(leitor.nextLine()));
            System.out.print("Deseja adicionar outra idade(S/N)? ");
            resp = leitor.nextLine();
        }

        int soma = 0;
        for (Integer idades : idade) {
            soma += idades;
        }
        System.out.println("\nA soma das idades é = " + soma + " anos.");
    }
}

package basico.lista5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaioresDeIdade {
    public static void main(String[] args) {
        List<Integer> idades = new ArrayList<>();
        String resp = "S";
        Scanner leitor = new Scanner(System.in);

        while (resp.equalsIgnoreCase("S")) {
            System.out.print("Informe a idade da " + (idades.size() + 1) + "ª pessoa: ");
            idades.add(Integer.parseInt(leitor.nextLine()));
            System.out.print("Deseja adicionar outra idade(S/N)? ");
            resp = leitor.nextLine();
        }

        int maiores = 0;
        for (int idade : idades) {
            if (idade > 17) {
                maiores++;
            }
        }
        if (maiores == 1){
            System.out.println("\n" + maiores + " pessoa é maior de idade.");
        } else {
            System.out.println("\n" + maiores + " pessoas são maiores de idade.");
        }
    }
}

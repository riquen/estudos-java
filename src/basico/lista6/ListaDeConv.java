package basico.lista6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeConv {
    public static void main(String[] args) {
        List<String> convidados = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        String resp = "S";

        while (resp.equalsIgnoreCase("S")) {
            System.out.print("Informe o nome da " + (convidados.size() + 1) + "ª pessoa: ");
            convidados.add(leitor.nextLine());
            System.out.print("Deseja adicionar mais alguém(S/N)? ");
            resp = leitor.nextLine();
        }

        System.out.println("\nLista de convidados");
        for (String lista : convidados) {
            System.out.println(lista);
        }
    }
}

package basico.lista2;
import java.util.Scanner;

public class TrocaNomes {
    public static void main(String[] args) {
        String nome = "Henrique", sobreNome = "Arantes";
        Scanner leitor = new Scanner(System.in);

        System.out.print("O nome salvo atualmente é " + nome + " " + sobreNome + ". Deseja alterar(S/N)? ");
        String resp;
        resp = leitor.nextLine();

        if (resp.equalsIgnoreCase("S")) {
            System.out.print("Digite o novo nome: ");
            nome = leitor.nextLine();
            System.out.print("Digite o novo sobrenome: ");
            sobreNome = leitor.nextLine();
            System.out.println("\nO nome agora é " + nome + " " + sobreNome + ".");
        } else if (resp.equalsIgnoreCase("N")) {
            System.out.println("O nome salvo permanece " + nome + " " + sobreNome + ".");
        }
    }
}

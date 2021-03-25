package basico.lista2;
import java.util.Scanner;

public class Ola {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("\nOlá " + nome + ", seja bem vindo(a).");
    }
}

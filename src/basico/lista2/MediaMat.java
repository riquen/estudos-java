package basico.lista2;
import java.util.Scanner;

public class MediaMat {
    public static void main(String[] args) {
        System.out.print("Digite o seu nome: ");
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();
        Double[] notas = new Double[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º bimestre: ");
            notas[i] = Double.parseDouble(leitor.nextLine());
        }

        double soma = 0;
        for (Double j : notas) {
            soma += j;
        }
        System.out.printf("\n" + nome + ", a sua média em matemática foi = %.2f %n", (soma/notas.length));
    }
}

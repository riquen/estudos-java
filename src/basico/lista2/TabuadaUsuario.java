package basico.lista2;
import java.util.Scanner;

public class TabuadaUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = Integer.parseInt(leitor.nextLine());
        System.out.println("\nTabuada do número " + numero);

        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " x " + i + " = "  + (i * numero));
        }
    }
}

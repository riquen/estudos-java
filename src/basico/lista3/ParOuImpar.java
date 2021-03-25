package basico.lista3;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        System.out.print("Digite um número: ");
        Scanner leitor = new Scanner(System.in);
        int numero = Integer.parseInt(leitor.nextLine());
        numero = numero % 2;

        if (numero == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar.");
        }
    }
}

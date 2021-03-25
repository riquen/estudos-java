package basico.lista1;
import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = Double.parseDouble(leitor.nextLine());
        System.out.print("Digite a altura: ");
        double altura = Double.parseDouble(leitor.nextLine());

        System.out.printf("\nA área do triângulo é = %.2f %n", (base * altura));
    }
}

package basico.lista3;
import java.util.ArrayList;
import java.util.Scanner;

public class LadosTriangulo {
    public static void main(String[] args) {
        ArrayList<Double> lados = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o valor dos lados");
        for (char letra = 'A'; letra < 'D'; letra++) {
            System.out.print("Lado " + letra + ": ");
            lados.add(Double.parseDouble(leitor.nextLine()));
        }

        if (lados.get(0) < (lados.get(1) + lados.get(2)) && lados.get(1) < (lados.get(2) + lados.get(0)) && lados.get(2) < (lados.get(0) + lados.get(1))) {
            System.out.println("\nOs valores representam os lados de um triângulo.");
        } else {
            System.out.println("\nOs valores não representam os lados de um triângulo.");
        }
    }
}

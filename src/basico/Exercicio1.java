package basico;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Exercicio1 {
    public static boolean isInt(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException ex) {
            System.out.println("Não é um inteiro.");
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputOne = 0;

        boolean checkOneInput = true;
        while (checkOneInput) {
            System.out.print("Digite um número inteiro: ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            if (isInt(input)) {
                inputOne = Integer.parseInt(input);
                checkOneInput = false;
            }
        }

        int inputTwo = 0;

        boolean checkTwoInput = true;
        while (checkTwoInput) {
            System.out.print("Digite outro número inteiro: ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            if (isInt(input)) {
                inputTwo = Integer.parseInt(input);
                checkTwoInput = false;
            }
        }
        int PROD = inputOne * inputTwo;
        System.out.println("\nPROD = " + PROD);
    }
}

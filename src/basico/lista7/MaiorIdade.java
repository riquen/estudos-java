package basico.lista7;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("", 0);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        pessoa.setNome(leitor.nextLine());
        System.out.print("Informe o ano do nascimento: ");
        pessoa.setAnoNasc(Integer.parseInt(leitor.nextLine()));

        SimpleDateFormat formato = new SimpleDateFormat("yyyy");
        Date anoAtual = new Date();
        int idade = (Integer.parseInt(formato.format(anoAtual)) - pessoa.getAnoNasc());

        if (idade > 17) {
            System.out.println("\n" + pessoa.getNome() + " é maior de idade.");
        } else {
            System.out.println("\n" + pessoa.getNome() + " é menor de idade.");
        }
    }
}

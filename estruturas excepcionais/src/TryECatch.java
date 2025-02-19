import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryECatch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // obtendo dados do usuario
        try {
            System.out.println("Digite seu nome");
            String nome = scanner.nextLine();

            System.out.println("digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("digite sua altura");
            double altura = scanner.nextDouble();

            // imprimindo dados obtidos pelo usuario
            System.out.println("nome:" + nome.toUpperCase());
            System.out.println("sobrenome: " + sobrenome.toUpperCase());
            System.out.println("idade:" + idade);
            System.out.println("altura:" + altura);
            scanner.close();

        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada de dados");
        }

    }

}

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua Agencia");
        int agencia = scanner.nextInt();

        System.out.println("Digite o numero da sua conta");
        String conta = scanner.next();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite o seu saldo");
        double saldo = scanner.nextDouble();

        //Imprimindo
        System.out.println("Ola " +nome+ " " +sobrenome+ ", obrigado por criar uma conta conosco, sua agencia é " +agencia+ ", sua conta " +conta+ " e seu saldo é " +saldo+ ", o mesmo ja esta disponivel para saque");
    }
}

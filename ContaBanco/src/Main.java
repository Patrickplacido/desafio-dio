import javax.swing.text.html.parser.Parser;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor, digite o número da agência: ");
        Scanner sc1 = new Scanner(System.in);
        conta.setAgencia(sc1.nextLine());

        System.out.println("Por favor, digite o seu nome completo: ");
        Scanner sc2 = new Scanner(System.in);
        conta.setNomeCliente(sc2.nextLine());

        System.out.println("Por favor, digite o número da conta: ");
        Scanner sc3 = new Scanner(System.in);
        conta.setNumero(sc3.nextInt());

        System.out.println("Por favor, digite o seu saldo: ");
        Scanner sc4 = new Scanner(System.in).useLocale(Locale.US);
        conta.setSaldo(sc4.nextDouble());

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco.\n"
                                         +"Sua agência é %s, conta %d.\nSeu saldo de %.2f já está"
                                         +" disponível para saque.", conta.getNomeCliente(),
                                                                   conta.getAgencia(),
                                                                   conta.getNumero(),
                                                                   conta.getSaldo()));
    }
}


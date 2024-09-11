import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja bem vindo ao nosso banco\n");

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta= scanner.nextInt();

        System.out.println("Por favor, digite a sua agência");
        String agenciaCliente = scanner.next();

        scanner.nextLine();
        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente= scanner.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        double saldoCliente= scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente + "," + "obrigado por criar uma conta em nosso banco, sua agência é " + agenciaCliente +"," +"conta "+ numeroConta +" e seu saldo "+ saldoCliente +" já está disponível para saque.");
    }
}
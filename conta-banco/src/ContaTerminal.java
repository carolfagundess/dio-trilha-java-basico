import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor digite o seu nome: ");
        String nomeCliente = sc.nextLine();
        
        System.out.print("Por favor digite o número da agência: ");
        String agencia = sc.next();

        System.out.print("Por favor digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.print("Por favor digite o valor do depósito: ");
        Double saldo = sc.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já esta disponível para saque");

        sc.close();
    }
}

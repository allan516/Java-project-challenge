import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o número da sua Agência: ");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.print("Digite o seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Deposite um valor mínimo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}

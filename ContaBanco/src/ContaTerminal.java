import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        float saldo = 0.0f;

        System.out.println("Digite o número da Conta:");
        numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Digite a Agência:");
        agencia = scanner.nextLine();

        System.out.println("Digite seu nome:");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite seu saldo:");
        saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua Agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}

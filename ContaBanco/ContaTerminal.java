import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String msgNomeCliente = "Por favor, insira o seu Nome:";
        String msgAgencia = "Por favor, insira o número da Agência";
        String msgConta = "Por favor, insira o número da Conta:";
        String msgSaldo = "Por favor, insira o seu Saldo:";

        System.out.println(msgNomeCliente);
        String nomeCliente = scanner.nextLine();
        System.out.println(msgAgencia);
        String agencia = scanner.nextLine();
        System.out.println(msgConta);
        int conta = scanner.nextInt();
        System.out.println(msgSaldo);
        double saldo = scanner.nextDouble();
    }
}
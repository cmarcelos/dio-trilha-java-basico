import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int Numero;
        String Agencia, NomeCliente;
        double Saldo;

        // Solicitação dos dados via terminal
        System.out.print("Por favor, digite o número da Conta: ");
        Numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Digite o nome do cliente: ");
        NomeCliente = scanner.nextLine();
        System.out.print("Digite o saldo: ");
        Saldo = scanner.nextDouble();

        // Solicitação da agência (correção)
        System.out.print("Digite o número da Agência: ");
        Agencia = scanner.next();

        // Exibição dos dados
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + Agencia + ", conta " + Numero + " e seu saldo é R$" + Saldo);
        System.out.println("já está disponível para saque.");

        // Encerramento do Scanner
        scanner.close();
    }
}

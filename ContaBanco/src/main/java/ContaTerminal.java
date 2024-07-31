import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        Double saldo = 237.48;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.next();
        System.out.println("Por favor, digite o número da Conta!");
        numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite seu nome completo");
        nomeCliente = scanner.next();
        String mensagemSaudacao = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo no valor de R$ %s já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);
        System.out.println(mensagemSaudacao);
    }
}

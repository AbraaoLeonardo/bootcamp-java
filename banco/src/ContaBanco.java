import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero da conta: ");
        int numero = sc.nextInt();
        System.out.print("Digite o numero da agencia: ");
        String agencia = sc.next();
        System.out.print(("Digite o seu nome: "));
        String nomeDoCliente = sc.next();
        System.out.print("Digite o saldo disponível em conta: ");
        float saldo = sc.nextFloat();
        sc.close();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeDoCliente, saldo);

        System.out.println("Olá " + conta.getNomeDoCliente() + " obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + " conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");
    }
}

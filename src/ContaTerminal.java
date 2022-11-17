import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner Numero = new Scanner(System.in);
        Scanner Agencia = new Scanner(System.in);
        Scanner Nome = new Scanner(System.in);
        Scanner Saldo = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = Numero.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        int agencia = Agencia.nextInt();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = Nome.nextLine();

        System.out.println("Por favor digite o seu saldo: ");
        double saldo = Saldo.nextDouble();

        System.out.println("Olá " + nomeCliente +  ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " +saldo +" já está disponível para saque");

    }
}
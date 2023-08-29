import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("***** Banco Justo *****");
        System.out.print("Por favor digite o seu nome: ");
        String nomeCliente = scanner1.nextLine();
        
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner2.nextLine();

        System.out.print("Por favor digite o número da sua conta: ");
        int conta = scanner1.nextInt();
        
        double saldo = 150; 

        scanner1.close();
        scanner2.close();

        System.out.println("===========================");
        System.out.printf("Olá %s, obrigado por criar uma conta no nosso banco.", nomeCliente);
        System.out.println();
        System.out.println("***** Dados da Conta *****");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.printf("Saldo: R$%.2f", saldo);
        System.out.println();
        System.out.println("Obrigado por utilizar os serviços do nosso banco.");
        System.out.println("===========================");
    }
}

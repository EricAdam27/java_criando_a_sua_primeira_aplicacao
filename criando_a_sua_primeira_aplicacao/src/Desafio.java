import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomeCliente = "Maria Jose";
        String tipoConta = "Corrente";
        double saldoCliente = 2500.00;

        System.out.println("****************************");
        System.out.println("Dados do cliente");
        System.out.println("Nome:           "+ nomeCliente);
        System.out.println("Tipo da conta:  "+ tipoConta);
        System.out.println("Saldo:          R$ "+ saldoCliente);
        System.out.println("****************************");

        int opcao = 0;

        while (opcao != 4) {
            System.out.print("""
                \nOPERACOES
                1 - Consultar saldo
                2 - Depositar valor
                3 - Transferir valor
                4 - Sair
                """);

            System.out.print("Digite a opcao desejada: ");

            opcao = sc.nextInt();

            if (opcao >= 5) {
                System.out.println("Opcao invalida. Tentei novamente.");
            } else if (opcao == 1) {
                    System.out.println("Saldo:          R$ "+ saldoCliente);
            } else if (opcao == 2) {
                System.out.print("Valor do deposito: R$ ");
                saldoCliente += sc.nextDouble();
                System.out.println("Saldo:          R$ "+ saldoCliente);
            } else if (opcao == 3) {
                System.out.print("Valor da transferencia: R$ ");
                double valorTranferencia = sc.nextDouble();
                if (valorTranferencia > saldoCliente) {
                    System.out.println("Valor maior que o saldo disponivel. Tente novamente.");
                } else {
                    saldoCliente -= valorTranferencia;
                    System.out.println("Saldo:          R$ "+ saldoCliente);
                }
            }
        }
    }
}

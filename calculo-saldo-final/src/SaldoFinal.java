import java.util.Scanner;

public class SaldoFinal {
    public static void main(String[] args) {

        double saldoFinal = 0.00;

        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        System.out.println("Informe o saldo inicial para sua conta bancária:");
        double saldoInicial = scanner.nextDouble();

        // TODO: Na linha abaixo, implemente a entrada das três transações:
        System.out.println("OBS_1: Para depósitos informe números positivos.");
        System.out.println("OBS_2: Para saques informe números negativos.");
        System.out.println("Informe a transacao 1/3:");
        double transacao_1 = scanner.nextDouble();
        saldoFinal = saldoInicial + transacao_1;

        System.out.println("Informe a transacao 2/3:");
        double transacao_2 = scanner.nextDouble();
        saldoFinal = saldoFinal + transacao_2;

        System.out.println("Informe a transacao 3/3:");
        double transacao_3 = scanner.nextDouble();
        saldoFinal = saldoFinal + transacao_3;

        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}

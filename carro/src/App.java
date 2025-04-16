import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        var opcao = -1;
        Carro carro = new Carro();
        System.out.println("Pronto para um passeio de carro?");
        do {
            System.out.println("\nEscolha uma das opções:");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Desacelerar");
            System.out.println("5 - Virar à direita");
            System.out.println("6 - Virar à esquerda");
            System.out.println("7 - Engrenar uma marcha acima");
            System.out.println("8 - Engrenar uma marcha abaixo");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 0:
                    opcao = 0;
                    break;
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    carro.desacelerar();
                    break;
                case 5:
                    carro.virarDireita();
                    break;
                case 6:
                    carro.virarEsquerda();
                    break;
                case 7:
                    carro.aumentarMarcha();
                    break;
                case 8:
                    carro.diminuirMarcha();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao > 0);

        System.out.println("Saindo do sistema...");
    }
}

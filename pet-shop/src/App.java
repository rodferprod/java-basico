import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) throws Exception {

        var option = -1;

        do {
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Lavar o pet");
            System.out.println("2 - Abastecer máquina com água");
            System.out.println("3 - Abastecer máquina com shampoo");
            System.out.println("4 - Verificar nível de água");
            System.out.println("5 - Verificar nível de shampoo");
            System.out.println("6 - Verificar se a máquina está ocupada");
            System.out.println("7 - Inserir pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Lavar a máquina");
            System.out.println("0 - Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    petMachine.takeShower();
                    break;
                case 2:
                    petMachine.addWater();
                    break;
                case 3:
                    petMachine.addShampoo();
                    break;
                case 4:
                    System.out
                            .println("-------> O nível de água da máquina é de " + petMachine.getWater() + " litros.");
                    break;
                case 5:
                    System.out.println(
                            "-------> O nível de shampoo da máquina é de " + petMachine.getShampoo() + " litros.");
                    break;
                case 6:
                    if (petMachine.hasPet()) {
                        System.out.println("-------> A máquina está ocupada no momento.");
                    } else {
                        System.out.println("-------> Máquina liberada para uso!");
                    }
                    break;
                case 7:
                    setPetInMachine();
                    break;
                case 8:
                    petMachine.removePet();
                    break;
                case 9:
                    petMachine.cleanMachine();
                    break;
                case 0:
                    option = 0;
                    System.out.println("-------> Sair do sistema");
                    break;
                default:
                    System.out.println("-------> Opção inválida!");
                    break;
            }

        } while (option != 0);

        scanner.close();
    }

    public static void setPetInMachine() {

        if (petMachine.hasPet()) {
            System.out.println("-------> A máquina está ocupada no momento.");
            return;
        }

        if (!petMachine.isCleaned()) {
            System.out.println("-------> A máquina precisa ser limpa antes de colocar um pet.");
            return;
        }

        String name = "";

        while (name == null || name.isEmpty()) {
            System.out.println("-------> Informe o nome do pet:");
            name = scanner.next();
        }

        petMachine.setPet(new Pet(name));
        System.out.println("-------> O pet " + name + " foi inserido na máquina.");
    }
}

public class App {

    public static void main(String[] args) {
        printEmpregados(
                new Gerente("Colab",
                        "Pedro",
                        "pedro@gmail.com",
                        49,
                        "Rua 10, nº55, Centro",
                        "Gerente",
                        5000,
                        "pedro",
                        "pdr123",
                        1500.0));
        printEmpregados(
                new Vendedor("Colab",
                        "Renato",
                        "renato@gmail.com",
                        28,
                        "Rua Nova, nº 6, Caleme",
                        "Vendedor",
                        1500.00,
                        20.0,
                        10000.0));
    }

    public static void printEmpregados(Colaborador colaborador) {

        System.out.printf("========= %s =========\n", colaborador.getClass().getCanonicalName());
        System.out.println("Codigo: " + colaborador.getCodigo());
        System.out.println("Nome: " + colaborador.getNome());
        System.out.println("Email: " + colaborador.getEmail());
        System.out.println("Idade: " + colaborador.getIdade());
        System.out.println("Endereço: " + colaborador.getEndereco());
        System.out.println("Função: " + colaborador.getFuncao());
        System.out.println("Salario: R$ " + colaborador.getSalario());

        if (colaborador instanceof Vendedor vendedor) {
            System.out.println("Porcentagem sobre Vendas: " + vendedor.getPorcentagemVenda() + "%");
            System.out.println("Total de Vendas: R$ " + vendedor.getTotalVendas());
            System.out.println("Total Salário: " + colaborador.getTotalSalario());
        }

        if (colaborador instanceof Gerente gerente) {
            System.out.println("Comissão: R$ " + gerente.getComissao());
            System.out.println("Total Salário: " + gerente.getTotalSalario(500));
        }

    }
}
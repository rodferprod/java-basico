import ordenar.OrdenarPessoas;

public class Ordenar {
    public static void main(String[] args) {
        OrdenarPessoas ordenarPessoas = new OrdenarPessoas();
        ordenarPessoas.adicionarPessoa("Pessoa 01", 21, 1.54);
        ordenarPessoas.adicionarPessoa("Pessoa 02", 14, 1.75);
        ordenarPessoas.adicionarPessoa("Pessoa 03", 65, 1.68);
        ordenarPessoas.adicionarPessoa("Pessoa 04", 34, 1.82);
        ordenarPessoas.adicionarPessoa("Pessoa 05", 17, 1.55);
        ordenarPessoas.adicionarPessoa("Pessoa 06", 19, 1.83);
        ordenarPessoas.adicionarPessoa("Pessoa 07", 37, 1.43);
        ordenarPessoas.adicionarPessoa("Pessoa 08", 84, 1.52);
        ordenarPessoas.adicionarPessoa("Pessoa 09", 73, 1.93);
        ordenarPessoas.adicionarPessoa("Pessoa 10", 58, 1.49);

        System.out.println(ordenarPessoas.getListaPessoas());

        System.out.println(ordenarPessoas.ordenarPorAltura());

        System.out.println(ordenarPessoas.ordenarPorIdade());
    }
}

import conjunto.contatos.ConjuntoContatos;

public class ConjuntoPesquisar {
    public static void main(String[] args) {
        ConjuntoContatos conjuntoContatos = new ConjuntoContatos();

        conjuntoContatos.imprimirContatos();

        conjuntoContatos.adicionarContato("Rodrigo", 4565468);
        conjuntoContatos.adicionarContato("Rafael", 5645665);
        conjuntoContatos.adicionarContato("Ricardo", 4798768);
        conjuntoContatos.adicionarContato("Rômulo", 98564874);
        conjuntoContatos.adicionarContato("Adriana", 54231234);
        conjuntoContatos.adicionarContato("Rodrigo", 87655676);
        conjuntoContatos.adicionarContato("Rodrigo José", 58687667);
        conjuntoContatos.adicionarContato("Rodrigo Guimarães", 321342334);
        conjuntoContatos.adicionarContato("Rodrigo Ferreira", 521314254);

        conjuntoContatos.imprimirContatos();

        System.out.println(conjuntoContatos.pesquisarNome("Rodrigo"));

        System.out.println(conjuntoContatos.atualizarContato("rodrigo ferreira", 9999999));

        conjuntoContatos.imprimirContatos();
    }
}

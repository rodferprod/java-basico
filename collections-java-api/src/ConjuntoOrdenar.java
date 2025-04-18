import conjunto.produtos.ConjuntoProdutos;

public class ConjuntoOrdenar {
    public static void main(String[] args) {
        ConjuntoProdutos conjuntoProdutos = new ConjuntoProdutos();

        conjuntoProdutos.listarProdutos();

        conjuntoProdutos.adicionarProduto("Produto 01", 543L, 7d, 3);
        conjuntoProdutos.adicionarProduto("Produto 02", 436L, 5d, 20);
        conjuntoProdutos.adicionarProduto("Produto 03", 388L, 21d, 4);
        conjuntoProdutos.adicionarProduto("Produto 04", 598L, 15d, 7);
        conjuntoProdutos.adicionarProduto("Produto 05", 544L, 2d, 9);
        // Item será ignorado por ter o mesmo código do primeiro item
        conjuntoProdutos.adicionarProduto("Produto 06", 543L, 10d, 14);

        conjuntoProdutos.listarProdutos();

        System.out.println(conjuntoProdutos.ordenarPorNome());

        System.out.println(conjuntoProdutos.ordenarProdutosPorValor());
    }
}

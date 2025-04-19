import map.produtos.EstoqueProdutos;

public class MapProdutos {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.imprimirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto 01", 5d, 40);
        estoqueProdutos.adicionarProduto(2L, "Produto 02", 15d, 35);
        estoqueProdutos.adicionarProduto(3L, "Produto 03", 25d, 30);
        estoqueProdutos.adicionarProduto(4L, "Produto 04", 35d, 25);
        estoqueProdutos.adicionarProduto(5L, "Produto 05", 45d, 20);
        estoqueProdutos.adicionarProduto(6L, "Produto 06", 55d, 25);
        estoqueProdutos.adicionarProduto(7L, "Produto 07", 65d, 15);
        // Produto irá substituir o item anterior pois tem
        // a mesma chave e o método .put() irá atualizar o registro
        estoqueProdutos.adicionarProduto(7L, "Produto 08", 70d, 10);

        estoqueProdutos.imprimirProdutos();

        System.out.println("Produto mais caro do estoque: " + estoqueProdutos.obterProdutoMaisCaro());

        System.out.println("Valor total de produtos em estoque: R$ " + estoqueProdutos.calculaValorTotalEstoque());
    }
}

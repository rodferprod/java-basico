package map.produtos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    // A classe Map trabalha com pares Chave=Valor e já possui mecanismos
    // para assegurar que não haverá nenhum item repetido, pois a chave
    // (declarada aqui como uma Long) sempre será única no conjunto.
    // Os valores serão objetos do tipo Produto
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, double valor, int quantidade) {
        this.estoqueProdutos.put(codigo, new Produto(nome, valor, quantidade));
    }

    public void imprimirProdutos() {
        System.out.println(this.estoqueProdutos);
    }

    public double calculaValorTotalEstoque() {
        double valorTotal = 0d;
        if (!this.estoqueProdutos.isEmpty()) {
            // O método .values() irá retornar uma coleção do tipo Produto
            for (Produto produto : this.estoqueProdutos.values()) {
                valorTotal += produto.getValor() * produto.getQuantidade();
            }
            System.out.println(this.estoqueProdutos.size() + " produtos no estoque.");
        } else {
            System.out.println("Estoque vazio!");
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;
        if (!this.estoqueProdutos.isEmpty()) {
            // O método .values() irá retornar uma coleção do tipo Produto
            for (Produto produto : this.estoqueProdutos.values()) {
                if (produto.getValor() > maiorValor) {
                    produtoMaisCaro = produto;
                }
            }
            System.out.println(this.estoqueProdutos.size() + " produtos no estoque.");
        } else {
            System.out.println("Estoque vazio!");
        }
        return produtoMaisCaro;
    }
}

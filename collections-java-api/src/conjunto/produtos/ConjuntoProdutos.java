package conjunto.produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoProdutos {
    private Set<Produto> produtoSet;

    public ConjuntoProdutos() {
        // A implementação HashSet da interface Set permite a inclusão de
        // itens indexados e únicos, que possibilita melhor desempenho nas buscas.
        // São inseridos aleatoriamente e sua ordem é mantida, não sendo possível
        // modificá-la.
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double valor, int quantidade) {
        this.produtoSet.add(new Produto(nome, codigo, valor, quantidade));
    }

    public void listarProdutos() {
        System.out.println(this.produtoSet);
    }

    public Set<Produto> ordenarPorNome() {
        // A única implementação da interface Set que ordena itens é o TreeSet,
        // que irá respeitar a ordem natural por nome definida com o Comparable.
        Set<Produto> produtosPorNome = new TreeSet<>(this.produtoSet);
        if (produtosPorNome.size() == 0) {
            System.out.println("Nenhum produto encontrado!");
        }
        return produtosPorNome;
    }

    public Set<Produto> ordenarProdutosPorValor() {
        // Quando passamos para o TreeSet uma classe que implementa um Comparator
        // precisamos usar o método .addAll() passando o Set completo de produtos
        // para ocorrer a ordenação definida em nossa implementação do Comparator
        Set<Produto> produtosPorValor = new TreeSet<>(new ComparatorPorValor());
        produtosPorValor.addAll(this.produtoSet);
        return produtosPorValor;
    }
}

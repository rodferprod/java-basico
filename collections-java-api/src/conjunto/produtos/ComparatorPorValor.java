package conjunto.produtos;

import java.util.Comparator;

public class ComparatorPorValor implements Comparator<Produto> {

    @Override
    public int compare(Produto produto1, Produto produto2) {
        return Double.compare(produto1.getValor(), produto2.getValor());
    }

}

package conjunto.produtos;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String nome;
    private long codigo;
    private double valor;
    private int quantidade;

    public Produto(String nome, long codigo, double valor, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public long getCodigo() {
        return codigo;
    }

    // É preciso localizar um produto pelo nome, logo precisamos implementar
    // a interface Comparable e sobrescrever o método .compareTo() com essa regra.
    // A classe String (nome) possui o método .compareToIgnoreCase() para nos
    // auxiliar.
    @Override
    public int compareTo(Produto produto) {
        return this.nome.compareToIgnoreCase(produto.nome);
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return this.codigo + "|" + this.nome + "|" + this.valor + "|" + this.quantidade;
    }

    // Precisamos sobrescrever o método equals() com regra a
    // específica para o atributo que deverá ser único em nosso Set
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Produto produto)) {
            return false;
        }
        return this.getCodigo() == produto.getCodigo();
    }

    // Sobrescrevendo o método hash() informando qual
    // atributo dessa classe deve ser considerado como único
    @Override
    public int hashCode() {
        return Objects.hash(this.getCodigo());
    }

}

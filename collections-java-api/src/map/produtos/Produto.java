package map.produtos;

public class Produto {
    private String nome;
    private double valor;
    private int quantidade;

    // Map trabalha com chaves únicas. Devido a essa característica
    // não precisamos sobrescrever os métodos .equals() e .hash()
    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return this.nome + "|" + this.valor + "|" + this.quantidade;
    }
}

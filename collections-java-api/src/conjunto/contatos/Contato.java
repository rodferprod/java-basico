package conjunto.contatos;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return this.nome + "|" + this.numero;
    }

    // Precisamos sobrescrever o método equals() com regra a
    // específica para o atributo que deverá ser único em nosso Set
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Contato contato)) {
            return false;
        }
        return Objects.equals(this.getNome(), contato.getNome());
    }

    // Sobrescrevendo o método hash() informando qual
    // atributo dessa classe deve ser considerado como único
    @Override
    public int hashCode() {
        return Objects.hash(this.getNome());
    }
}

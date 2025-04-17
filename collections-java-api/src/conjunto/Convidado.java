package conjunto;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    // Precisamos sobrescrever o método equals() com regra a
    // específica para o atributo que deverá ser único em nosso Set
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Convidado convidado)) {
            return false;
        }
        return this.getCodigoConvite() == convidado.getCodigoConvite();
    }

    // Sobrescrevendo o método hash() informando qual
    // atributo dessa classe deve ser considerado como único
    @Override
    public int hashCode() {
        return Objects.hash(this.getCodigoConvite());
    }

    @Override
    public String toString() {
        return this.nome + "|" + this.codigoConvite;
    }
}

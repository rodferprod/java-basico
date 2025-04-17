package conjunto;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        this.convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPeloCodigo(int codigoConvite) {
        Convidado convidadoRemover = null;
        if (this.convidadosSet.size() > 0) {
            for (Convidado convidado : this.convidadosSet) {
                if (convidado.getCodigoConvite() == codigoConvite) {
                    convidadoRemover = convidado;
                    break;
                }
            }
            if (convidadoRemover != null) {
                this.convidadosSet.remove(convidadoRemover);
                System.out.println("Convidado " + convidadoRemover.getNome() + " foi removido!");
            } else {
                System.out.println("Convite " + codigoConvite + " não foi localizado!");
            }
        }
    }

    public int contarConvidados() {
        return this.convidadosSet.size();
    }

    public void imprimirConvidados() {
        System.out.println(this.convidadosSet);
    }
}

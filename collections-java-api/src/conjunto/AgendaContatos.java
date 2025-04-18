package conjunto;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        this.contatoSet.add(new Contato(nome, numero));
    }

    public void imprimirContatos() {
        System.out.println(this.contatoSet);
    }

    public Set<Contato> pesquisarNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato : this.contatoSet) {
            if (contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }
        if (contatosPorNome.size() > 0) {
            System.out.println(contatosPorNome.size() + " contatos foram localizados!");
        } else {
            System.out.printf("Nenhum contato foi localizado com nome '%s'", nome);
        }
        return contatosPorNome;
    }

    public Contato atualizarContato(String nome, int numero) {
        Contato contatoAtualizado = null;
        for (Contato contato : this.contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatoAtualizado = contato;
                break;
            }
        }
        if (contatoAtualizado != null) {
            contatoAtualizado.setNumero(numero);
            System.out.println("Contato localizado e atualizado com sucesso!");
        } else {
            System.out.printf("Nenhum contato foi localizado com nome '%s'", nome);
        }
        return contatoAtualizado;
    }
}

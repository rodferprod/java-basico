package map.contatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    // A classe Map trabalha com pares Chave=Valor e já possui mecanismos
    // para assegurar que não haverá nenhum item repetido, pois a chave
    // (declarada aqui como uma String) sempre será única no conjunto.
    // Os valores serão classes do tipo Integer (OBS: Map não aceita tipos
    // primitivos)
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        // OBS: No Map, o método .put() é usado tanto para inserir
        // quanto para atualizar itens
        this.agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!this.agendaContatosMap.isEmpty()) {
            this.agendaContatosMap.remove(nome);
            System.out.println("Item removido com sucesso!");
        } else {
            System.out.println("A agenda de contatos está vazia!");
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numero = null;
        if (!this.agendaContatosMap.isEmpty()) {
            numero = this.agendaContatosMap.get(nome);
        }
        if (numero == null) {
            System.out.println("Contato não foi localizado!");
        }
        return numero;
    }

    public void listarContatos() {
        System.out.println(this.agendaContatosMap);
    }
}

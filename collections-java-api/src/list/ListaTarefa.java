package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    // O atributo listaTarefas do tipo List
    // irá armazenar instâncias da classe Tarefa
    private List<Tarefa> listaTarefas;

    // Construtor inicializando um ArrayList vazio
    public ListaTarefa() {
        this.listaTarefas = new ArrayList<>();
    }

    // Método que adiciona uma nova tarefa à lista
    public void adicionarTarefa(String descricao) {
        this.listaTarefas.add(new Tarefa(descricao));
    }

    // Método que remove tarefas da lista a partir da descrição
    public void removerTarefa(String descricao) {

        // Como podem existir itens repetidos vamos criar
        // uma lista para armazenar os itens a serem removidos
        List<Tarefa> tarefasRemover = new ArrayList<>();

        // Percorrendo a lista de tarefas para comparar a
        // descrição e reservar os itens que serão removidos
        for (Tarefa tarefa : this.listaTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(tarefa);
            }
        }

        if (tarefasRemover.size() > 0) {
            System.out.println("Itens localizados para remoção: " + tarefasRemover.size());

            // Usando o método removeAll fornecido pelo pacote List
            this.listaTarefas.removeAll(tarefasRemover);

            System.out.printf("Tarefa '%s' removida!\n", descricao);
        }
    }

    // Método para obter o número total de tarefas
    // com o método size() fornecido pelo pacote List
    public int contarTarefas() {
        return this.listaTarefas.size();
    }

    // Método para imprimir a descrição das tarefas da lista
    // .toString() foi sobrescrito na classe Tarefa para retornar
    // apenas a descrição de cada item sem o endereço de memória
    public void imprimirTarefas() {
        System.out.println(this.listaTarefas);
    }
}

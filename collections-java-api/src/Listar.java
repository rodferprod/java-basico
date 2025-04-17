import listar.ListaTarefa;

public class Listar {
    public static void main(String[] args) throws Exception {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Quantidade atual de tarefas: " + listaTarefa.contarTarefas());

        listaTarefa.adicionarTarefa("Tarefa 01");
        listaTarefa.adicionarTarefa("Tarefa 02");
        listaTarefa.adicionarTarefa("Tarefa 03");
        listaTarefa.adicionarTarefa("Tarefa 04");
        listaTarefa.adicionarTarefa("Tarefa 04");
        listaTarefa.adicionarTarefa("Tarefa 05");

        System.out.println("Quantidade atual de tarefas: " + listaTarefa.contarTarefas());

        listaTarefa.imprimirTarefas();

        listaTarefa.removerTarefa("tarefa 04");

        System.out.println("Quantidade atual de tarefas: " + listaTarefa.contarTarefas());

        listaTarefa.imprimirTarefas();

    }
}

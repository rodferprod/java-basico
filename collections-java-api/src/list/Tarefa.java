package list;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    // Sobrescrevendo o método .toString() para que este retorne
    // apenas a descrição da tarefa ao converter o objeto para string
    @Override
    public String toString() {
        return this.descricao;
    }
}

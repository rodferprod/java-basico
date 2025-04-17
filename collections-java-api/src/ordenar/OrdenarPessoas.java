package ordenar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarPessoas {
    private List<Pessoa> listaPessoas;

    public OrdenarPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    public List<Pessoa> getListaPessoas() {
        return this.listaPessoas;
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {

        // Iniciamos a lista com uma cópia da lista de pessoas existente
        List<Pessoa> listaPorIdade = new ArrayList<>(this.listaPessoas);

        // Com apenas um parâmetro, .sort() espera uma coleção de objetos que implemente
        // a interface Comparable, fornecendo o método .compareTo() com a regra de
        // ordenação
        Collections.sort(listaPorIdade);

        return listaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {

        // Iniciamos a lista com uma cópia da lista de pessoas existente
        List<Pessoa> listaPorAltura = new ArrayList<>(this.listaPessoas);

        // Com dois parâmetros, .sort() espera uma coleção de objetos que implemente
        // a interface Comparable, fornecendo o método .compareTo() com a regra de
        // ordenação e também uma classe que implemente a interface Comparator
        Collections.sort(listaPorAltura, new ComparatorPorAltura());

        return listaPorAltura;
    }
}

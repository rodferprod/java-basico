package ordenar;

import java.util.Comparator;

public class ComparatorPorAltura implements Comparator<Pessoa> {

    // Método de subscrição obrigatória vindo da
    // interface Comparator, que irá ordenar de forma
    // crescente os itens da classe Pessoa, a partir da altura
    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        // A classe Double possui o método compare() que vai determinar
        // qual número é maior ou menor dentre os parâmetros informados.
        //
        // OBS: Ela também implementa a interface Comparable,
        // permitindo a utilização de seus métodos em nossa implementação.
        return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
    }

}

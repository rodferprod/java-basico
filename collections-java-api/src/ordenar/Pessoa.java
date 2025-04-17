package ordenar;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Método de subscrição obrigatória vindo da
    // interface Comparable, que irá ordenar de forma
    // crescente os itens da classe Pessoa, a partir da idade
    @Override
    public int compareTo(Pessoa pessoa) {
        // A classe Integer possui o método compare() que vai determinar
        // qual número é maior ou menor dentre os parâmetros informados.
        //
        // OBS: Ela também implementa a interface Comparable,
        // permitindo a utilização de seus métodos em nossa implementação.
        return Integer.compare(this.idade, pessoa.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return this.nome + '|' + this.idade + '|' + this.altura;
    }

}

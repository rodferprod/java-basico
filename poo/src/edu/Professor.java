package edu;

public class Professor {
    private String nome;
    private String materia;

    // método construtor
    public Professor(String novoNome, String novaMateria) {
        this.nome = novoNome;
        this.materia = novaMateria;
    }

    public String getNome() {
        return nome;
    }

    public String getMateria() {
        return materia;
    }
}

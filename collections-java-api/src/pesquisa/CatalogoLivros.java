package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listLivros;

    public CatalogoLivros() {
        this.listLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.listLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    // Método que retorna uma lista de livros de um determinado autor
    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (checkItensLista()) {
            for (Livro livro : this.listLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
            if (livrosPorAutor.size() > 0) {
                System.out.printf(livrosPorAutor.size() + " livros de '%s' foram encontrados!\n", autor);
            } else {
                System.out.printf("Nenhum livro de '%s' foi encontrado!\n", autor);
            }
        }
        return livrosPorAutor;
    }

    // Método que retorna uma lista de livros entre dois anos
    public List<Livro> pesquisarLivrosEntreDoisAnos(int anoInicio, int anoFinal) {
        List<Livro> livrosEntreDoisAnos = new ArrayList<>();
        if (checkItensLista()) {
            for (Livro livro : this.listLivros) {
                if (livro.getAnoPublicacao() >= anoInicio && livro.getAnoPublicacao() <= anoFinal) {
                    livrosEntreDoisAnos.add(livro);
                }
            }
            if (livrosEntreDoisAnos.size() > 0) {
                System.out.printf(livrosEntreDoisAnos.size() + " livros entre %s e %s foram encontrados!\n", anoInicio,
                        anoFinal);
            } else {
                System.out.printf("Nenhum livro entre %s e %s foi encontrado!\n", anoInicio, anoFinal);
            }
        }
        return livrosEntreDoisAnos;
    }

    public Livro pesquisaLivroPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (checkItensLista()) {
            for (Livro livro : this.listLivros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
            if (livroPorTitulo != null) {
                System.out.printf("O livro '%s' foi encontrado!\n", livroPorTitulo);
            } else {
                System.out.printf("Nenhum livro com título '%s' foi encontrado!\n", livroPorTitulo);
            }
        }

        return livroPorTitulo;
    }

    private boolean checkItensLista() {
        if (this.listLivros.isEmpty()) {
            System.out.println("Lista de livros vazia!");
            return false;
        }
        return true;
    }
}

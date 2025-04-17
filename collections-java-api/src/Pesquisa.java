import pesquisa.CatalogoLivros;

public class Pesquisa {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 01", "Autor 01", 1975);
        catalogoLivros.adicionarLivro("Livro 02", "Autor 01", 1980);
        catalogoLivros.adicionarLivro("Livro 03", "Autor 02", 1985);
        catalogoLivros.adicionarLivro("Livro 04", "Autor 02", 2005);
        catalogoLivros.adicionarLivro("Livro 05", "Autor 03", 2015);
        catalogoLivros.adicionarLivro("Livro 06", "Autor 04", 1999);
        catalogoLivros.adicionarLivro("Livro 07", "Autor 04", 1965);
        catalogoLivros.adicionarLivro("Livro 08", "Autor 05", 2005);
        catalogoLivros.adicionarLivro("Livro 01", "Autor 06", 2020);

        System.out.println(
                catalogoLivros.pesquisaLivroPorTitulo("livro 03"));

        System.out.println(
                catalogoLivros.pesquisarLivrosPorAutor("autor 04"));

        System.out.println(
                catalogoLivros.pesquisarLivrosEntreDoisAnos(1960, 1980));
    }
}

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<Livro>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public List<Livro> listarLivros() {
        return livros;
    }

    public Livro pesquisarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public Livro pesquisarLivroPorAutor(String autor) {
        for (Livro livro : livros) {
            if (livro.getAutor().equals(autor)) {
                return livro;
            }
        }
        return null;
    }
}


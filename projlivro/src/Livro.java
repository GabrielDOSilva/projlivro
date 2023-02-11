public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int anoPublicacao;
    private int numeroPaginas;
    private double preco;

    // Construtor sem argumentos
    public Livro() {
    }

    // Construtor com argumentos
    public Livro(String titulo, String autor, String isbn, int anoPublicacao, int numeroPaginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
        this.preco = preco;
    }

    // Métodos de acesso aos atributos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas >= 0) {
            this.numeroPaginas = numeroPaginas;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    // Método toString para representação do objeto como uma string
    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", anoPublicacao=" + anoPublicacao
                + ", numeroPaginas=" + numeroPaginas + ", preco=" + preco + "]";
    }
}

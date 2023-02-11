public class TestarCatalogo {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        Livro livro1 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "123456789", 1943, 99, 19.99);
        Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien", "987654321", 1937, 295, 29.99);

        catalogo.adicionarLivro(livro1);
        catalogo.adicionarLivro(livro2);

        System.out.println("Livros no catálogo: " + catalogo.listarLivros().size());


        for (int i = 0; i < catalogo.listarLivros().size(); i++) {
            System.out.println(catalogo.listarLivros().get(i));
        }


        Livro livroEncontrado = catalogo.pesquisarLivroPorTitulo("O Pequeno Príncipe");
        System.out.println("Livro encontrado: " + livroEncontrado);

        catalogo.removerLivro(livro1);

        System.out.println("Livros no catálogo: " + catalogo.listarLivros().size());
        for (int i = 0; i < catalogo.listarLivros().size(); i++) {
            System.out.println(catalogo.listarLivros().get(i));
        }
    }
}
public class AplicacaoLivro {
    public static void main(String[] args){

        Livro livro1 = new Livro();

        System.out.println(
        "Título: " + livro1.titulo
        );

        System.out.println(
        "Ano: " + livro1.anoPublicacao
        );

        System.out.println(
        "Preço: " + livro1.preco
        );

      
        Livro livro2 =
        new Livro("1984","George Orwell");

      
        System.out.println(
        "Título: " + livro2.titulo
        );


        Livro livro3 =
        new Livro(
        "O Senhor dos Anéis",
        "J.R.R. Tolkien",
        1954,
        49.90
        );

        System.out.println(
        "Título: " + livro3.titulo
        );

    }

}

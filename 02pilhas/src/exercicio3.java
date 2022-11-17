public class exercicio3 {
  public static void main(String[] args) {

    Pilha<Livros> pilhaLivros = new Pilha<Livros>(20);

    Livros livro1 = new Livros();
    livro1.setNome("Livro - 1");
    livro1.setIsbn("#1");
    livro1.setAnoLancamento("1901");
    livro1.setAutor("Autor - 1");

    Livros livro2 = new Livros();
    livro2.setNome("Livro - 2");
    livro2.setIsbn("#2");
    livro2.setAnoLancamento("1902");
    livro2.setAutor("Autor - 2");

    Livros livro3 = new Livros();
    livro3.setNome("Livro - 3");
    livro3.setIsbn("#3");
    livro3.setAnoLancamento("1903");
    livro3.setAutor("Autor - 3");

    Livros livro4 = new Livros();
    livro4.setNome("Livro - 4");
    livro4.setIsbn("#4");
    livro4.setAnoLancamento("1904");
    livro4.setAutor("Autor - 4");

    Livros livro5 = new Livros();
    livro5.setNome("Livro - 5");
    livro5.setIsbn("#5");
    livro5.setAnoLancamento("1905");
    livro5.setAutor("Autor - 5");

    Livros livro6 = new Livros();
    livro6.setNome("Livro - 6");
    livro6.setIsbn("#6");
    livro6.setAnoLancamento("1906");
    livro6.setAutor("Autor - 6");

    System.out.println("Pilha de livros está criada, pilha vazia? " + pilhaLivros.estaVazia());

    System.out.print("Empilhando livros: ");

    pilhaLivros.empilhar(livro1);
    pilhaLivros.empilhar(livro2);
    pilhaLivros.empilhar(livro3);
    pilhaLivros.empilhar(livro4);
    pilhaLivros.empilhar(livro5);
    pilhaLivros.empilhar(livro6);

    System.out.println(pilhaLivros.tamanho() + " livros foram empilhados.");

    System.out.println("Desempilhando livros: ");
    while (!pilhaLivros.estaVazia()) {
      System.out.println("Livro " + pilhaLivros.desempilhar());
    }

    System.out.println("Todos os livros foram desempilhados. A pilha está vazia: " + pilhaLivros.estaVazia());

  }
}
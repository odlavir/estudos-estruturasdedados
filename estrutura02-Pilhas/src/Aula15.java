public class Aula15 {
  public static void main(String[] args) {

    Pilha<Integer> pilha = new Pilha<Integer>();

    System.out.println(pilha.estaVazia());

    pilha.empilhar(1);
    pilha.empilhar(3);
    pilha.empilhar(2);

    System.out.println(pilha.estaVazia());

  }
}
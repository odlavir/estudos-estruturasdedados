public class aula16 {
  public static void main(String[] args) {

    Pilha<Integer> pilha = new Pilha<Integer>();

    pilha.empilhar(1);
    pilha.empilhar(3);
    pilha.empilhar(2);
    pilha.empilhar(5);

    System.out.println(pilha.topo());
    System.out.println(pilha);
  }
}
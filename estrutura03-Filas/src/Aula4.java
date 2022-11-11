public class Aula4 {
  public static void main(String[] args) {

    Fila<Integer> fila = new Fila<>();

    fila.enfileirar(1);
    fila.enfileirar(2);
    fila.enfileirar(3);

    System.out.println("Fila está vazia: " + fila.estaVazia());
    System.out.println("Tamanho: " + fila.tamanho());
    System.out.println("Fila: " + fila);
    System.out.println("Primeiro item: " + fila.espiar());
    System.out.println("Excluido: " + fila.desenfileirar());
    System.out.println("Excluido: " + fila.desenfileirar());
    System.out.println("Excluido: " + fila.desenfileirar());
    System.out.println("Fila: " + fila);

  }
}
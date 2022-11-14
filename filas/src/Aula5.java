public class Aula5 {
  public static void main(String[] args) {

    FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();

    fila.enfileirar(1);
    fila.enfileirar(3);
    fila.enfileirar(2);

    System.out.println(fila); // 1 2 3 e não 1 3 2

  }
}
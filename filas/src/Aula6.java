import java.util.PriorityQueue;
import java.util.Queue;

public class Aula6 {
  public static void main(String[] args) {

    Queue<Integer> filaComPrioridade = new PriorityQueue<>();

    filaComPrioridade.add(2);
    filaComPrioridade.add(1);
    filaComPrioridade.add(5);

    System.out.println(filaComPrioridade);

  }
}
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class exercicio04_batataQuente {
  public static void main(String[] args) {

    Queue<Integer> fila = new LinkedList<>();

    for (int i = 0; i < 10; i++) {
      fila.add(i);
    }

    Random aleatorio = new Random();
    int num = 0;
    while (num == 0) {
      num = aleatorio.nextInt(10);
    }

    System.out.println("Número = " + num);

    while (fila.size() > 1) {
      for (int i = 0; i < num; i++) {
        fila.add(fila.remove());
      }
      System.out.println("Eliminado = " + fila.remove());
    }

    System.out.println("Ganhador: " + fila.remove());

  }
}
import java.util.Queue;

public class PSAtendimento implements Runnable{

  private Queue<Pessoa> fila;

  public PSAtendimento(Queue<Pessoa> fila) {
    super();
    this.fila = fila;
  }

  @Override
  public void run() {

    while (!this.fila.isEmpty()) {
      try {
        System.out.println(fila.remove() + " foi atendida.");
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("Atendimento finalizado.");

  }
}

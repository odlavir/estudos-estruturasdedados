import java.util.Queue;
import java.util.Random;

public class PSNovosAtendimentos implements Runnable{

  private int cont = 7;
  private Queue<Pessoa> fila;
  private Random prioridade = new Random();

  public PSNovosAtendimentos(Queue<Pessoa> fila) {
    super();
    this.fila = fila;
  }

  @Override
  public void run() {

    for (int i = 0; i < 8; i++) {
      try {
        Thread.sleep(800);
        Pessoa p = new Pessoa("" + cont, prioridade.nextInt(3));
        fila.add(p);
        cont++;
        System.out.println(p + " foi inserida no atendimento.");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

  }
}

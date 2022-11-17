import java.util.PriorityQueue;
import java.util.Queue;

public class exercicio03_prontoSocorro {

  final static int VERDE = 2;
  final static int AMARELO = 1;
  final static int VERMELHO = 0;

  public static void main(String[] args) {

    Queue<Pessoa> fila = new PriorityQueue<>();

    fila.add(new Pessoa("1", VERDE));
    fila.add(new Pessoa("2", AMARELO));
    fila.add(new Pessoa("3", VERMELHO));
    fila.add(new Pessoa("4", VERDE));
    fila.add(new Pessoa("5", VERDE));
    fila.add(new Pessoa("6", VERMELHO));

    PSAtendimento atendida = new PSAtendimento(fila);
    PSNovosAtendimentos novoAtendimento = new PSNovosAtendimentos(fila);

    Thread t1 = new Thread(atendida);
    Thread t2 = new Thread(novoAtendimento);

    t1.start();
    t2.start();

  }
}
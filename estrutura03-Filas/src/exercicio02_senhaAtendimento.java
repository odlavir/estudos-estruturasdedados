import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class exercicio02_senhaAtendimento {
  public static void main(String[] args) {

    Queue<String> regular = new LinkedList<>();
    Queue<String> prioritaria = new PriorityQueue<>();
    final int MAX_PRIORITY = 3;

    regular.add("Pessoa - 1");
    prioritaria.add("--- Pessoa - 1P");
    prioritaria.add("--- Pessoa - 2P");
    prioritaria.add("--- Pessoa - 3P");
    prioritaria.add("--- Pessoa - 4P");
    regular.add("Pessoa - 2");
    regular.add("Pessoa - 3");
    prioritaria.add("--- Pessoa - 5P");
    prioritaria.add("--- Pessoa - 6P");
    regular.add("Pessoa - 4");
    prioritaria.add("--- Pessoa - 7P");
    regular.add("Pessoa - 5");
    regular.add("Pessoa - 6");
    prioritaria.add("--- Pessoa - 8P");
    prioritaria.add("--- Pessoa - 9P");
    prioritaria.add("--- Pessoa - 10P");
    regular.add("Pessoa - 7");
    regular.add("Pessoa - 8");
    regular.add("Pessoa - 9");
    prioritaria.add("--- Pessoa - 11P");

    while (!regular.isEmpty() || !prioritaria.isEmpty()) {

      int cont = 0;

      while (!prioritaria.isEmpty() && cont < MAX_PRIORITY) {
        atenderPessoa(prioritaria);
        cont++;
      }

      if (!regular.isEmpty()) {
        atenderPessoa(regular);
      }

      if (prioritaria.isEmpty()) {
        while (!regular.isEmpty()) {
          atenderPessoa(regular);
        }
      }
    }

  }

  public static void atenderPessoa(Queue<String> fila) {
    String pessoaAtendida = fila.remove();
    System.out.println(pessoaAtendida + " foi atendida.");
  }
}
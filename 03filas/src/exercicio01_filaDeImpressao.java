import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class exercicio01_filaDeImpressao {
  public static void main(String[] args) {

    Queue<Documento> documentos = new LinkedList<>() {
    };

    documentos.add(new Documento("A", 30));
    documentos.add(new Documento("B", 60));

    while (!documentos.isEmpty()) {
      Documento doc = documentos.remove();
      System.out.println("Imprimindo documento: " + doc.getNome());
      System.out.println("----------------------------");
      try {
        Thread.sleep(20 * doc.getQuantidadeFolhas());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("Lista esvaziou: " + documentos.isEmpty());

  }
}
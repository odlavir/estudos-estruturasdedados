public class Main {
  public static void main(String[] args) {

    Vetor vetor = new Vetor(2);

//    try {
//      vetor.adiciona("elemento - 1");
//      vetor.adiciona("elemento - 2");
//      vetor.adiciona("elemento - 3");
//    } catch (Exception e) {
//      e.printStackTrace();
//    }

    vetor.adiciona("elemento - B");
    vetor.adiciona("elemento - C");
    vetor.adiciona("elemento - E");
    vetor.adiciona("elemento - F");
//    vetor.adiciona("elemento - G");

//    System.out.println(vetor.getTamanho());
    System.out.println(vetor.toString());

//    System.out.println(vetor.busca(1));
//    System.out.println(vetor.busca("elemento - 1"));

//    vetor.adiciona(0, "elemento - A");
//    vetor.adiciona(4, "elemento - D");
//    System.out.println(vetor.toString());

    vetor.remove(1);
    System.out.println(vetor.toString());

    VetorObject vetor_ = new VetorObject(3);

    Contato c1 = new Contato("Contato 1", "123-321", "contato1@hotmail.com");
    Contato c2 = new Contato("Contato 2", "3213-1231", "contato2@hotmail.com");
    Contato c3 = new Contato("Contato 3", "4313-123213", "contato3@hotmail.com");

    vetor_.adiciona(c1);
    vetor_.adiciona(c2);
    vetor_.adiciona(c3);

    System.out.println(vetor_.toString());

  }
}
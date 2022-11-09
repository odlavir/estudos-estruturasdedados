public class Main2 {
  public static void main(String[] args) {

    Lista<Contato> vetor = new Lista<Contato>(1);

//    vetor.adiciona("Elemento");
    vetor.adiciona(new Contato());

    System.out.println(vetor);

  }
}
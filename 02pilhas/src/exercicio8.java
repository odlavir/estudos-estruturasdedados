import java.util.Stack;

public class exercicio8 {

  public static void main(String[] args) {


    Stack<Integer> original = new Stack<>();
    Stack<Integer> dest = new Stack<>();
    Stack<Integer> aux = new Stack<>();

    tamanhoPilha(original, 3);
    torreDeHanoi(original.size(), original, dest, aux);
  }

  public static void tamanhoPilha(Stack<Integer> original, int tamanho) {
    for (int i = tamanho;  i > 0; i --) {
      original.push(i);
    }
  }

  public static void torreDeHanoi(
          int n, Stack<Integer> original,
          Stack<Integer> dest, Stack<Integer> aux) {

    if (n > 0) {
      torreDeHanoi(n - 1, original, aux, dest);
      dest.push(original.pop());
      System.out.println("----------------------------------");

      System.out.println("Original " + original);
      System.out.println("Destino " + dest);
      System.out.println("Auxiliar " + aux);

      torreDeHanoi(n - 1, aux, dest, original);
    }
  }
}
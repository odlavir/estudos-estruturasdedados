import java.util.Scanner;
import java.util.Stack;

public class exercicio1 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int number = 0;

    Stack<Integer> pilhaTest = new Stack<Integer>();

    for (int i = 1; i <= 10; i++) {
      System.out.print("Digite o " + i + " número: ");
      number = scan.nextInt();
      scan.nextLine();

      if(number % 2 == 0) {
        pilhaTest.push(number);
      } else {
        testeVazia(pilhaTest);
      }
    }

    System.out.println();
    System.out.println(pilhaTest);
    System.out.println(pilhaTest.size());
    System.out.println();

    while (!pilhaTest.isEmpty()) {
      System.out.println(pilhaTest.pop());
    }

  }

  private static void testeVazia(Stack<Integer> pilhaTest) {
    if(pilhaTest.isEmpty()) {
      System.out.println("A pilha está vazia.");
    } else {
      pilhaTest.pop();
    }
  }


}
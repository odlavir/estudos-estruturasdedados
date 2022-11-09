import java.util.Scanner;
import java.util.Stack;

public class exercicio2 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int number = 0;

    Stack<Integer> par = new Stack<Integer>();
    Stack<Integer> impar = new Stack<Integer>();

    for (int i = 1; i <= 10; i++) {
      System.out.print("Digite o " + i + " número: ");
      number = scan.nextInt();
      scan.nextLine();

      if(number % 2 == 0 && number != 0) {
        par.push(number);
      } else if (number % 2 != 0 && number != 0) {
        impar.push(number);
      } else if (number == 0){
        testeVazia(par, impar);
      }
    }

    System.out.println();
    System.out.println("Lista par - " + par);
    System.out.println("Lista impar - " + impar);
    System.out.println();

    while (!par.isEmpty()) {
      System.out.println("Par: " + par.pop());
    }

    System.out.println();

    while (!impar.isEmpty()) {
      System.out.println("Impar: " + impar.pop());
    }

  }

  private static void testeVazia(Stack<Integer> par, Stack<Integer> impar) {
    if(par.isEmpty()) {
      System.out.println("A pilha par está vazia.");
    } else {
      par.pop();
    }

    if(impar.isEmpty()) {
      System.out.println("A pilha impar está vazia.");
    } else {
      impar.pop();
    }
  }


}
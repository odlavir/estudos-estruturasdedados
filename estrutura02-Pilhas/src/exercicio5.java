import java.util.Scanner;
import java.util.Stack;

public class exercicio5 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Digite uma palavra para o teste: ");
    String palavra = scan.nextLine();

    imprimirResultado(palavra);
  }

  public static boolean testaPalindromo(String palavra) {

    Stack<Character> pilha = new Stack<>();

    for (int i = 0; i < palavra.length(); i++) {
      pilha.push(palavra.charAt(i));
    }

    String palavraInversa = "";
    while (!pilha.isEmpty()) {
      palavraInversa += pilha.pop();
    }

    if (palavra.equalsIgnoreCase(palavraInversa)) {
      return true;
    } else {
      return false;
    }
  }

  public static void imprimirResultado(String palavra) {

    System.out.println("A palavra é palindroma? R: " + testaPalindromo(palavra));
  }
}
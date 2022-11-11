import java.util.Stack;

public class exercicio7 {
  public static void main(String[] args) {

  imprimeResultadoQualquerBase(689, 8);
  imprimeResultadoQualquerBase(25, 16);
  imprimeResultadoBinario(689);

  }

  public static String decimalBinario(int numero) {

    Stack<Integer> pilha = new Stack<>();
    String pilhaInversa = "";
    int resto = 0;

    while (!(numero == 0)) {
      resto = numero % 2;
      pilha.push(resto);
      numero = numero / 2;
    }

    while (!pilha.isEmpty()) {
      pilhaInversa += pilha.pop();
    }

    return pilhaInversa;
  }

  public static String decimalQualquerBase(int numero, int base) {

    if (base > 16) {
      throw new IllegalArgumentException();
    }

    Stack<Integer> pilha = new Stack<>();
    String numBase = "";
    int resto = 0;
    String bases = "0123456789ABCDEF";

    while (!(numero == 0)) {
      resto = numero % base;
      pilha.push(resto);
      numero = numero / base;
    }

    while (!pilha.isEmpty()) {
      numBase += bases.charAt(pilha.pop());
    }

    return numBase;
  }

  public static void imprimeResultadoBinario(int numero) {
    String resultado = decimalBinario(numero);
    System.out.println("O número " + numero + " em decimal fica: " + resultado);
  }

  public static void imprimeResultadoQualquerBase(int numero, int base) {
    String resultado = decimalQualquerBase(numero, base);
    System.out.println("O número " + numero + " na base " + base + " fica: " + resultado);
  }
}
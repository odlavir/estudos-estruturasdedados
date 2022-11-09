import java.lang.reflect.Array;
import java.util.Arrays;

public class Lista<T> {

  private T[] elementos;
  private int tamanho;

  public Lista(int capacidade) {
    this.elementos = (T[]) new Object[capacidade];
    this.tamanho = 0;
  }

  public Lista(int capacidade, Class<T> tipoClasse) {
    this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
    this.tamanho = 0;
  }

  public boolean adiciona(T elemento) {

    this.aumentaCapacidade();
    if (this.tamanho < this.elementos.length) {
      this.elementos[this.tamanho] = elemento;
      this.tamanho++;
      return true;
    }
    return false;
  }

  public boolean adiciona(int posicao, T elemento) {

    if (!(posicao >= 0 && posicao < this.tamanho)) {
      throw new IllegalArgumentException("Posição inválida.");
    }

    this.aumentaCapacidade();

    for (int i = this.tamanho - 1; i >= posicao; i--) {
      this.elementos[i+1] = this.elementos[i];
    }
    this.elementos[posicao] = elemento;
    this.tamanho++;

    return true;
  }

  public int getTamanho() {
    return tamanho;
  }

  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("[");

    for (int i = 0; i < this.tamanho - 1; i ++) {
      s.append(this.elementos[i]);
      s.append(", ");
    }

    if (this.tamanho > 0) {
      s.append(this.elementos[tamanho - 1]);
    }

    s.append("]");
    return s.toString();
  }

  private void aumentaCapacidade() {
    if (this.tamanho == this.elementos.length) {
      T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
      for (int i = 0; i < this.elementos.length; i++) {
        elementosNovos[i] = this.elementos[i];
      }
      this.elementos = elementosNovos;
    }
  }

  public T busca(int posicao) {
    if (!(posicao >= 0 && posicao < this.tamanho)) {
      throw new IllegalArgumentException("Posição inválida.");
    } else {
      return this.elementos[posicao];
    }
  }

  public int busca(T elemento) {
    for (int i = 0; i < this.tamanho; i ++) {
      if (this.elementos[i].equals(elemento)) {
        return i;
      }
    }
    return -1;
  }

  public void remove(int posicao) {
    if (!(posicao >= 0 && posicao < this.tamanho)) {
      throw new IllegalArgumentException("Posição inválida.");
    }

    for (int i = posicao; i < this.tamanho - 1; i++) {
      this.elementos[i]= this.elementos[i+1];
    }
    this.tamanho--;
  }
}
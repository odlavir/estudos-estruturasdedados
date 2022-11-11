public class Fila<T> extends EstruturaEstatica<T> {

  public Fila(int capacidade) {
    super(capacidade);
  }

  public Fila() {
    super();
  }

  public void enfileirar(T elemento) {
    aumentarCapacidade();
    this.elementos[this.tamanho++] = elemento;
  }

  public T espiar() {
    if (this.estaVazia()) {
      return null;
    } else {
      return this.elementos[0];
    }
  }

  public T desenfileirar() {
    final int POS = 0;

    if (this.estaVazia()) {
      return null;
    } else {
      T elementoExcluido = this.elementos[POS];

      this.remove(POS);

      return elementoExcluido;
    }
  }

  public void aumentarCapacidade() {
    if (this.tamanho == this.elementos.length) {
      T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
      for (int i = 0; i < this.elementos.length; i++) {
        elementosNovos[i] = this.elementos[i];
      }
      this.elementos = elementosNovos;
    }
  }
}

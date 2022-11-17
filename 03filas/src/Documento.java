public class Documento {

  private String nome;
  private int quantidadeFolhas;

  public Documento(String nome, int quantidadeFolhas) {
    this.nome = nome;
    this.quantidadeFolhas = quantidadeFolhas;
  }

  public Documento() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getQuantidadeFolhas() {
    return quantidadeFolhas;
  }

  public void setQuantidadeFolhas(int quantidadeFolhas) {
    this.quantidadeFolhas = quantidadeFolhas;
  }

}

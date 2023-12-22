import java.time.LocalDate;

public class Dado {
  private int identificador;
  private double valor;
  private String categoria;
  private LocalDate data;

  public Dado(int identificador, double valor, String categoria, LocalDate data) {
    this.identificador = identificador;
    this.valor = valor;
    this.categoria = categoria;
    this.data = data;
  }

  public int getIdentificador() {
    return identificador;
  }

  public void setIdentificador(int identificador) {
    this.identificador = identificador;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Dado{" +
        "identificador=" + identificador +
        ", valor=" + valor +
        ", categoria='" + categoria + '\'' +
        ", data=" + data +
        '}';
  }
}
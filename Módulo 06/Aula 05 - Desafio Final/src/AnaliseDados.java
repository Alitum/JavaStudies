import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class AnaliseDados {
  private List<Dado> dados;

  public AnaliseDados(List<Dado> dados) {
    this.dados = dados;
  }

  public List<Dado> filtrarPorCategoria(String categoria) {
    return dados.stream()
        .filter(dado -> dado.getCategoria().equals(categoria))
        .collect(Collectors.toList());
  }

  public double calcularSomaDosValores(String categoria) {
    return dados.stream()
        .filter(dado -> dado.getCategoria().equals(categoria))
        .mapToDouble(Dado::getValor)
        .sum();
  }

  public Optional<Dado> encontrarValorMaximo() {
    return dados.stream()
        .max(Comparator.comparingDouble(Dado::getValor));
  }

  public Map<String, List<Dado>> agruparPorCategoria() {
    return dados.stream()
        .collect(Collectors.groupingBy(Dado::getCategoria));
  }

  public List<Dado> ordenarPorValorEData() {
    return dados.stream()
        .sorted(Comparator.comparingDouble(Dado::getValor)
            .thenComparing(Dado::getData))
        .collect(Collectors.toList());
  }
}

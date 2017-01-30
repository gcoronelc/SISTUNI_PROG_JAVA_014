package pe.egcc.ventaapp.dto;

/**
 *
 * @author Gustavo Coronel
 */
public class ItemDto {

  private String concepto;
  private double valor;

  public ItemDto() {
  }

  public ItemDto(String concepto, double valor) {
    this.concepto = concepto;
    this.valor = valor;
  }

  public String getConcepto() {
    return concepto;
  }

  public void setConcepto(String concepto) {
    this.concepto = concepto;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  @Override
  public String toString() {
    String texto = concepto + "\t" + valor;
    return texto;
  }

}

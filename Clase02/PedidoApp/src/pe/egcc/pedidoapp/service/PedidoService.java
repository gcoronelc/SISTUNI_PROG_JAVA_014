package pe.egcc.pedidoapp.service;

/**
 * Componente de servicios.
 * 
 * @author Gustavo Coronel
 */
public class PedidoService {
  
  /**
   * Este servicio permite calcular el impuesto.
   * 
   * @param importe Importe del pedido.
   * @return Retorna el impuesto.
   */
  public double calcularImpuesto(double importe){
    double impuesto;
    impuesto = importe * 0.18;
    return impuesto;
  }
  
  /**
   * Este servicio permite calcular el total del pedido.
   * 
   * @param importe Importe del pedido.
   * @return Retorna el total del pedido.
   */
  public double calcularTotal(double importe){
    double total;
    total = importe + calcularImpuesto(importe);
    return total;
  }
  
  
  
  
}

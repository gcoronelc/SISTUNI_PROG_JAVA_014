package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.dto.ItemDto;

/**
 *
 * @author Gustavo Coronel
 */
public abstract class CompAbstract {
  
  protected static double IGV = 0.18;
  protected static double SERVICIO = 0.10;
  
  public abstract ItemDto[] procesar(double total);
  
  
  protected double redondear(double valor){
    valor = Math.round(valor * 100.0);
    valor /= 100;
    return valor;
  }
}

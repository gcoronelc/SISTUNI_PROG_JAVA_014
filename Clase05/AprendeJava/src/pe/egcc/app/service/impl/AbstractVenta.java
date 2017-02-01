package pe.egcc.app.service.impl;

/**
 *
 * @author Gustavo Coronel
 */
public abstract class AbstractVenta {

  protected final double IGV = 0.18;
  
  public double redondeo(double valor){
    valor = Math.round( valor * 100.0 );
    valor = valor / 100.0;
    return valor;
  }
  
}

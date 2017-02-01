package pe.egcc.app.service.impl;

import pe.egcc.app.service.spec.MateSpec;
import pe.egcc.app.service.spec.VentaSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class VentaImpl extends AbstractVenta
  implements VentaSpec, MateSpec{

  @Override
  public double calcTotal(double precio, int cant) {
    double total = redondeo(precio * cant);
    return total;
  }

  @Override
  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }
  
  
  
}

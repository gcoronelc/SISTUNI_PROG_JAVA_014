package pe.egcc.app.prueba;

import pe.egcc.app.service.impl.AbstractVenta;
import pe.egcc.app.service.impl.VentaImpl;
import pe.egcc.app.service.spec.MateSpec;
import pe.egcc.app.service.spec.VentaSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    VentaImpl bean = new VentaImpl();
    System.out.println("Venta: " + bean.calcTotal(100.0, 5));
    System.out.println("Suma: " + bean.sumar(100, 500));
    System.out.println("Redondeo: " + bean.redondeo(1678.87123));
  }
  
}

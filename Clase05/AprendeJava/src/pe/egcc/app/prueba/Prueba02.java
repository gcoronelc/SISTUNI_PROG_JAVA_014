package pe.egcc.app.prueba;

import pe.egcc.app.service.impl.AbstractVenta;
import pe.egcc.app.service.impl.VentaImpl;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    
    VentaImpl bean = new VentaImpl();
    
    AbstractVenta o1 = bean; // UpCasting
    
    VentaImpl o2 = (VentaImpl) o1; // DownCasting
    
    VentaImpl o3 = o2;
    
  }
  
}

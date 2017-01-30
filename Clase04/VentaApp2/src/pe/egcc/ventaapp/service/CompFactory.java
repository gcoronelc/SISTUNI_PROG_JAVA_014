package pe.egcc.ventaapp.service;

/**
 *
 * @author Gustavo Coronel
 */
public final class CompFactory {

  private CompFactory() {
  }

  // Tipos de comprobante
  public static final String COMP_FACTURA = "Factura";
  public static final String COMP_BOLETA = "Boleta";
  
  public static CompAbstract getComp(String tipo){
    CompAbstract bean = null;
    switch(tipo){
      case COMP_FACTURA:
        bean = new FacturaService();
        break;
      case COMP_BOLETA:
        bean = new BoletaService();
        break;
    }
    return bean;
  }
  
}

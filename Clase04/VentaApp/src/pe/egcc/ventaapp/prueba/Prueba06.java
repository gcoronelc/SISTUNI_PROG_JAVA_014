package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.dto.ItemDto;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba06 {

  public static void main(String[] args) {
    // Dato
    double total = 1768.56;
    // Proceso
    CompAbstract service = CompFactory.getComp(CompFactory.COMP_FACTURA);
    ItemDto[] repo = service.procesar(total);
    // Reporte
    for (ItemDto dto : repo) {
      System.out.println(dto.toString());
    }
    
  }
  
}

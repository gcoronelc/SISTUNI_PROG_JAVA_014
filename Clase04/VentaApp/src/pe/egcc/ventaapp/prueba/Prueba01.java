package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.dto.ItemDto;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.FacturaService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    // Dato
    double total = 1000.0;
    // Proceso
    CompAbstract service = new FacturaService();
    ItemDto[] repo = service.procesar(total);
    // Reporte
    for (ItemDto dto : repo) {
      System.out.println(dto.toString());
    }
    
    
  }
  
}


package pe.egcc.ventaapp.controller;

import pe.egcc.ventaapp.dto.ItemDto;
import pe.egcc.ventaapp.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 */
public class VentaController {
  
  public String[] getTipos(){
    String[] tipos = {
      CompFactory.COMP_FACTURA,
      CompFactory.COMP_BOLETA
    };
    return tipos;
  }

  public ItemDto[] procesar(String tipo, double total) {
    return CompFactory.getComp(tipo).procesar(total);
  }
}

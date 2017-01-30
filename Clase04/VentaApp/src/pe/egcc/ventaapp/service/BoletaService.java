package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.dto.ItemDto;

/**
 *
 * @author Gustavo Coronel
 */
public class BoletaService extends CompAbstract{

  @Override
  public ItemDto[] procesar(double total) {
    // Variables
    double servicio, totalGeneral;
    // Proceso
    servicio = total * SERVICIO;
    totalGeneral = total + servicio;
    // Reporte
    ItemDto[] repo = {
      new ItemDto("Total", total),
      new ItemDto("Servicio", servicio),
      new ItemDto("Total General", totalGeneral)
    };
    return repo;
  }
  
}

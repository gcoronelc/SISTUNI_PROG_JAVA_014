package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.dto.ItemDto;

/**
 *
 * @author Gustavo Coronel
 */
public class FacturaService  extends CompAbstract{

  @Override
  public ItemDto[] procesar(double total) {
    // Variables
    double consumo, impuesto, servicio, totalGeneral;
    // Proceso
    consumo = redondear(total / (1 + IGV));
    impuesto = redondear( total - consumo );
    servicio = redondear(total * SERVICIO);
    totalGeneral = redondear( total + servicio);
    // Reporte
    ItemDto[] repo = {
      new ItemDto("Consumo", consumo),
      new ItemDto("Impuesto", impuesto),
      new ItemDto("Total", total),
      new ItemDto("Servicio", servicio),
      new ItemDto("Total General", totalGeneral)
    };
    return repo;
  }
  
}

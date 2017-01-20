package pe.egcc.prestamoapp.prueba;

import pe.egcc.prestamoapp.service.PrestamoService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    double capital = 1000.0;
    double interes = 0.10;
    int n = 2;
    // Proceso
    PrestamoService service;
    service = new PrestamoService();
    double importe = service.obtenerImporte(capital, interes, n);
    // Reporte
    System.out.println("Capital: " + capital);
    System.out.println("Interes: " + interes);
    System.out.println("Periodos: " + n);
    System.out.println("Importe: " + importe);
  }
  
}

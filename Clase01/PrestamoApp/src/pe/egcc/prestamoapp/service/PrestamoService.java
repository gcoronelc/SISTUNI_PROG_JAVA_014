package pe.egcc.prestamoapp.service;

/**
 *
 * @author Gustavo Coronel
 */
public class PrestamoService {
  
  public double obtenerImporte
        (double capital, double interes, int n){
    double importe;
    importe = capital * Math.pow(1 + interes, n); 
    return redondear(importe);      
  }

  private double redondear(double importe) {
    importe = Math.rint(importe * 100.0) / 100.0;
    return importe;
  }
  
}

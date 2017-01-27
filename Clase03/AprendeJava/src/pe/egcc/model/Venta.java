package pe.egcc.model;

/**
 *
 * @author Gustavo Coronel
 */
public class Venta {
  
  /**
   * Variable de Clase
   */
  public static double igv;
  
  /**
   * Variables de instancia
   */
  public String cliente;
  public double importe;
   

  /**
   * Inicializador estático.
   * Para inicializar las variables de clase.
   */
  static {
    igv = 0.18;
  }
  
}

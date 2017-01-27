package pe.egcc.prueba;

import pe.egcc.model.Venta;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    
    System.out.println("IGV: " + Venta.igv);
    Venta.igv = 0.15;
    
    Venta obj1 = new Venta();
    obj1.cliente = "Gustavo";
    obj1.importe = 5000.0;
    obj1.igv = 0.20;
    
    Venta obj2 = new Venta();
    obj2.cliente = "Claudia";
    obj2.importe = 8000.0;
    obj2.igv = 0.30;
    
    mostrar(obj1);
    mostrar(obj2);
    
  }

  private static void mostrar(Venta v) {
    System.out.println("-------------------------------");
    System.out.println("Cliente: " + v.cliente);
    System.out.println("Importe: " + v.importe);
    System.out.println("IGV: " + v.igv);
  }
  
}

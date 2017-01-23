package pe.egcc.app.prueba;

import pe.egcc.app.model.Producto;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    
    Producto prod = new Producto();
    
    mostrar(prod);
    
    prod.setNombre("Coca Cola");
    prod.setPrecio(4.5);
    prod.setStock(100);
    prod.setActivo(true);
    
    mostrar(prod);
    
  }

  private static void mostrar(Producto p) {
    System.out.println("-----------------------");
    System.out.println("Nombre: " + p.getNombre());
    System.out.println("Precio: " + p.getPrecio());
    System.out.println("Stock: " + p.getStock());
    System.out.println("Activo: " + p.isActivo());
  }
  
}

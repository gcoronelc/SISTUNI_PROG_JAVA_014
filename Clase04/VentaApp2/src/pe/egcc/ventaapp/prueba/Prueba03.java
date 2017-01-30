package pe.egcc.ventaapp.prueba;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {

  public static void main(String[] args) {

    String[] productos = new String[5];

    productos[0] = "Aaaaa";
    productos[1] = "Bbbbb";
    productos[2] = "Ccccc";
    productos[3] = "Ddddd";
    productos[4] = "Eeeee";

    
    // Recorrido indexado
    for (int i = 0; i < productos.length; i++) {
      String producto = productos[i];
      System.out.println(producto);
    }
    
  }
  
}

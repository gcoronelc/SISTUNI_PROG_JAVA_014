package pe.egcc.ventaapp.prueba;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {

  public static void main(String[] args) {

    String[] productos = {"Aaaaa","Bbbbb","Ccccc","Ddddd","Eeeee"};

    // Redefiniendo el arreglo.
    // En realidad la variable productos esta apuntando a otro objeto.
    productos = new String[]{"cccc","ttttt","sssss","dddd","gggggg","sssss","aaaaa"};
    
    // Recorrido tipo colección: for each
    for (String producto : productos) {
      System.out.println(producto);
    }
    
  }
  
}

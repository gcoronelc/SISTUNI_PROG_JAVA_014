package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {

  public static void main(String[] args) {
    
    List<String> lista = new ArrayList<>();
    
    lista.add("Gustavo");
    lista.add("Claudia");
    lista.add("Alejandra");
    lista.add("Carlos");
    lista.add("Karla");
    lista.add("Maribel");
    lista.add("Marco");
    
    System.out.println("Recorrido indexado");
    System.out.println("--------------------");
    for (int i = 0; i < lista.size(); i++) {
      System.out.println(lista.get(i));
    }
    System.out.println("");
    
    lista.add(2, "Gianfranco");
    System.out.println("Recorrido tipo colección");
    System.out.println("--------------------");
    for (String texto: lista) {
      System.out.println(texto);
    }
    System.out.println("");
    
    lista.remove(4);
    System.out.println("Recorrido usando lambda");
    System.out.println("-----------------------");
    lista.stream().forEach(texto -> System.out.println(texto) );
    
    
  }
  
  
}

   

package pe.egcc.app.prueba;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {

  public static void main(String[] args) {
    
    Set<String> conjunto = new HashSet<>();
    
    conjunto.add("Edwin");
    conjunto.add("Karla");
    conjunto.add("Gianfranco");
    conjunto.add("Guisela");
    conjunto.add("Susy");
    conjunto.add("Jordan");
    
    for(String s: conjunto){
      System.out.println(s);
    }
    
  }
  
}

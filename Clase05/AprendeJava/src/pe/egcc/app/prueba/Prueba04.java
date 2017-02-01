package pe.egcc.app.prueba;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {

  public static void main(String[] args) {
    
    Map<String,Object> prod = new HashMap<>();
    
    prod.put("nombre", "Coca Cola");
    prod.put("precio", 3.5);
    prod.put("stock", 100);
    prod.put("activo", true);
    
    for(String key: prod.keySet()){
      System.out.println(key + " ==> " + prod.get(key));
    }
    
    
  }
  
}

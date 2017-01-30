package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase1;
import pe.egcc.app.service.Clase2;
import pe.egcc.app.service.Clase3;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {

  public static void main(String[] args) {
    
    Clase2 bean = new Clase2();
    
    Clase1 obj1 = bean;
    System.out.println("8 + 5 = " + obj1.sumar(8, 5));
    
    if( bean instanceof Clase3){
      Clase3 obj2 = (Clase3) bean;
      System.out.println("8 + 5 = " + obj2.sumar(8, 5));
    } else {
      System.err.println("El bean no es compatible con Clase3.");
    }
    
  }
  
}

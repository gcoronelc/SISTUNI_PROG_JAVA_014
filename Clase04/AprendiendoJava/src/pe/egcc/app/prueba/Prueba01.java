package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase1;
import pe.egcc.app.service.Clase4;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    Clase1 bean = new Clase4();
    
    System.out.println("5 + 7 = " + bean.sumar(5, 7));
    
    // No reconoce el metodo multiplicar por que 
    // no esta definido en Clase1
    //System.out.println("5 * 7 = " + bean.multiplicar(5, 7));
    
  }
  
}

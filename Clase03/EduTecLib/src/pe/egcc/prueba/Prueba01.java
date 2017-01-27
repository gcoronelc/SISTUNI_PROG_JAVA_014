package pe.egcc.prueba;

import pe.egcc.lib.Mate;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    Mate mate = new Mate();
    System.out.println("P = " + mate.promediar(15, 17));
    System.out.println("P = " + mate.promediar(15, 17, 19));
    System.out.println("P = " + mate.promediar(15, 17, 13, 15));
    System.out.println("P = " + mate.promediar(13,15, 17, 19, 12));
  }
  
}

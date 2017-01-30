package pe.egcc.app.service;

/**
 *
 * @author Gustavo Coronel
 */
public class Clase1 {

  public Clase1() {
    //System.out.println("Hola Gustavo.");
    this("Gustavo, que tal");
  }
  
  public Clase1(String nombre) {
    System.out.println("Hola " + nombre + ".");
  }
  
  public int sumar(int n1, int n2){
    return (n1 + n2);
  }
  
}

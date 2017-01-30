package pe.egcc.geniomate.service;

/**
 *
 * @author Gustavo Coronel
 */
public final class MyMath {

  private MyMath() {
  }

  /**
   * Retorna el factorial.
   * 
   * @param n Número del que se quiere saber su factorial.
   * @return Retorna el factorial de "n".
   */
  public static long factorial(int n){
    long f = 1;
    while(n>1){
      f *= n--;
    }
    return f;
  }
  
  public static int mcd(int n1, int n2){
    return 0;
  }
  
  public static int mcm(int n1, int n2){
    return 0;
  }
  
  /**
   * Retorna los primeros "n" número de la serie de fibonacci.
   * 
   * @param n Cantidad de terminos de la serie.
   * @return Retorna la serie de fibonacci.
   */
  public static String fibonacci(int n){
    return "";
  }
  
  public static boolean esPrimo(int n){
    return false;
  }
  
}

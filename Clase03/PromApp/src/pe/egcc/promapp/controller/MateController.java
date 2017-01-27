package pe.egcc.promapp.controller;

import pe.egcc.lib.Mate;

/**
 *
 * @author Gustavo Coronel
 */
public class MateController {

  private Mate mate;

  public MateController() {
    mate = new Mate();
  }

  public int promediar(int n1, int n2) {
    return mate.promediar(n1, n2);
  }

}

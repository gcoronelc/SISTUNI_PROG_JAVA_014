package pe.egcc.app.model;

/**
 *
 * @author Gustavo Coronel
 */
public class Producto {

  private String nombre;
  private double precio;
  private int stock;
  private boolean activo;

  /**
   * Constructor por defecto.
   */
  public Producto() {
    /*
    this.nombre = "Cerveza";
    this.precio = 10.0;
    this.stock = 1000;
    this.activo = true;
     */
    // LLamada al otro constructor
    this("Inka Cola", 5.0, 10000, true);
    System.out.println("Producto creado.");
  }

  /**
   * Constructor adicional.
   *
   * @param nombre Nombre del producto.
   * @param precio Precio del producto.
   * @param stock Cantidad en stock.
   * @param activo Estado del producto.
   */
  public Producto(String nombre, double precio, int stock, boolean activo) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
    this.activo = activo;
  }

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau producto.");
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public boolean isActivo() {
    return activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }

}

public class Rectangulo extends Figura {
  
  private int alto;
  private int ancho;
  
  public Rectangulo(int alto, int ancho, int x, int y) {
    super(x, y);
    this.alto = alto;
    this.ancho = ancho;
  }
  
  public void setAlto(int alto) {
    this.alto = alto;
  }
  
  public int getAlto() {
    return alto;
  }
  
  public void setAncho(int ancho) {
    this.ancho = ancho;
  }
  
  public int getAncho() {
    return ancho;
  }
  
  public double calcularArea() {
    return alto * ancho;
  }
  
}//fin de clase
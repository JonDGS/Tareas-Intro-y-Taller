public class Circulo extends Figura {
  
  private int radio;
  
  public Circulo(int radio, int x, int y) {
    super(x, y);
    this.radio = radio;
  }
  
  public void setRadio(int radio) {
    this.radio = radio;
  }
  
  public int getRadio() {
    return radio;
  }
  
  public double calcularArea() {
    return Math.PI * (radio * radio);
  }
}//fin de clase
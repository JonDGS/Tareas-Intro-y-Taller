public abstract class Figura {
  
  private int x;
  private int y;
  
  public Figura(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  public void setX(int x) {
    this.x = x;
  }
  
  public int getX() {
    return x;
  }
  
  public void setY(int y) {
    this.y = y;
  }
  
  public int getY() {
    return y;
  }
  
  public abstract double calcularArea();
  
}
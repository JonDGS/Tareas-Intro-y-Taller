import javax.swing.JOptionPane;

public class Principal {
  
  public static void main(String args[]) {
    int alto, ancho, radio, x, y;
    
    x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese x"));
    
    while(x <= 0 || x >= 1024) {
      x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese x, debe ser mayor que 0 y menor que 1024"));
    }
    
    y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese y"));
    
    while(y <= 0 || y >= 768) {
      x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese y, debe ser mayor que 0 y menor que 768"));
    }
    
    alto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese alto"));
    ancho = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ancho"));
    radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese radio"));
    
    Rectangulo rectangulo = new Rectangulo(alto, ancho, x, y);
    Circulo circulo = new Circulo(radio, x, y);
    
    System.out.println(rectangulo.calcularArea());
    System.out.println(circulo.calcularArea());
  }//main
  
}//fin de clase
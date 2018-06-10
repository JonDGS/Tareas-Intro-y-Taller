package tarea9;
import java.util.Scanner;
public class Serie {
    int n;
    int suma;
    public Serie(){
        this.n = -1;
        this.suma = 0;  
    }
    public void generar(){
        while(n != 0){
            Scanner input = new Scanner(System.in);
            System.out.print("Digite el numero que desea sumar: ");
            n = input.nextInt();
            suma += n;
        }
        System.out.println("El valor de la suma es: " + suma);
        
    }
    
}

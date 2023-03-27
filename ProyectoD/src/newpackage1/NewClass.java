
package newpackage1;

import java.util.Scanner;
import newpackage.Rectangulo;

public class NewClass {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo:");
        int a = leer.nextInt();
        r1.setBase(a);
        System.out.println("Ingrese la altura del rectangulo");
        int b =leer.nextInt();
        r1.setAltura(b);
        
        int sup=r1.get_superficie();
        int per=r1.get_perimitro();
        r1.dibujo(a,b);
        
    }
    
}

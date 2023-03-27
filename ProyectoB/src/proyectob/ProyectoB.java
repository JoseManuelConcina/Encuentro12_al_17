
package proyectob;

import java.util.Scanner;
import proyectob.newpackage.Circunferencia;


public class ProyectoB {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un Radio en Cm : "); 
        
        Circunferencia c1 = new Circunferencia();
        c1.setRadio(leer.nextDouble());
        System.out.println("El area del circulo es de :"+c1.getRadio()+" Cm");
        System.out.println("El perimetro del circulo es : "+c1.getPerimetro()+ "Cm");
}
}
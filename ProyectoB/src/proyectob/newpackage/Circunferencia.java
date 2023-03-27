
package proyectob.newpackage;

import static java.lang.Math.PI;

public class Circunferencia {
    private double radio;
    private double area;
    private double perimetro;  
  
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        double area = Math.PI * Math.pow(radio, 2) ;
        return area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getPerimetro() {
        perimetro = 2 * PI * radio;
        return perimetro;
    }
    
    
    
}

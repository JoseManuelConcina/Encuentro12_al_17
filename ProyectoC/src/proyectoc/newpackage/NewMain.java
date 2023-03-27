
package proyectoc.newpackage;

import proyectoc.Operacion;

public class NewMain {

    public static void main(String[] args) {
        Operacion operacion1 = new Operacion();
        operacion1.crearOperacion();
        int suma = operacion1.getSumar();
        int resta  = operacion1.getRestar();
        int producto = operacion1.getmultiplicar();
        double divicion = operacion1.getdividir();
        
        
    }
    
}

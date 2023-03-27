
package proyectoa;

import proyectoa.individuos.Personas;

public class ProyectoA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Personas p1 = new Personas("Juan","M", "34.543.543",1.90, 90);
       
     /*   p1.altura = 1.90;
        p1.dni = leer.next();
        System.out.println("Ingrese su peso:");
 p1.peso = leer.nextDouble();     
        */
     
       
        System.out.println(p1.nombre+" "+p1.sexo+" "+p1.dni+" "+p1.altura+" "+p1.peso);
        
        

    }

    
}

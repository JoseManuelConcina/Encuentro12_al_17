
package proyectof;

import java.util.ArrayList;
import newpackage.Cocina;

public class ProyectoF {

    public static void main(String[] args) {
        ArrayList<Cocina> listaDeRecetas=new ArrayList<Cocina>();
        Cocina c1 = new Cocina("Harina", 0.50 , "mezclar ", 12 );
        Cocina c2 = new Cocina("Huevo",3, "hervir",2);
        Cocina c3 = new Cocina("salchicha",6,"asar",10);
        Cocina c4 =new Cocina();
        
        listaDeRecetas.add(c1);
        listaDeRecetas.add(c2);
        listaDeRecetas.add(c3);
        
        for (int i = 0; i < listaDeRecetas.size(); i++) {
            System.out.println(listaDeRecetas.get(i));
        }
        System.out.println("-------------------------------------------------------------------------------");
        c4.nuevasRecetas();
        
        listaDeRecetas.add(c4);
        
         for (int i = 0; i < listaDeRecetas.size(); i++) {
            System.out.println(listaDeRecetas.get(i));
        }
        
    }
    
}

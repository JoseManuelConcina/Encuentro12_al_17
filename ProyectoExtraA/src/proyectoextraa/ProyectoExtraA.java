package proyectoextraa;

import java.util.Scanner;
import newpackage.Cancion;

public class ProyectoExtraA {

    public static void main(String[] args) {
        Cancion c1 = new Cancion();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de una cancion :");
        String a = leer.nextLine();
        c1.setTitulo(a);
        System.out.println("Ingrese el autor de la cancion :");
        String b = leer.nextLine();
        c1.setAutor(b);
        c1.llenado(a, b);
    }

}

package proyectoejercicioextra;

import newpackage.Producto;

public class ProyectoEjercicioExtra {

    public static void main(String[] args) {
        /*
        Crear una clase llamada Producto que contenga los siguientes atributos:
        nombre, código, stock y precio. A continuación crear los siguientes métodos:
- Método constructor vacio y constructor con todos los atributos pasados por parámetro
- Método get y set para cada atributo
- Método crearProducto(): pide los datos al usuario y lo guarda en los diferentes atributos
- Método venderProducto(): pide al usuario que ingrese una cantidad del producto y lo mismo
        se debe restar del atributo stock
- Método cambiarPrecio(): pide al usuario un nuevo precio y lo asigna al atributo
- Método mostrarProducto(): mostrar el nombre, código, stock y precio del producto
         */
        Producto p1 = new Producto();
        p1.crearProducto();
        System.out.println("-------------------------------------------------");
        p1.metodoMostrar();
        System.out.println("-------------------------------------------------");
        p1.cambiarPrecio();
        System.out.println("-------------------------------------------------");
        p1.venderProducto();
        System.out.println("-------------------------------------------------");
        p1.metodoMostrar();
    }

}
